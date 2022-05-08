package com.example.cleanmvvm

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.cleanmvvm.view.ViewMainActivity

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val view = ViewMainActivity()
        setContent { tmpText("테스트 입니다") }
    }

    @Preview
    @Composable
    fun tmpText(text: String = ""){
        Text(text = text)
    }
}