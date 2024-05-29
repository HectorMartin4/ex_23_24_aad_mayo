package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "animals")
data class AnimalEntity(
    @PrimaryKey @ColumnInfo("id") val id: Int,
    @ColumnInfo("name") val name: String,
    @ColumnInfo("animalType") val type: String,
    @ColumnInfo("animalBreedName") val breedName: String,
    @ColumnInfo("animalBreedCountry") val breedCountry: String,
)

@Entity(tableName = "animalType")
data class AnimalTypeEntity(
    @PrimaryKey @ColumnInfo("id") val id: Int,
    @ColumnInfo("type") val type: String)

@Entity(tableName = "animalBreed")
data class AnimalBreedEntity(
    @PrimaryKey @ColumnInfo("id") val id: Int,
    @ColumnInfo("name") val name: String,
    @ColumnInfo("country") val country: String)