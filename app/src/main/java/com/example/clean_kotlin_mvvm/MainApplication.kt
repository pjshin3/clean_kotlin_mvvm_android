package com.example.clean_kotlin_mvvm

import android.app.Application
import com.example.clean_kotlin_mvvm.di.appDataBaseModule
import com.example.clean_kotlin_mvvm.di.viewModelModule
import org.koin.core.context.startKoin

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(
                listOf(
                    appDataBaseModule,
                    viewModelModule
                )
            )
        }
    }
}