package com.example.scaffoldtopappbarsnackbarbottombarfloatingactionbuttonmodaldrawer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldEjemplo(){
    Scaffold(
        topBar = {MyToopAppBar()}
    ) { contentPadding ->
        // Screen content
        Box(modifier = Modifier.padding(contentPadding)
            .height(50.dp).fillMaxWidth().background(
                Color.Blue)) { /* ... */ }
    }

}