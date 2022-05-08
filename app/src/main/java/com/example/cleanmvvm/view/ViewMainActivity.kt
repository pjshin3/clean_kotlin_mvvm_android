package com.example.cleanmvvm.view

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class ViewMainActivity {
    @Preview
    @Composable
    fun tmpText(text: String = ""){
        Text(text = text)
    }
}