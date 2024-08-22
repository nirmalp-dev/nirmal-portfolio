import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.painterResource

import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.compose_multiplatform
import ui.components.Header
import ui.theme.PreahvihearFontFamily


@Composable
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF11071F)
            ),
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {
            Header()
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!", fontFamily = PreahvihearFontFamily())
            }
            Text(
                text = "Hello, This is Nirmal Patel",
                fontFamily = PreahvihearFontFamily(),
                color = Color.White,
                fontSize = MaterialTheme.typography.h3.fontSize
            )

//            AnimatedVisibility(showContent) {
//                val greeting = remember { Greeting().greet() }
//                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
//                    Image(painterResource(Res.drawable.compose_multiplatform), null)
//                    Text("Compose: $greeting", fontFamily = PreahvihearFontFamily())
//                }
//            }
        }
    }
}