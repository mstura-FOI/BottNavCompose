package com.example.scriptify.bottomnavbar.botnav

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box



import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import com.example.scriptify.bottomnavbar.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition", "SuspiciousIndentation")
@Composable
public fun BottomNavigationBarMaterial(

){
    val alignment: Alignment = Alignment.BottomCenter
    var selectedItem by remember { mutableStateOf(0) }
    val items = listOf("Songs", "Artists", "Playlists")
       NavigationBar(modifier = Modifier
           .fillMaxWidth()
           .height(78.dp)

           ,
           containerColor = Color(0xffffc0cb),
           tonalElevation = 12.dp,


       ) {
           items.forEachIndexed { index, item ->
               NavigationBarItem(
                   icon = { if(item=="Songs") {Icon(painterResource(id = R.drawable.baseline_music_note_24), contentDescription = item)}
                   else if(item=="Artists"){Icon(painterResource(id = R.drawable.baseline_person_pin_24), contentDescription = item)}
                   else if(item=="Playlists"){Icon(painterResource(id = R.drawable.baseline_play_circle_24), contentDescription = item)} },
                   label = { Text(item) },
                   selected = selectedItem == index,
                   onClick = { selectedItem = index }
               )
           }
       }
}
@Preview(showBackground = true)
@Composable
fun Preview() {
    BottomNavigationBarMaterial()
}