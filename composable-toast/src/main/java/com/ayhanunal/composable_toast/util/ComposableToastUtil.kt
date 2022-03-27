package com.ayhanunal.composable_toast.util

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ayhanunal.composable_toast.ComposableToast
import com.ayhanunal.composable_toast.theme.WhiteColor
import com.ayhanunal.composable_toast.type.Error
import com.ayhanunal.composable_toast.type.Success

object ComposableToastUtil {

    @Composable
    fun SuccessComposableToast(
        message: String,
        duration: Int = Toast.LENGTH_LONG,
        padding: PaddingValues = PaddingValues(0.dp),
        contentAlignment: Alignment = Alignment.BottomCenter
    ) {
        val sweetSuccessToast = ComposableToast(LocalContext.current)
        sweetSuccessToast.MakeComposableToast(
            message = message,
            duration = duration,
            type = Success(),
            padding = padding,
            contentAlignment = contentAlignment
        )
        sweetSuccessToast.show()
    }

    @Composable
    fun ErrorComposableToast(
        message: String,
        duration: Int = Toast.LENGTH_LONG,
        padding: PaddingValues = PaddingValues(0.dp),
        contentAlignment: Alignment = Alignment.BottomCenter
    ) {
        val sweetErrorToast = ComposableToast(LocalContext.current)
        sweetErrorToast.MakeComposableToast(
            message = message,
            duration = duration,
            type = Error(),
            padding = padding,
            contentAlignment = contentAlignment
        )
        sweetErrorToast.show()
    }

    @Composable
    fun InitView(
        messageTxt: String,
        resourceIcon: Int,
        backgroundColor: Color,
        padding: PaddingValues,
        contentAlignment: Alignment
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            contentAlignment = contentAlignment
        ) {
            Surface(
                modifier = Modifier
                    .wrapContentSize(),
                color = Color.Transparent
            ) {
                Column(
                    modifier = Modifier
                        .background(
                            color = backgroundColor,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(horizontal = 32.dp, vertical = 8.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        modifier = Modifier.padding(8.dp, 0.dp, 8.dp, 0.dp).size(25.dp, 25.dp),
                        painter = painterResource(id = resourceIcon),
                        contentDescription = "",
                    )
                    Text(
                        text = messageTxt,
                        textAlign = TextAlign.Center,
                        fontSize = 16.sp,
                        style = TextStyle(color = WhiteColor),
                        modifier = Modifier.padding(0.dp, 0.dp, 8.dp, 0.dp)
                    )
                }
            }
        }
    }

}