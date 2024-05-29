package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import java.lang.reflect.Type

@Dao
interface AnimalDao {

    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveAnimals(animalEntity: List<AnimalEntity>)

    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveAnimalBreed(breed: AnimalBreedEntity)
    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveAnimalType(typeEntity: AnimalTypeEntity)

    @Query("SELECT * FROM animals")
    fun getAllAnimals(): List<AnimalEntity>

    @Query("SELECT * FROM animalBreed")
    fun getAnimalBreed(): List<AnimalBreedEntity>

    @Query("DELETE FROM animals")
    fun deleteAnimals()

    @Transaction
    @Query("SELECT * FROM animals")
    fun getFullAnimals(): List<AnimalFullEntity>
}