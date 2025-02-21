package com.example.ejemplo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.text.input.getSelectedText
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejemplo1.ui.theme.Ejemplo1Theme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreetingPreview()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview(){
    Content()
}

@Composable
fun Content(){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,

    ){
        SimpleImage()
        SimpleButton()
    }
}

@Composable
fun SimpleImage() {
    Image(
        painter = painterResource(id = R.drawable.descuento),
        contentDescription = "DESCUENTOOOOO",
        modifier = Modifier.fillMaxWidth(),
        alignment = Alignment.TopCenter
    )
}

@Composable
fun TextField1():TextFieldValue {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    Column (
        modifier = Modifier.padding(top = 20.dp)
    ){
        TextField(
            value = text,
            onValueChange = {
                text = it
            },
            label = { Text(text = "Costo") },
            placeholder = { Text(text = "Teclea el costo del producto") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
    }
    return text
}

@Composable
fun TextField2():TextFieldValue {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    Column (
        modifier = Modifier.padding(top = 20.dp)
    ){
        TextField(
            value = text,
            onValueChange = {
                text = it
            },
            label = { Text(text = "Descuento") },
            placeholder = { Text(text = "Teclea el descuento del producto") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
    }
    return text
}

@Composable
fun SimpleButton() {
    var costo = TextField1()
    var descuento = TextField2()
    var resultado by remember { mutableStateOf(0.00)}
    var precioFin by remember { mutableStateOf(0.00)}
    Button(
        onClick = { /* Acción al hacer clic */
            val cost = costo.text.toDouble()
            val porc = descuento.text.toDouble()
            resultado = cost * (porc / 100 )
            precioFin = cost - resultado
        },
        colors = ButtonDefaults.buttonColors(Color.Red),
        modifier = Modifier
            .padding(top = 10.dp)

    ) {
        Text("Calcular Descuento")
    }

    Text(
        text = "El precio con descuento es: $precioFin",
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(10.dp)
    )
}