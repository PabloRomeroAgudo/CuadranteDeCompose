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
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
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
            Cuadrante(stringResource(R.string.title1), stringResource(R.string.parrafo1), 0xFFEADDFF,
                modifier
                    .weight(1f)
                    .fillMaxHeight())
            Cuadrante(
                stringResource(R.string.title2), stringResource(R.string.parrafo2), 0xFFD0BCFF,
                modifier
                    .weight(1f)
                    .fillMaxHeight())
        }
        Row(
            modifier = modifier.weight(1f)
        ) {
            Cuadrante(
                stringResource(R.string.title3), stringResource(R.string.parrafo3),0xFFB69DF8,
                modifier
                    .weight(1f)
                    .fillMaxHeight())
            Cuadrante(
                stringResource(R.string.title4), stringResource(R.string.parrafo4), 0xFFF6EDFF,
                modifier
                    .weight(1f)
                    .fillMaxHeight())
        }
    }
}

@Composable
fun Cuadrante(title: String, parrafo: String, color: Long, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(Color(color))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    )
    {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = parrafo,
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