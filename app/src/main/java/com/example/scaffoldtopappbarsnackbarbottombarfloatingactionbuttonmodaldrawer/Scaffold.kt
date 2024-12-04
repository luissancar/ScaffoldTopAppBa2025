package com.example.scaffoldtopappbarsnackbarbottombarfloatingactionbuttonmodaldrawer

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.launch


import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldEjemplo2() {

    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val coroutineScope = rememberCoroutineScope()
    val snackbarHostState = SnackbarHostState()

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },

        topBar = {
            //   MyToopAppBar1()
            MyToopAppBar2() {
                coroutineScope.launch {

                    snackbarHostState.showSnackbar("Pulsado $it")

                }
            }
        }
    ) { contentPadding ->
        // Screen content
        CuerpoApp(modifier = Modifier.padding(contentPadding))
    }

}




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldEjemplo3() {

    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val coroutineScope = rememberCoroutineScope()
    val snackbarHostState = SnackbarHostState()

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        bottomBar = { NavigationBar01() },

        topBar = {
            //   MyToopAppBar1()
            MyToopAppBar2() {
                coroutineScope.launch {

                    snackbarHostState.showSnackbar("Pulsado $it")

                }
            }
        }
    ) { contentPadding ->
        // Screen content
        CuerpoApp(modifier = Modifier.padding(contentPadding))
    }

}
