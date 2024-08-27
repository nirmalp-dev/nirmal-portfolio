package ui.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.preahvihear_regular
import org.jetbrains.compose.resources.Font
import portfolio.composeapp.generated.resources.Poppins_Bold
import portfolio.composeapp.generated.resources.Poppins_Italic
import portfolio.composeapp.generated.resources.Poppins_Medium
import portfolio.composeapp.generated.resources.Poppins_Regular
import portfolio.composeapp.generated.resources.Poppins_SemiBold
import portfolio.composeapp.generated.resources.Poppins_SemiBoldItalic

@Composable
fun PreahvihearFontFamily() = FontFamily(
    Font(Res.font.preahvihear_regular)
)

@Composable
fun PoppinsFontFamily() = FontFamily(
    Font(Res.font.Poppins_Regular, weight = FontWeight.Normal, style = FontStyle.Normal),
    Font(Res.font.Poppins_Medium, weight = FontWeight.Medium, style = FontStyle.Normal),
    Font(Res.font.Poppins_Italic, weight = FontWeight.Medium, style = FontStyle.Italic),
    Font(Res.font.Poppins_Bold, weight = FontWeight.Bold, style = FontStyle.Normal),
    Font(Res.font.Poppins_SemiBold, weight = FontWeight.SemiBold, style = FontStyle.Normal),
    Font(Res.font.Poppins_SemiBoldItalic, weight = FontWeight.SemiBold, style = FontStyle.Italic),
)