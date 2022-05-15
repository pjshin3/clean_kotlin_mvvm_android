package com.example.clean_kotlin_mvvm.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.clean_kotlin_mvvm.R


@Preview
@Composable
fun HelloWorldText(){
    Row(modifier = Modifier.run {
        fillMaxSize()
        background(Color.Green)
    }) {
        Text(modifier = Modifier.run {
            padding(Dimens.PaddingXLarge)
        }, text = "Hello World")
    }
}