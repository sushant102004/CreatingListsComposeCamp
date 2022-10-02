package com.gdscmmdu.creatinglists.repository
import com.gdscmmdu.creatinglists.model.PersonModel

class PersonRepository {
    fun getAllPersonData() : List<PersonModel>{
        return listOf(
            PersonModel(
                id = 0,
                name = "Sushant Dhiman",
                age = 18
            ),
            PersonModel(
                id = 1,
                name = "Setve Jhonson",
                age = 15
            ),
            PersonModel(
                id = 2,
                name = "Ned Stark",
                age = 20
            ),

            PersonModel(
                id = 3,
                name = "Tom Cruise",
                age = 30
            ),
            PersonModel(
                id = 4,
                name = "Kunal Kumar",
                age = 18
            ),
            PersonModel(
                id = 2,
                name = "Simran",
                age = 18
            ),
        )
    }
}