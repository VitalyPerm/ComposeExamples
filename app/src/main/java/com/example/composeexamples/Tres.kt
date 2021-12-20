package com.example.composeexamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Tres : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable
fun TresView() {
    Column(
        modifier = Modifier
            .background(Color.Gray)
            .fillMaxHeight(0.5f)
            .fillMaxWidth()
            .padding(top = 50.dp)
            .border(5.dp, Color.Cyan)
            .padding(5.dp)
            .border(5.dp, Color.Black)
            .padding(45.dp)
            .border(10.dp, Color.LightGray)
    ) {
        Text(
            text = "Hello", Modifier
                .padding(20.dp)
                .border(5.dp, Color.Cyan)
                .offset(20.dp, 20.dp)
                .clickable {  }
        )
        Spacer(modifier = Modifier.height(50.dp))
        Text(text = "World", Modifier.padding(30.dp))
    }
}


@Preview
@Composable
fun TresPreview() {
    Column(Modifier.fillMaxSize()) {
        TresView()
    }

}


//   Modifier.offset(10.dp, 20.dp)