import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.Resource
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.bookmark_icon
import portfolio.composeapp.generated.resources.headshot
import ui.components.Header
import ui.components.Headline
import ui.theme.PoppinsFontFamily
import ui.theme.PreahvihearFontFamily


@Composable
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF11071F)
            ),
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {
            item {
                Header()
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Box(){
                        //TODO: Add Gradient
                        Canvas(modifier = Modifier){
                            drawRadialGradient()
                        }
                        Image(
//                            modifier = Modifier.drawBehind {
//                                drawRadialGradient()
////                            drawOval(
////                                brush = Brush.radialGradient(
////                                    0.0f to Color(0xFF763CAC),
////                                    0.5f to Color(0xFF542598).copy(alpha = 0.5f),
////                                    1f to Color(0xFF320F85).copy(alpha = 0f),
////                                ),
//////                                size = Size(this.size.width*100f,this.size.height*4f),
////                                style = Stroke(width = 10f)
////                            )
//                            },
                            alignment = Alignment.Center,
                            painter = painterResource(Res.drawable.headshot),
                            contentDescription = "headshot",
                        )
                    }

                    Headline()

                }
                Text(
                    text = "Hello, This is Nirmal Patel",
                    fontFamily = PreahvihearFontFamily(),
                    color = Color.White,
                    fontSize = MaterialTheme.typography.h3.fontSize
                )

                Ellipse()
                Card(
                    painterResource = Res.drawable.bookmark_icon,
                )
            }
        }
    }
}
fun DrawScope.drawRadialGradient() {
    drawRect(
        brush = Brush.radialGradient(
            colors = listOf(Color.Blue, Color.Transparent),
            center = center,
            radius = size.maxDimension
        )
    )
}
@Composable
private fun Card(
    painterResource: DrawableResource,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(0.5f)
            .border(
                width = 1.dp,
                color = Color.Red,
                shape = RoundedCornerShape(15)
            )
            .clip(shape = RoundedCornerShape(15.dp))

            .background(Color(0xFF2C1250)),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            modifier = Modifier.padding(16.dp),
            painter = painterResource(painterResource),
            contentDescription = "card image"
        )
        Column(
            horizontalAlignment = Alignment.Start,
        ){
            Text(
                text = "Android Intern",
                fontFamily = PoppinsFontFamily(),
                fontStyle = FontStyle.Normal,
                style = MaterialTheme.typography.h4,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
@Composable
private fun LazyItemScope.Ellipse() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(700.dp),
//            .weight(1f),
        contentAlignment = Alignment.Center,
    ) {
        val gradientBrush = Brush.verticalGradient(
            colors = listOf(
                Color(0xFF11071F),
                Color(0xFF763CAC)
            ),
        )
        Oval(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(0.8f),
            gradientBrush = gradientBrush,
        )
        Oval(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(0.72f),
            gradientBrush = gradientBrush,
        )
        Oval(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(0.66f),
            gradientBrush = gradientBrush,
        )

    }
}

@Composable
private fun Oval(
    modifier: Modifier = Modifier,gradientBrush: Brush) {
    Canvas(
        modifier = modifier,
    ) {
        drawOval(
            brush = gradientBrush,
//                        color = Color(0xFF763CAC),
            style = Stroke(4f),
            topLeft = center.copy(x = size.width / 4, y = size.height / 4),
            size = size.copy(width = size.width / 2, height = size.height / 3)
        )
    }
}