package com.example.jetpack_compose_setup

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.w3c.dom.Text


class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
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

        //new setContent

//        setContent{
//            Column(
//                modifier = Modifier
//                    //every statement will be considered sequentially
//                    .background(Color.Green)
//                    .fillMaxHeight(0.5f)
//                    .fillMaxWidth()
//                    .border(10.dp, color = Color.Red)
//                    .padding(10.dp)
//                    .border(10.dp, color = Color.Black)
//                    .padding(10.dp)
//                    .border(10.dp, color = Color.Blue)
//                    .padding(10.dp)
//                // padding maintains the gaps of the container of text. Also we can maintain for all sides individually.
//                //.padding(top=20.dp)
////                    .requiredWidth(200.dp) this function maintains the width outside the screen too
//            ) {
//                Text(text = "heyy",modifier = Modifier
//                    .border(5.dp, color = Color.Magenta)
//                    .offset(25.dp,25.dp)
//                    .border(5.dp, color = Color.Magenta)
//                    .padding(5.dp)
//                )
//                //offset moves first in X dir then in Y
//                Spacer(modifier = Modifier.height(25.dp))
//                //space between two components
//                Text(text = "potatomioo",modifier = Modifier
//                    //Clickable too with modifiers
//                    .offset(25.dp,25.dp)
//                    .clickable {  })
//            }
//        }


        //Image Card And Styling


//        setContent {
//            val image = painterResource(id = R.drawable.brighter)
//            //val image1 = painterResource(id = R.drawable.eve)
//            //val image2 = painterResource(id = R.drawable.night)
//            //val image3 = painterResource(id = R.drawable.isl)
//            val content = "Evening"
//            val titlegiven = "This is Beautiful"
//            //val titlegiven1 = "Evening is Beautiful"
//            //val titlegiven2 = "night is Beautiful"
//            //val titlegiven3 = "beach is Beautiful"
//            // Column and Row approach
//            //Column {
//                //Row{
//                //ImageCard(
//                    //painter = image1,
//                    //contentDes = content,
//                    //title = titlegiven1
//                //)
//                //ImageCard(
//                    //painter = image2,
//                    //contentDes = content,
//                    //title = titlegiven2
//                //)}
//                //Spacer(modifier = Modifier.height(2.dp))
//                //ImageCard(
//                    //painter = image3,
//                    //contentDes = content,
//                    //title = titlegiven3
//                //)
//
//            Box(modifier = Modifier
//                .fillMaxSize(0.5f)
//                .padding(10.dp)
//            ) {
//                ImageCard(
//                    painter = image,
//                    contentDes = content,
//                    title = titlegiven
//                )
//            }
//        }
//    }
//}
//
//@Composable
//fun ImageCard(
//    painter:Painter,
//    contentDes:String,
//    title:String,
//    modifier: Modifier = Modifier
//){
//    Card(
//        modifier = modifier.fillMaxWidth(),
//        shape = RoundedCornerShape(20.dp)
//    ) {
//        //box is a simply container which contains modifiers for rows and columns
//        Box(modifier = Modifier.height(200.dp)){
//            Image(
//                painter = painter,
//                contentDescription = contentDes,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier.fillMaxSize()
//                )
//            Box(modifier = Modifier
//                .fillMaxSize()
//                .background(
//                    Brush.verticalGradient(
//                        colors = listOf(
//                            Color.Transparent,
//                            Color.Black
//                        ),
//                        startY = 300f
//                    )
//                )
//            )
//            Box(modifier = Modifier
//                .fillMaxSize()
//                .padding(12.dp),
//                contentAlignment = Alignment.BottomStart){
//                Text(text = title, style = TextStyle(color = Color.White, fontSize = 15.sp))
//            }
//        }
//    }
//}


        //Styling the Font


//        val fontFamily = FontFamily(
//            Font(R.font.lthin, FontWeight.Thin),
//            Font(R.font.lexendbold, FontWeight.Bold),
//            Font(R.font.lexendextrabold, FontWeight.ExtraBold),
//            Font(R.font.lexendextralight, FontWeight.ExtraLight),
//            Font(R.font.lexendmedium, FontWeight.Medium),
//            Font(R.font.lexendregular, FontWeight.Normal),
//            Font(R.font.lexendsemibold, FontWeight.SemiBold),
//            Font(R.font.lexendlight, FontWeight.Light)
//        )
//
//        setContent {
//            Box(modifier = Modifier
//                .fillMaxSize()
//                .background(color = Color.DarkGray)
//            ){
//                Text(text = buildAnnotatedString {
//                                                 withStyle(
//                                                     style = SpanStyle(
//                                                         color = Color.Magenta,
//                                                         fontSize = 50.sp
//                                                     )
//                                                 ){
//                                                     append("P")
//                                                 }
//                    append("otatomioo")
//                },
//                    color = Color.White,
//                    fontSize = 30.sp,
//                    fontFamily = fontFamily,
//                    fontWeight = FontWeight.Bold,
//                    textAlign = TextAlign.Center,
//                    fontStyle = FontStyle.Italic,
//                    //textDecoration = TextDecoration.Underline
//                    //Importing Font Style to AS
//                )
//            }
//        }
//
//    }
//}


        // State in Compose

//        setContent {
//
//            ColorBox(Modifier
//                .fillMaxSize()
//            )
//
//        }
//
//    }
//}
//
//@Composable
//fun ColorBox(modifier: Modifier = Modifier){
//
//    val colorstate = remember{      // remember will remember the color of the box last came. When the function will be changed.
//        mutableStateOf(Color.Yellow)
//    }
//
//    Box(modifier = modifier
//        .background(colorstate.value)
//        .clickable {
//            colorstate.value = Color(
//                Random.nextFloat(),  // Colors will be selected by their float values so here randomly selecting float
//                Random.nextFloat(),
//                Random.nextFloat(),
//                1f    // default
//            )
//        }
//
//    )
//}


        //Text view and button

//                setContent(){
//                    var name by remember { mutableStateOf("") }
//                    var nameError = false
//
//                    MyTextField(
//                        label = "Enter your name:",
//                        value = name,
//                        onValueChange = { name = it },
//                        isError = nameError,
//                        errorMessage = "Please enter a valid name"  // Display if nameError is true
//                    )
//
//                }
//
//            }
//        }
//
//        @Composable
//        fun MyTextField(
//            label: String,
//            value: String,
//            onValueChange: (String) -> Unit,
//            isError: Boolean = false,  // Optional flag for error state
//            errorMessage: String? = null  // Optional error message
//        ) {
//            Column {  // Wrap in a Column for vertical layout
//                TextField(
//                    value = value,
//                    onValueChange = onValueChange,
//                    label = { Text(text = label) },
//                    modifier = Modifier
//                        .fillMaxWidth()  // Make the field fill available width
//                        .padding(horizontal = 16.dp, vertical = 8.dp),  // Add padding
//                    isError = isError  // Indicate error state if applicable
//                )
//                if (isError && errorMessage != null) {  // Display error message conditionally
//                    Text(
//                        text = errorMessage,
//                        color = Color.Red,
//                        fontSize = 12.sp,
//                        modifier = Modifier.padding(start = 16.dp)  // Indent error message
//                    )
//                }
//            }
//        }



        //lets make a textfield

        setContent {

        }


    }
}

@Composable
fun maketextfield(
    given:String
){
    Column(
        Modifier
            .fillMaxSize()
            .background(color = Color.White), Arrangement.Center, Alignment.CenterHorizontally
    ) {

        Text(text = "heyy")



        var textstate = remember {
            mutableStateOf(" ")
        }
        TextField(
            modifier = Modifier
            .border(
                width = 5.dp,
                brush = Brush.horizontalGradient(listOf(Color.Blue, Color.Black), startX = 0.5f),
                shape = RoundedCornerShape(5.dp)
            ),
            value = textstate.value,
            onValueChange = {
                if (textstate.value.length < 20) textstate.value = it
            },
//            supportingText = {
//                             Text(text = "${textstate.value.length}/20")
//            },
            textStyle = TextStyle(
                color = Color.Black
            ),
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Person, contentDescription = "name"
                ,modifier = Modifier
                        .padding(0.dp)
                        .background(
                            color = Color.Black,
                            shape = RoundedCornerShape(5.dp)
                        )
                    ,tint = Color.White
                )
            }
        )

    }
}







@Preview(showBackground = true)
@Composable
fun MyComposablePreview(){
    maketextfield(given = "hello")
}