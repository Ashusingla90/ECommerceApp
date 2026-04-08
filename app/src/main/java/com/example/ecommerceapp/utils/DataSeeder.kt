package com.example.ecommerceapp.utils

import com.example.ecommerceapp.data.model.Product
import com.google.firebase.Timestamp
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await
import kotlin.random.Random

object DataSeeder {

    private val categories = listOf(
        CategoryData("Electronics", listOf("Smartphone", "Laptop", "Smartwatch", "Wireless Earbuds", "Tablet", "LED TV")),
        CategoryData("Fashion", listOf("T-Shirt", "Jeans", "Sneakers", "Kurta", "Saree", "Jacket", "Sunglasses")),
        CategoryData("Home", listOf("Bedsheet", "Coffee Maker", "Desk Lamp", "Wall Clock", "Blender", "Cushion Cover")),
        CategoryData("Beauty", listOf("Face Wash", "Moisturizer", "Lipstick", "Perfume", "Hair Serum"))
    )

    private val adjectives = listOf("Premium", "Exclusive", "Stylish", "Ultra-thin", "Classic", "Modern", "Heavy Duty", "Sleek", "Elegant", "Comfortable")
    private val brands = listOf("Nova", "Aura", "Zenith", "Pioneer", "Apex", "Verve", "Lumina", "Nexus", "Elevate")
    
    private fun generateRandomProducts(count: Int): List<Product> {
        val products = mutableListOf<Product>()
        
        for (i in 1..count) {
            val category = categories.random()
            val itemType = category.items.random()
            val adjective = adjectives.random()
            val brand = brands.random()
            
            val title = "$brand $adjective $itemType"
            val price = when (category.name) {
                "Electronics" -> Random.nextDouble(4999.0, 89999.0)
                "Fashion" -> Random.nextDouble(499.0, 4999.0)
                "Home" -> Random.nextDouble(999.0, 14999.0)
                "Beauty" -> Random.nextDouble(199.0, 3999.0)
                else -> Random.nextDouble(500.0, 5000.0)
            }
            
            // Format price to 2 decimal places
            val formattedPrice = Math.round(price * 100.0) / 100.0
            
            // Map item types to loremflickr keyword to fetch a relevant image
            val imageKeyword = itemType.split(" ").last().lowercase()
            
            products.add(
                Product(
                    id = "",
                    title = title,
                    description = "Experience the best quality with this $brand $itemType. Perfectly designed for your everyday needs. $adjective style and durable build quality. 100% genuine product.",
                    price = formattedPrice,
                    imageUrls = listOf("https://picsum.photos/seed/$imageKeyword$i/400/400"),
                    uploaderId = "seed_user_flipkart_${Random.nextInt(1, 10)}",
                    uploaderName = "$brand Official Store",
                    uploaderContact = "support@${brand.lowercase()}.com",
                    uploadedAt = Timestamp.now()
                )
            )
        }
        
        return products
    }

    /**
     * Seeds the Firestore 'products' collection with 50 dynamically generated dummy products.
     * Returns the number of products successfully seeded.
     */
    suspend fun seedProducts(firestore: FirebaseFirestore): Result<Int> {
        return try {
            val collection = firestore.collection(Constants.PRODUCTS_COLLECTION)

            // Check if data already exists to avoid duplicate seeding
            val existing = collection.limit(1).get().await()
            if (!existing.isEmpty) {
                return Result.success(0) // Already has data, skip seeding
            }

            val dummyProducts = generateRandomProducts(50)
            var count = 0
            for (product in dummyProducts) {
                val docRef = collection.document()
                val productWithId = product.copy(id = docRef.id)
                docRef.set(productWithId).await()
                count++
            }
            Result.success(count)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    /**
     * Force-seeds data even if products already exist.
     */
    suspend fun forceSeedProducts(firestore: FirebaseFirestore): Result<Int> {
        return try {
            val collection = firestore.collection(Constants.PRODUCTS_COLLECTION)
            val dummyProducts = generateRandomProducts(50)
            var count = 0
            for (product in dummyProducts) {
                val docRef = collection.document()
                val productWithId = product.copy(id = docRef.id)
                docRef.set(productWithId).await()
                count++
            }
            Result.success(count)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}

data class CategoryData(val name: String, val items: List<String>)
