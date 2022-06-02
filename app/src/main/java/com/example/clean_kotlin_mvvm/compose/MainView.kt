package com.example.clean_kotlin_mvvm.compose

import android.widget.Toolbar
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController


@Preview
@Composable
fun MainScreen(){
    var isVisible by remember { mutableStateOf(true) }
    val focusRequest = remember { FocusRequester() }
        Row(modifier = Modifier.run {
            fillMaxSize()
            background(Color.Green)
        }) {
            Column(modifier = Modifier.run {
                align(Alignment.CenterVertically)
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
        }

    SideEffect {
        if (isVisible) focusRequest.requestFocus()
    }



}


@Preview
@Composable
fun MyToolBar(){
    Column {
        TopAppBar(
            elevation = 4.dp,
            backgroundColor = MaterialTheme.colors.primaryVariant,
        ){

        }

    }
}