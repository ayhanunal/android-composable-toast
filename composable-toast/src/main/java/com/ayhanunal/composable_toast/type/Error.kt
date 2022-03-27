package com.ayhanunal.composable_toast.type

import com.ayhanunal.composable_toast.util.ComposableToastProperty
import androidx.compose.ui.graphics.Color
import com.ayhanunal.composable_toast.R
import com.ayhanunal.composable_toast.theme.ColorError

class Error : ComposableToastProperty {
    override fun getResourceId(): Int = R.drawable.error_icon
    override fun getBackgroundColor(): Color = ColorError
}