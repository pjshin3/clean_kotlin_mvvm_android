package com.example.clean_kotlin_mvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.navigation.compose.rememberNavController
import com.example.clean_kotlin_mvvm.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : ComponentActivity() {

    private val viewModel by viewModel<MainViewModel>(owner = this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}