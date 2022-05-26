package com.example.clean_kotlin_mvvm.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.Dp
import com.example.clean_kotlin_mvvm.R

object Dimens {
    val PaddingSmall : Dp
    @Composable get() = dimensionResource(id = R.dimen.padding_small)
    val PaddingNormal : Dp
    @Composable get() = dimensionResource(id = R.dimen.padding_normal)
    val PaddingLarge : Dp
    @Composable get() = dimensionResource(id = R.dimen.padding_large)
    val PaddingXLarge : Dp
    @Composable get() = dimensionResource(id = R.dimen.padding_xlarge)
}