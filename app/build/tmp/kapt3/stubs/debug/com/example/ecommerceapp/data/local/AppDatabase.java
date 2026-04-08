package com.example.ecommerceapp.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.example.ecommerceapp.data.local.dao.FavoriteDao;
import com.example.ecommerceapp.data.local.entity.FavoriteEntity;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/ecommerceapp/data/local/AppDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "favoriteDao", "Lcom/example/ecommerceapp/data/local/dao/FavoriteDao;", "app_debug"})
@androidx.room.Database(entities = {com.example.ecommerceapp.data.local.entity.FavoriteEntity.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.ecommerceapp.data.local.dao.FavoriteDao favoriteDao();
}