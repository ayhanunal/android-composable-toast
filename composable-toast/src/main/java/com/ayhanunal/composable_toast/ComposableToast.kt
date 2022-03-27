package com.ayhanunal.composable_toast

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.*
import androidx.lifecycle.*
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import androidx.savedstate.ViewTreeSavedStateRegistryOwner
import com.ayhanunal.composable_toast.util.ComposableToastProperty
import com.ayhanunal.composable_toast.util.ComposableToastUtil

class ComposableToast(context: Context) : Toast(context) {

    @Composable
    fun MakeComposableToast(
        message: String,
        duration: Int = LENGTH_LONG,
        type: ComposableToastProperty,
        padding: PaddingValues,
        contentAlignment: Alignment
    ) {
        val context = LocalContext.current

        val views = ComposeView(context)
        views.setContent {
            ComposableToastUtil.InitView(
                messageTxt = message,
                resourceIcon = type.getResourceId(),
                backgroundColor = type.getBackgroundColor(),
                padding = padding,
                contentAlignment = contentAlignment
            )
        }

        ViewTreeLifecycleOwner.set(views, LocalLifecycleOwner.current)
        ViewTreeViewModelStoreOwner.set(views, LocalViewModelStoreOwner.current)
        ViewTreeSavedStateRegistryOwner.set(views, LocalSavedStateRegistryOwner.current)

        this.duration = duration
        this.view = views
    }

}