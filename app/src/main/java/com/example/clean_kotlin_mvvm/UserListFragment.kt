package com.example.clean_kotlin_mvvm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import com.example.clean_kotlin_mvvm.compose.MainScreen
import com.example.clean_kotlin_mvvm.compose.MyToolBar

class UserListFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).also {
            it.setContent {

            }
        }
    }
}