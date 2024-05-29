package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.db

import androidx.room.Embedded
import androidx.room.Relation

data class AnimalFullEntity(
    @Embedded val animal: AnimalEntity,
    @Relation(
        parentColumn = "animalType",
        entityColumn = "type"
    )
    val type: AnimalTypeEntity,
    @Relation(
        parentColumn = "animalBreedName",
        entityColumn = "name"
    )
    val breed: AnimalBreedEntity,
    )
