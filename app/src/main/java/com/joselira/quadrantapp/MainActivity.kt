package com.joselira.quadrantapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joselira.quadrantapp.ui.theme.QuadrantAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quadrant()
                }
            }
        }
    }
}

@Composable
fun Quadrant()
{
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            InfoCard(
                stringResource(R.string.first_title),
                stringResource(R.string.first_text),
                colorResource(R.color.first_purple),
                Modifier.weight(1f)
            )
            InfoCard(
                stringResource(R.string.second_title),
                stringResource(R.string.second_text),
                colorResource(R.color.second_purple),
                Modifier.weight(1f)
            )
        }

        Row(
            modifier = Modifier.weight(1f)
        )
        {
            InfoCard(
                stringResource(R.string.third_title),
                stringResource(R.string.third_text),
                colorResource(R.color.third_purple),
                Modifier.weight(1f)
            )
            InfoCard(
                stringResource(R.string.fourth_title),
                stringResource(R.string.fourth_text),
                colorResource(R.color.fourth_purple),
                Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun InfoCard(title: String, description: String, backgroundColor: Color, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp)
    ) {
        Text(
            text = title,
            textAlign = TextAlign.Justify,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)

        )
        Text(
            text = description,
            textAlign = TextAlign.Justify,
        )
    }
}



@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    QuadrantAppTheme {
        Quadrant()
    }
}