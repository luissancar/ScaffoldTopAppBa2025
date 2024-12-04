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
import androidx.compose.runtime.rememberCoroutineScope
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
              //  ScaffoldExample()
                //ScaffoldEjemplo2()
                //ScaffoldEjemplo3()
                ScaffoldEjemplo4()


            }
        }
    }
}



@Composable
fun ScaffoldExample(){
   // val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    Scaffold(modifier = Modifier.fillMaxSize(),
        topBar = {MyToopAppBar1()}) {
            innerPadding ->
        CuerpoApp(

            modifier = Modifier.padding(innerPadding)
        )
    }
}
@Composable
fun CuerpoApp(modifier: Modifier = Modifier) {
    Text(
        text = "Cuerpo App",
        modifier = modifier
    )
}
