package dev.hassanabid.androidnightsample

import androidx.compose.Composable
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.material.*
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.sp


val green = Color(0xFF1EB980)

@Composable
fun AndroidNightTheme(
    themeColors: ColorPalette = lightThemeColors,
    children: @Composable() () -> Unit
) {
    MaterialTheme(colors = themeColors) {
        Surface {
            children()
        }
    }
}

@Preview("light theme")
@Composable
fun ThemedPreview() {
    AndroidNightTheme(lightThemeColors) {
        Text(text = "Android Day!")
    }
}

@Preview("dark theme")
@Composable
fun ThemedPreviewDark() {
    AndroidNightTheme(darkThemeColors) {
        Text(text = "Android Night!")
    }
}



val lightThemeColors = lightColorPalette(
    primary = Color(0xFFDD0D3C),
    primaryVariant = Color(0xFFC20029),
    onPrimary = Color.White,
    secondary = Color.White,
    onSecondary = Color.Black,
    background = Color.White,
    onBackground = Color.Black,
    surface = Color.DarkGray,
    onSurface = green,
    error = Color(0xFFD00036),
    onError = Color.White
)

/**
 * Note: Dark Theme support is not yet available, it will come in 2020. This is just an example of
 * using dark colors.
 */
val darkThemeColors = darkColorPalette(
    primary = Color(0xFFEA6D7E),
    primaryVariant = Color(0xFFDD0D3E),
    onPrimary = Color.Black,
    secondary = Color(0xFF121212),
    onSecondary = Color.White,
    surface = Color(0xFF121212),
    background = Color(0xFF121212),
    onBackground = Color.White,
    onSurface = Color.White
)