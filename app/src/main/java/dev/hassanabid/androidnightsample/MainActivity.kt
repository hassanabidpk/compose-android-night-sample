package dev.hassanabid.androidnightsample

import android.content.res.Resources
import android.os.Bundle
import android.widget.ImageView
import android.widget.Space
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.core.setContent
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.ScaleFit
import androidx.ui.graphics.imageFromResource
import androidx.ui.layout.*
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Surface
import androidx.ui.res.imageResource
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import com.google.android.material.color.MaterialColors

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val formState = FormState(true)
        var state = CounterState()
        setContent {
            MaterialTheme {
                Column {
                    NewsStory()
                    Divider(color = Color.Black, modifier = Modifier.padding(top = 8.dp, bottom = 8.dp), height = 2.dp)
                    AndroidNightTheme(lightThemeColors) {
                        Text(text = "Android Day!")
                    }
                    Spacer(Modifier.preferredHeight(16.dp))
                    SwitchComponent(formState = formState)
                    Spacer(Modifier.preferredHeight(16.dp))
                    CheckboxComponent(formState = CheckBoxFormState())
//                    Counter(state = state)
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}


@Preview("Home")
@Composable
fun DefaultPreview() {
    MaterialTheme {
        Greeting("Android")
    }
}