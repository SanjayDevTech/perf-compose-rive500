package com.android.rive

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import app.rive.runtime.kotlin.RiveAnimationView
import com.android.rive.ui.theme.TestComposePerformanceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val multipliedRiveObjects = buildList {
            addAll(riveObjects)
            addAll(riveObjects)
            addAll(riveObjects)
            addAll(riveObjects)
            addAll(riveObjects)
            addAll(riveObjects)
            addAll(riveObjects)
            addAll(riveObjects)
            addAll(riveObjects)
            addAll(riveObjects)
        }
        println(riveObjects.size)
        setContent {
            TestComposePerformanceTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                            .verticalScroll(rememberScrollState())
                    ) {
                        Text(text = "Start Animations")
                        Items(multipliedRiveObjects) { riveObj ->
                            AndroidView(factory = {
                                RiveAnimationView(it).apply {
                                    println(riveObj)
                                    setRiveResource(
                                        riveObj.resId,
                                        stateMachineName = riveObj.stateMachineName,
                                        artboardName = riveObj.artboardName
                                    )
                                }
                            }, modifier = Modifier.size(120.dp))
                        }
                        Text(text = "End Animations")
                    }
                }
            }
        }
    }
}

@Composable
inline fun <T> Items(
    items: List<T>,
    crossinline itemContent: @Composable (item: T) -> Unit
) {
    for (item in items.chunked(3)) {
        Row {
            for (i in item) {
                itemContent(i)
            }
        }
    }
}
