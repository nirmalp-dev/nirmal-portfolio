package ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.preahvihear_regular
import org.jetbrains.compose.resources.Font

@Composable
fun PreahvihearFontFamily() = FontFamily(
    Font(Res.font.preahvihear_regular)
)