package com.example.clean_kotlin_mvvm.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun MainScreen(){

    var isVisible by remember { mutableStateOf(true) }
    val focusRequest = remember { FocusRequester() }
        Row(modifier = Modifier.run {
            fillMaxSize()
            background(Color.Green)
        }) {

            ClickableText(modifier = Modifier.run {
                padding(Dimens.PaddingXLarge)
            }, text = AnnotatedString( "click me!!"),
                onClick = { offset ->
                    isVisible = !isVisible
                })


            if (isVisible){
                Text(modifier = Modifier.focusRequester(focusRequest),
                    text = if (isVisible) "VISIBLE" else "INVISIBLE")
            }
        }

    SideEffect {
        if (isVisible) focusRequest.requestFocus()
    }



}
