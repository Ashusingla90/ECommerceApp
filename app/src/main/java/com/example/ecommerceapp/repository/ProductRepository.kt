package com.example.ecommerceapp.repository

import android.net.Uri
import com.example.ecommerceapp.data.model.Product
import com.example.ecommerceapp.utils.Constants
import com.example.ecommerceapp.utils.Resource
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import com.google.firebase.storage.FirebaseStorage
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await
import java.util.UUID
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProductRepository @Inject constructor(
    private val firestore: FirebaseFirestore,
    private val storage: FirebaseStorage,
    private val auth: FirebaseAuth
) {
    fun getAllProducts(): Flow<Resource<List<Product>>> = flow {
        emit(Resource.Loading())
        try {
            val snapshot = firestore.collection(Constants.PRODUCTS_COLLECTION)
                .orderBy("uploadedAt", Query.Direction.DESCENDING)
                .get()
                .await()
            val products = snapshot.toObjects(Product::class.java)
            emit(Resource.Success(products))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to load products"))
        }
    }

    fun getProductById(productId: String): Flow<Resource<Product>> = flow {
        emit(Resource.Loading())
        try {
            val document = firestore.collection(Constants.PRODUCTS_COLLECTION)
                .document(productId)
                .get()
                .await()
            val product = document.toObject(Product::class.java)
            if (product != null) {
                emit(Resource.Success(product))
            } else {
                emit(Resource.Error("Product not found"))
            }
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to load product"))
        }
    }

    fun getProductsByUser(userId: String): Flow<Resource<List<Product>>> = flow {
        emit(Resource.Loading())
        try {
            val snapshot = firestore.collection(Constants.PRODUCTS_COLLECTION)
                .whereEqualTo("uploaderId", userId)
                .orderBy("uploadedAt", Query.Direction.DESCENDING)
                .get()
                .await()
            val products = snapshot.toObjects(Product::class.java)
            emit(Resource.Success(products))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to load user products"))
        }
    }

    suspend fun uploadProduct(product: Product, imageUris: List<Uri>): Flow<Resource<Boolean>> = flow {
        emit(Resource.Loading())
        try {
            val uid = auth.currentUser?.uid ?: throw Exception("User not authenticated")
            val productId = firestore.collection(Constants.PRODUCTS_COLLECTION).document().id
            
            val uploadedImageUrls = mutableListOf<String>()
            
            for (uri in imageUris) {
                val imageName = UUID.randomUUID().toString()
                val imageRef = storage.reference.child("products/$uid/$productId/$imageName")
                imageRef.putFile(uri).await()
                val downloadUrl = imageRef.downloadUrl.await().toString()
                uploadedImageUrls.add(downloadUrl)
            }
            
            val finalProduct = product.copy(
                id = productId,
                uploaderId = uid,
                imageUrls = uploadedImageUrls
            )
            
            firestore.collection(Constants.PRODUCTS_COLLECTION)
                .document(productId)
                .set(finalProduct)
                .await()
            
            emit(Resource.Success(true))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Upload failed"))
        }
    }

    suspend fun deleteProduct(productId: String): Flow<Resource<Boolean>> = flow {
        emit(Resource.Loading())
        try {
            firestore.collection(Constants.PRODUCTS_COLLECTION).document(productId).delete().await()
            // Note: Ideally delete corresponding images from Storage here too
            emit(Resource.Success(true))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to delete product"))
        }
    }
}
