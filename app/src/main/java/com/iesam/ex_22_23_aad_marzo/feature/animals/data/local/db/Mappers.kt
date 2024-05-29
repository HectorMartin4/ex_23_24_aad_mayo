package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.db

import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.Animal
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.AnimalBreed
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.AnimalType

fun Animal.toEntity(animal: Animal): AnimalEntity =
    AnimalEntity(
        this.id,
        this.name,
        animal.type.type,
        animal.animalBreed.name,
        animal.animalBreed.country
    )

fun AnimalEntity.toDomain(animalBreedEntity: AnimalBreedEntity, animalTypeEntity: AnimalTypeEntity): Animal =
    Animal(
        this.id,
        this.name,
        animalTypeEntity.toDomain(),
        animalBreedEntity.toDomain()
    )


fun AnimalType.toEntity(): AnimalTypeEntity =
    AnimalTypeEntity(
        this.id,
        this.type
    )

fun AnimalTypeEntity.toDomain(): AnimalType =
    AnimalType(
        this.id,
        this.type
    )

fun AnimalBreed.toEntity(): AnimalBreedEntity =
    AnimalBreedEntity(
        this.id,
        this.name,
        this.country
    )

fun AnimalBreedEntity.toDomain(): AnimalBreed =
    AnimalBreed(
        this.id,
        this.name,
        this.country
    )