package com.example.ecommerceapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.ecommerceapp.ui.auth.LoginScreen
import com.example.ecommerceapp.ui.auth.RegisterScreen
import com.example.ecommerceapp.ui.detail.ProductDetailScreen
import com.example.ecommerceapp.ui.detail.RecommendedDetailScreen
import com.example.ecommerceapp.ui.favorites.FavoritesScreen
import com.example.ecommerceapp.ui.home.HomeScreen
import com.example.ecommerceapp.ui.upload.UploadProductScreen
import com.google.firebase.auth.FirebaseAuth

@Composable
fun NavGraph(navController: NavHostController) {
    val startDestination = if (FirebaseAuth.getInstance().currentUser != null) {
        Screen.Home.route
    } else {
        Screen.Login.route
    }

    NavHost(navController = navController, startDestination = startDestination) {
        composable(Screen.Login.route) {
            LoginScreen(navController)
        }
        composable(Screen.Register.route) {
            RegisterScreen(navController)
        }
        composable(Screen.Home.route) {
            HomeScreen(navController)
        }
        composable(Screen.Favorites.route) {
            FavoritesScreen(navController)
        }
        composable(Screen.UploadProduct.route) {
            UploadProductScreen(navController)
        }
        composable(
            route = Screen.ProductDetail.route,
            arguments = listOf(navArgument("productId") { type = NavType.StringType })
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId") ?: return@composable
            ProductDetailScreen(navController, productId)
        }
        composable(
            route = Screen.RecommendedDetail.route,
            arguments = listOf(navArgument("productId") { type = NavType.IntType })
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getInt("productId") ?: return@composable
            RecommendedDetailScreen(navController, productId)
        }
    }
}
