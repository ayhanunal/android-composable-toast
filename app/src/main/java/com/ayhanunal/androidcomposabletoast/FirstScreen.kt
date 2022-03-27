package com.ayhanunal.androidcomposabletoast

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ayhanunal.composable_toast.util.ComposableToastUtil
import com.ayhanunal.composable_toast.util.ComposableToastUtil.ErrorComposableToast
import com.ayhanunal.composable_toast.util.ComposableToastUtil.SuccessComposableToast

@Composable
fun FirstScreen() {

    var successToast by remember { mutableStateOf(false) }
    var errorToast by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(modifier = Modifier.padding(12.dp), onClick = {
            successToast = true
        }) {
            Text("Success Toast")
        }

        Button(modifier = Modifier.padding(12.dp), onClick = {
            errorToast = true
        }) {
            Text("Error Toast")
        }

    }

    if (successToast) {
        successToast = false
        SuccessComposableToast(message = "your transaction was successful", duration = Toast.LENGTH_SHORT, padding = PaddingValues(bottom = 8.dp), contentAlignment = Alignment.BottomCenter)
    }

    if (errorToast) {
        errorToast = false
        ErrorComposableToast(message = "an unexpected error occurred", duration = Toast.LENGTH_SHORT, padding = PaddingValues(bottom = 8.dp), contentAlignment = Alignment.BottomCenter)
    }


}