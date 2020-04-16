package dev.hassanabid.androidnightsample

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxHeight
import androidx.ui.layout.padding
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Surface
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

@Preview
@Composable
fun FlexibleLayout() {
    MaterialTheme {
        Surface(color = Color.Green) {
            val modifier = Modifier
                .fillMaxHeight()
                .padding(start = 16.dp, top = 16.dp, bottom = 16.dp)
            Column(modifier =  modifier) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(text = "Hello World")
                    Divider(color = Color.Blue)
                    Text(text = "Hello World 2")
                }
                Text(text = "Outside Hello World")
            }
        }

    }
}