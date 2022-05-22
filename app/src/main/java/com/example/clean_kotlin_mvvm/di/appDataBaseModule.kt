package com.example.clean_kotlin_mvvm.di

import androidx.room.Room
import com.example.clean_kotlin_mvvm.db.AppDataBase
import com.example.clean_kotlin_mvvm.utill.Const
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val appDataBaseModule = module {
    single { Room.databaseBuilder(androidContext(), AppDataBase::class.java, Const.DataBase.APP_DATA_BASE_NAME) }
}