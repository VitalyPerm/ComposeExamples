package com.example.composeexamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Ocho : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable
fun OchoView() {
    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn {
            items(5) {
                Text(
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    text = "item $it",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 24.dp)
                )
            }
        }
        LazyColumn {
            itemsIndexed(
                listOf("Hey", "I", "Learn", "JetPAck", "Compose")
            ) { index, item ->
                Text(
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    text = "$item",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 24.dp)
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun OchoPreview() {
    OchoView()
}