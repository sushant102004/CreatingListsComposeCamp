package com.gdscmmdu.creatinglists

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gdscmmdu.creatinglists.repository.PersonRepository
import com.gdscmmdu.creatinglists.ui.theme.CreatingListsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreatingListsTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    val personRepository = PersonRepository()
                    val personsData = personRepository.getAllPersonData()

                    LazyColumn(
                        contentPadding = PaddingValues(10.dp),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        items(items = personsData) { person ->
                            PersonCard(personModel = person)
                        }
                    }
                }
            }
        }
    }}

