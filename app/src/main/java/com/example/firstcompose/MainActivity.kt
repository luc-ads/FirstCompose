package com.example.firstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstcompose.ui.theme.FirstComposeTheme
import androidx.compose.foundation.Canvas
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.unit.Dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

fun DrawScope.circle(offset: (Float) -> Offset) {
    val radiusToDots = Dp(20f).value
    drawCircle(
        Color.Black,
        radius = radiusToDots,
        center = offset(radiusToDots)
    )
}

fun DrawScope.center() {
    circle {
        Offset(size.width / 2, size.height / 2)
    }
}
fun DrawScope.topRight() {
    circle {
        Offset(size.width - it, it * 2)
    }
}

fun DrawScope.topLeft() {
    circle {
        Offset(Dp(40f).value, Dp(40f).value)
    }
}

fun DrawScope.bottomLeft() {
    circle {
        Offset(Dp(40f).value, size.height - Dp(20f).value)
    }
}

fun DrawScope.bottomRight() {
    circle {
        Offset(size.width - Dp(20f).value, size.height - Dp(20f).value)
    }
}

fun DrawScope.bullet(numberToDots: Int) {
    when (numberToDots) {
        1 -> {
            center()
        }
        2 -> {
            topRight()
            bottomLeft()
        }
        3 -> {
            bottomLeft()
            center()
            topRight()
        }
        4 -> {
            topRight()
            topLeft()
            bottomRight()
            bottomLeft()
        }
        5 -> {
            topRight()
            topLeft()
            bottomRight()
            bottomLeft()
            center()
        }
    }
}

@Composable
fun Dice(numberDots: Int, modifier: Modifier) {
    Canvas(
        modifier = modifier
            .size(96.dp, 96.dp)
    ) {
        drawRoundRect(
            Color.White,
            cornerRadius = CornerRadius(20f, 20f),
            topLeft = Offset(10f, 10f),
            size = size
        )

        bullet(numberToDots = numberDots)

    }
}

@Composable
fun App() {
//    Box(modifier = Modifier
//        .fillMaxSize()
//        .background(Color.Blue)
//    ) {
//
//        Dice(5, modifier = Modifier.align(Alignment.Center))
//
//        Button(onClick = { }, modifier = Modifier
//            .align(Alignment.Center)
//            .offset(y = 100.dp)) {
//            Text("Jogar")
//        }
//    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirstComposeTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            App()
        }
    }
}