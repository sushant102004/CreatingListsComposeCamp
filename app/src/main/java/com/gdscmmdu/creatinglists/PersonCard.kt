package com.gdscmmdu.creatinglists

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gdscmmdu.creatinglists.model.PersonModel

@Composable
fun PersonCard(personModel : PersonModel){
    Row(modifier = Modifier.fillMaxWidth().background(Color.LightGray).padding(20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
        ){
       Text(text = "${personModel.age}", fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Text(text = personModel.name, fontSize = 20.sp)
    }
}