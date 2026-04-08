package com.example.ecommerceapp.ui.home;

import androidx.compose.foundation.layout.*;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.*;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.navigation.NavController;
import com.example.ecommerceapp.data.model.Product;
import com.example.ecommerceapp.ui.auth.AuthViewModel;
import com.example.ecommerceapp.ui.navigation.Screen;
import com.example.ecommerceapp.utils.Resource;

@kotlin.Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u001e\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0007\u00a8\u0006\r"}, d2 = {"HomeScreen", "", "navController", "Landroidx/navigation/NavController;", "viewModel", "Lcom/example/ecommerceapp/ui/home/HomeViewModel;", "authViewModel", "Lcom/example/ecommerceapp/ui/auth/AuthViewModel;", "ProductCard", "product", "Lcom/example/ecommerceapp/data/model/Product;", "onClick", "Lkotlin/Function0;", "app_debug"})
public final class HomeScreenKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void HomeScreen(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.ui.home.HomeViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.ui.auth.AuthViewModel authViewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ProductCard(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.data.model.Product product, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
}