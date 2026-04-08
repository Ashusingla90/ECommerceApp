package com.example.ecommerceapp.ui.navigation;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/example/ecommerceapp/ui/navigation/Screen;", "", "route", "", "<init>", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "Login", "Register", "Home", "Favorites", "UploadProduct", "ProductDetail", "Lcom/example/ecommerceapp/ui/navigation/Screen$Favorites;", "Lcom/example/ecommerceapp/ui/navigation/Screen$Home;", "Lcom/example/ecommerceapp/ui/navigation/Screen$Login;", "Lcom/example/ecommerceapp/ui/navigation/Screen$ProductDetail;", "Lcom/example/ecommerceapp/ui/navigation/Screen$Register;", "Lcom/example/ecommerceapp/ui/navigation/Screen$UploadProduct;", "app_debug"})
public abstract class Screen {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    
    private Screen(java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/ecommerceapp/ui/navigation/Screen$Favorites;", "Lcom/example/ecommerceapp/ui/navigation/Screen;", "<init>", "()V", "app_debug"})
    public static final class Favorites extends com.example.ecommerceapp.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.ecommerceapp.ui.navigation.Screen.Favorites INSTANCE = null;
        
        private Favorites() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/ecommerceapp/ui/navigation/Screen$Home;", "Lcom/example/ecommerceapp/ui/navigation/Screen;", "<init>", "()V", "app_debug"})
    public static final class Home extends com.example.ecommerceapp.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.ecommerceapp.ui.navigation.Screen.Home INSTANCE = null;
        
        private Home() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/ecommerceapp/ui/navigation/Screen$Login;", "Lcom/example/ecommerceapp/ui/navigation/Screen;", "<init>", "()V", "app_debug"})
    public static final class Login extends com.example.ecommerceapp.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.ecommerceapp.ui.navigation.Screen.Login INSTANCE = null;
        
        private Login() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u00a8\u0006\u0007"}, d2 = {"Lcom/example/ecommerceapp/ui/navigation/Screen$ProductDetail;", "Lcom/example/ecommerceapp/ui/navigation/Screen;", "<init>", "()V", "createRoute", "", "id", "app_debug"})
    public static final class ProductDetail extends com.example.ecommerceapp.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.ecommerceapp.ui.navigation.Screen.ProductDetail INSTANCE = null;
        
        private ProductDetail() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String createRoute(@org.jetbrains.annotations.NotNull()
        java.lang.String id) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/ecommerceapp/ui/navigation/Screen$Register;", "Lcom/example/ecommerceapp/ui/navigation/Screen;", "<init>", "()V", "app_debug"})
    public static final class Register extends com.example.ecommerceapp.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.ecommerceapp.ui.navigation.Screen.Register INSTANCE = null;
        
        private Register() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/ecommerceapp/ui/navigation/Screen$UploadProduct;", "Lcom/example/ecommerceapp/ui/navigation/Screen;", "<init>", "()V", "app_debug"})
    public static final class UploadProduct extends com.example.ecommerceapp.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.ecommerceapp.ui.navigation.Screen.UploadProduct INSTANCE = null;
        
        private UploadProduct() {
        }
    }
}