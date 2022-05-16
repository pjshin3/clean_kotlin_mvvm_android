package com.example.clean_kotlin_mvvm.di

import com.example.clean_kotlin_mvvm.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.named
import org.koin.dsl.module

val viewModelModule = module {
    viewModelOf (::MainViewModel){
        named("MainViewModel")
    }
}