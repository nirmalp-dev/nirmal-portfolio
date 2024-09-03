package ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ui.theme.PreahvihearFontFamily

@Composable
fun Headline() {
    Column {
        Row{
            Text(
                text = "Hello!, I am ",
                fontFamily = PreahvihearFontFamily(),
                color = Color.White,
                fontSize = 19.sp,
            )
            Text(
                text = "Nirmal Patel",
                fontFamily = PreahvihearFontFamily(),
                color = Color(0xFF7127BA),
                fontSize = 19.sp,
            )
        }
        Spacer(modifier = Modifier.size(50.dp))
        Text(
            text = "A Developer who",
            fontFamily = PreahvihearFontFamily(),
            color = Color.White,
            fontSize = 17.sp,
        )
        EllipseAroundWordV2(
            modifier = Modifier,
            fontFamily = PreahvihearFontFamily(),
            color = Color.White,
            fontSize = 40.sp,
        )
        Text(
            text = "Because if the code cannot impress you what can?",
            fontFamily = PreahvihearFontFamily(),
            color = Color.White,
            fontSize = 11.sp,
        )
    }
}

@Composable
fun EllipseAroundWordV2(
    modifier: Modifier,
    fontFamily: FontFamily,
    color: Color,
    fontSize: TextUnit,
) {
    Text(
        modifier = modifier,
        text = "Judges an app",
        fontFamily = fontFamily,
        color = color,
        fontSize = fontSize,
    )
    Row{
        Text(
            modifier = modifier,
            text = "by its ",
            fontFamily = fontFamily,
            color = color,
            fontSize = fontSize,
        )
        Text(
            modifier = modifier.drawBehind {
                rotate(
                    degrees = -10f,
                ) {
                    drawOval(
                        color = Color.White,
                        style = Stroke(width = 1.sp.toPx()),
                        size = Size(this.size.width,this.size.height)
                    )
                }
            },
            fontFamily = fontFamily,
            color = Color(0xFF7127BA),
            text = "code",
            fontSize = fontSize,
        )
    }
}
