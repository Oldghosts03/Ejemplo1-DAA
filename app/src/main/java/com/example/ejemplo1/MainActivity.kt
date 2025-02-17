package com.example.ejemplo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.ejemplo1.ui.theme.Ejemplo1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejemplo1Theme {

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview(){
    Column {
        Content11()
    }
}

@Composable
fun Content1(){
    Text("ANA SOFIA GONZALEZ VALERIO",
        Modifier
            .padding(32.dp)
            .background(color = Color.Green)
    )
}

@Composable
fun Content2(){
    Text("ANA SOFIA GONZALEZ VALERIO",
        color = Color.Red,
        modifier = Modifier
            .padding(32.dp)
            .background(color = Color.Yellow)
    )
}

@Composable
fun Content3(){
    Text(
        text = "Tamaño de Texto",
        color = Color.White,
        modifier = Modifier
            .padding(32.dp)
            .background(Color.Cyan)
            .size(width=250.dp, height = 100.dp)
    )
}

@Composable
fun Content4(){
    Text(
        text = "Ana Sofia Gonzalez Valerio",
        color = Color.White,
        modifier = Modifier
            .background(Color.Gray)
            .padding(Dp(40f))
            .fillMaxWidth(1f)
    )
}

@Composable
fun Content5(){
    Text(
        text = " Text with 75% Height ",
        color = Color.White,
        modifier = Modifier
            .background(Color.Green)
            .fillMaxHeight(0.75f) //75% area fill
    )
}


@Composable
fun Content6() {
    Box(
        Modifier
            .size(250.dp)
            .alpha(0.9f)//50% opacity
            .background(Color.Red)
    )
}

@Composable
fun Content7() {
    Box(
        Modifier
            .rotate(45f)
            .size(150.dp)
            .background(Color.Red)
    )
}

@Composable
fun Content8() {
    Box(
        Modifier
            .scale(scaleX = 2f, scaleY = 3f)
            .size(200.dp, 200.dp)
            .background(Color.Red)
    )
}

@Composable
fun Content9(){
    Row() {
        Column(
            Modifier.weight(1f).background(Color.Red)){
            Text(text = "Weight = 1", color = Color.White)
        }
        Column(
            Modifier.weight(1f).background(Color.Blue)){
            Text(text = "Weight = 1", color = Color.White)
        }
        Column(
            Modifier.weight(2f).background(Color.Green)
        ) {
            Text(text = "Weight = 2")
        }

    }
}

@Composable
fun Content10() {
    Text(
        text = "Text with Red Border",
        modifier = Modifier
            .padding(10.dp)
            .background(Color.Yellow)
            .border(2.dp,Color.Red)
            .padding(10.dp)
    )
}

@Composable
fun Content11() {
    Text(
        text = "Text with Clipped background",
        color = Color.White,
        modifier = Modifier
            .padding(Dp(10f))
            .clip(RoundedCornerShape(25.dp))
            .background(Color.Blue)
            .padding(Dp(15f))
    )
}