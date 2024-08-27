package ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.headshot
import portfolio.composeapp.generated.resources.logo

@Composable
fun Header(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(color = Color(0xFF1A0B2E)),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter =  painterResource(Res.drawable.logo),
            contentDescription = null
        )

        HeaderText(
            text = "Home",
        )
        HeaderText(
            text = "About",
        )
        HeaderText(
            text = "Menu",
        )
    }
}

@Composable
fun HeaderText(text: String){
    Text(
        text = text,
        color = Color.White,
        fontSize = TextUnit(20f, TextUnitType.Sp)
    )
}