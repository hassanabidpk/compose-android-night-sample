package dev.hassanabid.androidnightsample

import androidx.compose.Composable
import androidx.ui.core.LayoutModifier
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.ScaleFit
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import androidx.ui.unit.sp

@Composable
fun NewsStory() {
    MaterialTheme {
        val typography = MaterialTheme.typography
        Column(
            modifier = Modifier.padding(8.dp)
        ) {

            val image = imageResource(R.drawable.android_night)
            val imageModifier = Modifier
                .preferredHeightIn(maxHeight = 200.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(4.dp))
            Image(asset = image, modifier = imageModifier, scaleFit = ScaleFit.FillHeight)
            Column {
                Text("CameraX, beyond Alpha - Toru", style = TextStyle(color = Color.Red, fontSize = 24.sp, fontFamily = typography.h2.fontFamily))
                Text("Exploring Android Jetpack Testing - Su", style = TextStyle(color = Color.Black))
                Text("Jetpack compose - Hassan", modifier =  Modifier.padding(top = 10.dp), style = typography.body2.copy(color = Color.Blue))
            }

        }
    }

}

@Preview("NewsStory")
@Composable
fun NewsStoryPreview() {
    MaterialTheme {
        NewsStory()
    }
}