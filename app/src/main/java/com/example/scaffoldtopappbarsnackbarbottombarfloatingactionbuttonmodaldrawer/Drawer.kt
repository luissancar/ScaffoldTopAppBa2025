package com.example.scaffoldtopappbarsnackbarbottombarfloatingactionbuttonmodaldrawer

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ModalDrawer(drawerState: DrawerState, scaffold: @Composable () -> Unit) {
    val scope = rememberCoroutineScope()
    ModalNavigationDrawer(
        drawerState = drawerState,
        gesturesEnabled = false,
        drawerContent = {
            ModalDrawerSheet {
                NavigationDrawerItem(
                    label = { Text(text = "Drawer Item") },
                    selected = false,
                    onClick = { scope.launch { drawerState.close() } }
                )
                NavigationDrawerItem(
                    label = { Text(text = "Drawer Item") },
                    selected = false,
                    onClick = { scope.launch { drawerState.close() } }
                )
            }
        }

    ) {
        scaffold()
    }
}





@Composable
fun MyDrawer() {
    Column(Modifier.padding(8.dp)) {
        MyText(text = "Opción 1")
        MyText(text = "Opción 2")
        MyText(text = "Opción 3")
        MyText(text = "Opción 4")

    }
}

@Composable
fun MyText(text: String) {
    Text(
        text = text,
        modifier = Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth()
    )
}
