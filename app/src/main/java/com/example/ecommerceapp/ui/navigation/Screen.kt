package com.example.ecommerceapp.ui.navigation

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Register : Screen("register")
    object Home : Screen("home")
    object Favorites : Screen("favorites")
    object UploadProduct : Screen("upload")
    object ProductDetail : Screen("product_detail/{productId}") {
        fun createRoute(id: String) = "product_detail/$id"
    }
    object RecommendedDetail : Screen("recommended_detail/{productId}") {
        fun createRoute(id: Int) = "recommended_detail/$id"
    }
}
