package com.example.scaffoldtopappbarsnackbarbottombarfloatingactionbuttonmodaldrawer

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyToopAppBar1() {

    TopAppBar(modifier = Modifier
        .windowInsetsPadding(  // para que no ocupe la parte de arriba del movil
            WindowInsets.statusBars.only(WindowInsetsSides.Top)
        ),
        title = { Text("TopAppBar") },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Red, // Color de fondo
            titleContentColor = Color.White // Color del título
        ),
        navigationIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "") },
        actions = {
            Icon(imageVector = Icons.Default.Add, contentDescription = "")
            Icon(imageVector = Icons.Default.Call, contentDescription = "")

        }
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyToopAppBar2(onClickIcon: (String) -> Unit) {

    TopAppBar(modifier = Modifier
        .windowInsetsPadding(  // para que no ocupe la parte de arriba del movil
            WindowInsets.statusBars.only(WindowInsetsSides.Top)
        ),
        title = { Text("TopAppBar") },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Red, // Color de fondo
            titleContentColor = Color.White // Color del título
        ),
        navigationIcon = {
            IconButton(onClick = {   onClickIcon("Ok") }) {
                Icon(
                    imageVector = Icons.Default.Done,
                    contentDescription = ""
                )
            }


        },
        actions = {
            IconButton(onClick = { onClickIcon("Add") }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "")
            }
            IconButton(onClick = { onClickIcon("Call") }) {
                Icon(imageVector = Icons.Default.Call, contentDescription = "")
            }

        }
    )
}


