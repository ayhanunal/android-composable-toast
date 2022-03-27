package com.ayhanunal.composable_toast.type

import androidx.compose.ui.graphics.Color
import com.ayhanunal.composable_toast.R
import com.ayhanunal.composable_toast.theme.ColorSuccess
import com.ayhanunal.composable_toast.util.ComposableToastProperty

class Success : ComposableToastProperty {
    override fun getResourceId(): Int = R.drawable.success_icon
    override fun getBackgroundColor(): Color = ColorSuccess
}