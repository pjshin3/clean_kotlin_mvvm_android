package com.example.clean_kotlin_mvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import com.example.clean_kotlin_mvvm.view.MainView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = MainView()
        setContent {
            MaterialTheme {
                view.HelloWorldText()
            }
        }
    }
}