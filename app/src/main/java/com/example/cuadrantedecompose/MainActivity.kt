package com.example.cuadrantedecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantedecompose.ui.theme.CuadranteDeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteDeComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CuadranteEntero()
                }
            }
        }
    }
}

@Composable
fun CuadranteEntero(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier.fillMaxSize()
    )
    {
        Row(
            modifier = modifier.weight(1f)
        )
         {
            CuadranteUno(modifier.weight(1f).fillMaxHeight())
            CuadranteDos(modifier.weight(1f).fillMaxHeight())
        }
        Row(
            modifier = modifier.weight(1f)
        ) {
            CuadranteTres(modifier.weight(1f).fillMaxHeight())
            CuadranteCuatro(modifier.weight(1f).fillMaxHeight())
        }
    }
}

@Composable
fun CuadranteUno(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(Color(0xFFEADDFF))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    )
    {
        Text(
            text = "Text composable",
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Displays text and follows the recommended Material Design guidelines.",
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun CuadranteDos(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(Color(0xFFD0BCFF))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    )
    {
        Text(
            text = "Image composable",
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Creates a composable that lays out and draws a given Painter class object.",
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun CuadranteTres(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(Color(0xFFB69DF8))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    )
    {
        Text(
            text = "Row composable",
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "A layout composable that places its children in a horizontal sequence.",
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun CuadranteCuatro(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(Color(0xFFF6EDFF))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    )
    {
        Text(
            text = "Column composable",
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "A layout composable that places its children in a vertical sequence.",
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadranteDeComposeTheme {
        CuadranteEntero()
    }
}