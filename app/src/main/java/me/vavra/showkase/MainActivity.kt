package me.vavra.showkase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.models.Showkase
import me.vavra.feature.FeatureGreeting
import me.vavra.feature.theme.ShowkaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShowkaseTheme {
                Surface(
                    color = MaterialTheme.colors.background,
                ) {
                    Column(
                        modifier = Modifier.padding(24.dp)
                    ) {
                        AppGreeting()
                        FeatureGreeting()
                        Spacer(modifier = Modifier.height(24.dp))
                        Button(onClick = { startActivity(Showkase.getBrowserIntent(this@MainActivity)) }) {
                            Text("Showkase browser")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AppGreeting() {
    Text(text = "Hello from app module!")
}

@Preview(name = "App module greeting", group = "Greetings")
@Composable
fun DefaultPreview() {
    ShowkaseTheme {
        AppGreeting()
    }
}