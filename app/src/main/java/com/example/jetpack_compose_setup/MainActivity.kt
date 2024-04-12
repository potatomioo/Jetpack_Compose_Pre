package com.example.jetpack_compose_setup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
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
                    //every statement will be considered sequentially
                    .background(Color.Green)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
                    .border(10.dp, color = Color.Red)
                    .padding(10.dp)
                    .border(10.dp, color = Color.Black)
                    .padding(10.dp)
                    .border(10.dp, color = Color.Blue)
                    .padding(10.dp)
                // padding maintains the gaps of the container of text. Also we can maintain for all sides individually.
                //.padding(top=20.dp)
//                    .requiredWidth(200.dp) this function maintains the width outside the screen too
            ) {
                Text(text = "heyy",modifier = Modifier
                    .border(5.dp, color = Color.Magenta)
                    .offset(25.dp,25.dp)
                    .border(5.dp, color = Color.Magenta)
                    .padding(5.dp)
                )
                //offset moves first in X dir then in Y
                Spacer(modifier = Modifier.height(25.dp))
                //space between two components
                Text(text = "potatomioo",modifier = Modifier.offset(25.dp,25.dp))
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {}