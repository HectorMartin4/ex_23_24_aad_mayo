package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.db

import android.content.Context
import androidx.room.Room
import com.iesam.ex_22_23_aad_marzo.app.AppDatabase
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.Animal
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.AnimalBreed

class AnimalsRoomDataSource(context: Context) {

    private val db = Room.databaseBuilder(
        context,
        AppDatabase::class.java, "animales"
    ).build()

    private val animalDao = db.animalDao()


    fun saveAnimals(list: List<Animal>){
        animalDao.saveAnimals(list.map {
            it.toEntity(it)
        })
    }

    private fun saveBreed(breedEntity: AnimalBreedEntity){
        animalDao.saveAnimalBreed(breedEntity)
    }

    fun saveBreeds(list: List<Animal>){
        list.map {
            saveBreed(it.animalBreed.toEntity())
        }
    }

    private fun saveType(typeEntity: AnimalTypeEntity){
        animalDao.saveAnimalType(typeEntity)
    }

    fun saveTypes(list: List<Animal>){
        list.map {
            saveType(it.type.toEntity())
        }
    }

    fun getFullAnimals(): List<Animal>{
        return animalDao.getFullAnimals().map {
            it.animal.toDomain(it.breed, it.type)
        }
    }

    fun deleteAnimals() {
        animalDao.deleteAnimals()
    }

    fun getAnimalBreed(): List<AnimalBreed>{
        return animalDao.getAnimalBreed().map {
            it.toDomain()
        }
    }

}