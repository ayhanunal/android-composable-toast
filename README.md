[![API](https://img.shields.io/badge/API-23%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=23)
[![Android-Studio](https://img.shields.io/badge/Android%20Studio-2021.1.1+-orange.svg?style=flat)](https://developer.android.com/studio/)
![Language](https://img.shields.io/badge/language-Kotlin-orange.svg)

<h1 align="center"> Composable Toast </h1>

<p align="center">
Customizable Toast Library written with Android Jetpack Compose
</p>

<p align="center">
  <img src='https://github.com/ayhanunal/android-composable-toast/blob/main/ss/success.png' width=300 heihgt=300> 
  <img src='https://github.com/ayhanunal/android-composable-toast/blob/main/ss/error.png' width=300 heihgt=300>
</p>

### Success Toast Usage
```kotlin
SuccessComposableToast(
  message = "your transaction was successful", 
  duration = Toast.LENGTH_SHORT, 
  padding = PaddingValues(bottom = 8.dp), 
  contentAlignment = Alignment.BottomCenter
)
```

### Error Toast Usage
```kotlin
ErrorComposableToast(
  message = "an unexpected error occurred", 
  duration = Toast.LENGTH_SHORT, 
  padding = PaddingValues(bottom = 8.dp), 
  contentAlignment = Alignment.BottomCenter
)
```

### Parameters
<p>
  <ul>
    <li> message : information message </li>
    <li> duration : How long the toast message will stay on the screen </li>
    <li> padding : Padding for message box </li>
    <li> contentAlignment : Specify in which position the toast message will appear on the screen </li>
  </ul>
</p>



