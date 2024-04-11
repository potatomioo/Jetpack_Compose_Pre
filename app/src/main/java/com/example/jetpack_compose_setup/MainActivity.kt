package com.example.jetpack_compose_setup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_setup.ui.theme.Jetpack_compose_setupTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContent {
            //Column(modifier = Modifier
                //.width(200.dp)
                //.height(400.dp)
                //.fillMaxSize(0.5f) in complete screen
                //.fillMaxHeight(0.8f)
                //.background(Color.Green),
                //horizontalAlignment = Alignment.CenterHorizontally,
                //verticalArrangement = Arrangement.SpaceEvenly
                //these alignment and arrangements factors will be changed in case of ROW
            //) {
                //Text("hello")
                //Text("potatomioo")
            //}
        //}

        setContent{
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxHeight(0.5f)
                    .width(200.dp)
                    .requiredWidth(200.dp)
            ) {
                Text(text = "heyy")
                Text(text = "potatomioo")
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {}