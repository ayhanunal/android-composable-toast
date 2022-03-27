package com.ayhanunal.composable_toast.util

import androidx.compose.ui.graphics.Color

interface ComposableToastProperty {
    fun getResourceId(): Int
    fun getBackgroundColor(): Color
}