

package com.example.imcindore

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.example.imcindore.ui.theme.ImcindoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImcindoreTheme {
                WebViewScreen()
            }
        }
    }
}

@Composable
fun WebViewScreen() {
    AndroidView(
        factory = { context ->
            WebView(context).apply {
                webViewClient = WebViewClient() // important for in-app navigation
                settings.javaScriptEnabled = true // enable JS for modern websites
                loadUrl("https://imcindore.mp.gov.in/")
            }
        },
        modifier = Modifier.fillMaxSize()
    )
}
