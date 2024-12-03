package com.example.scaffoldtopappbarsnackbarbottombarfloatingactionbuttonmodaldrawer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.scaffoldtopappbarsnackbarbottombarfloatingactionbuttonmodaldrawer.ui.theme.ScaffoldTopAppBarSnackbarBottomBarFloatingActionButtonModalDrawerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ScaffoldTopAppBarSnackbarBottomBarFloatingActionButtonModalDrawerTheme {
                //Scaffold es el esqueleto de la app
                Scaffold(modifier = Modifier.fillMaxSize(),
                    topBar = {MyToopAppBar()}) {
                    innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}