package com.example.composeexamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class Dos : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                LessonTwoColumn()
                LessonTwoRow()
            }

        }
    }
}

@Composable
fun LessonTwoRow() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(text = "Play")
        Image(
            painter = painterResource(id = R.drawable.ic_player_play),
            contentDescription = ""
        )
        Text("Stop")
    }
}


@Composable
fun LessonTwoColumn() {
    Column(
        modifier = Modifier
            .fillMaxHeight(0.5f)
            .fillMaxWidth()
            .background(Color.Blue),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Play")
        Image(
            painter = painterResource(id = R.drawable.ic_player_play),
            contentDescription = ""
        )
        Text("Stop")
    }
}

@Preview
@Composable
fun LessonTwoPreview() {
    Column(Modifier.fillMaxSize()) {
        LessonTwoColumn()
        LessonTwoRow()
    }
}