package com.example.ejemplo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejemplo1.ui.theme.Ejemplo1Theme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejemplo1Theme {
                GreetingPreview()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview(){
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            SimpleImage()
            TextField()
            TextField2()
            SimpleButton()
        }



}

@Composable
fun SimpleImage() {
    Image(
        painter = painterResource(id = R.drawable.dboi),
        contentDescription = "Andy Rubin",
        modifier = Modifier.fillMaxWidth()
            .padding(top= 50.dp)
    )
}

@Composable
fun TextField() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    Column(
        modifier = Modifier.padding(top = 30.dp, bottom = 20.dp)
    ) {
        TextField(
            value = text,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChange = { it ->
                text = it
            },
            label = { Text(text = "Valor 1") },
            placeholder = { Text(text = "Teclea el primer valor") },
        )
    }
}

@Composable
fun TextField2() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    Column(
        modifier = Modifier.padding(top = 10.dp, bottom = 20.dp)
    ) {
        TextField(
            value = text,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChange = { it ->
                text = it
            },
            label = { Text(text = "Valor 2") },
            placeholder = { Text(text = "Teclea el segundo valor") },
        )
    }
}

@Composable
fun SimpleButton() {
    Button(onClick = {
        //your onclick code here
    },
        colors = ButtonDefaults.buttonColors(Color.Blue))
    {
        Text(text = "Calcular", color = Color.White)
    }
}