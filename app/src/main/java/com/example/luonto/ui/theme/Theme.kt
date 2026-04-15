package com.example.luonto.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = Green40,        // Pääväri: tummanvihreä (#2E7D32)
    secondary = GreenGrey40,  // Toissijainen: harmaanvihreä
    tertiary = LightGreen40,  // Kolmannen tason: keskivihreä
)
private val DarkColorScheme = darkColorScheme(
    primary = Green80,        // Pääväri: vaaleanvihreä (#A5D6A7)
    secondary = GreenGrey80,  // Toissijainen: vihertävänharmaa
    tertiary = LightGreen80,  // Kolmannen tason: haaleankeltavihreä
)

@Composable
fun LuontoTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}