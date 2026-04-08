package com.example.ecommerceapp.repository

import com.example.ecommerceapp.data.model.User
import com.example.ecommerceapp.utils.Constants
import com.example.ecommerceapp.utils.Resource
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthRepository @Inject constructor(
    private val auth: FirebaseAuth,
    private val firestore: FirebaseFirestore
) {
    fun getCurrentUser(): FirebaseUser? = auth.currentUser

    fun loginUser(email: String, password: String): Flow<Resource<FirebaseUser>> = flow {
        emit(Resource.Loading())
        try {
            val result = auth.signInWithEmailAndPassword(email, password).await()
            if (result.user != null) {
                emit(Resource.Success(result.user!!))
            } else {
                emit(Resource.Error("User not found"))
            }
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Login failed"))
        }
    }

    fun registerUser(email: String, password: String, name: String): Flow<Resource<FirebaseUser>> = flow {
        emit(Resource.Loading())
        try {
            val result = auth.createUserWithEmailAndPassword(email, password).await()
            result.user?.let { firebaseUser ->
                // Create user profile in Firestore
                val user = User(
                    uid = firebaseUser.uid,
                    name = name,
                    email = email,
                    profileImageUrl = ""
                )
                firestore.collection(Constants.USERS_COLLECTION)
                    .document(firebaseUser.uid)
                    .set(user)
                    .await()
                
                emit(Resource.Success(firebaseUser))
            } ?: emit(Resource.Error("User creation failed"))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Registration failed"))
        }
    }

    fun logoutUser() {
        auth.signOut()
    }
}
