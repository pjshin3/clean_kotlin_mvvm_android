package com.example.clean_kotlin_mvvm.db

import androidx.room.Database
import androidx.room.DatabaseConfiguration
import androidx.room.InvalidationTracker
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteOpenHelper
import com.example.clean_kotlin_mvvm.entity.SampleEntity

@Database(entities = [SampleEntity::class], version = 1)
abstract class AppDataBase: RoomDatabase(){
}