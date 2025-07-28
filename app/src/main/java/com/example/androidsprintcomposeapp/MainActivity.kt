package com.example.androidsprintcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold(
                content = { innerPadding: PaddingValues ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .background(Color.LightGray)
//                            .fillMaxWidth()
                            .width(400.dp)
                            .height(200.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        StudyAppHeader()
                        Spacer(modifier = Modifier.height(30.dp))
                        MainNavButtons()
                    }
                }
            )
        }
    }
}

@Composable
fun StudyAppHeader() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Huilo World",
            fontSize = 28.sp,
        )
        Text(
            text = "Buy World",
            fontSize = 16.sp,
        )
    }
}

@Composable
fun MainNavButtons() {
    Row(
        modifier = Modifier.padding(horizontal = 5.dp)
    ) {
        Button(
            onClick = {},
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 5.dp)
        ) {
            Text("Button1")
        }
        Button(
            onClick = {},
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 5.dp)
        ) {
            Text("Button2")
        }
        Button(
            onClick = {},
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 5.dp)
        ) {
            Text("Button3")
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun StudyAppHeaderPreview() {
    StudyAppHeader()
}

@Composable
@Preview(showBackground = true)
fun MainNavButtonsPreview() {
    MainNavButtons()
}