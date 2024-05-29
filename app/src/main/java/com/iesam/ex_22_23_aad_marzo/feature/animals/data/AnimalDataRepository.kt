package com.iesam.ex_22_23_aad_marzo.feature.animals.data

import com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.db.AnimalsRoomDataSource
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.remote.AnimalRemoteDataSource
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.Animal
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.AnimalBreed
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.AnimalRepository

class AnimalDataRepository(private val localDataSource: AnimalsRoomDataSource, private val remoteDataSource: AnimalRemoteDataSource): AnimalRepository {

    private val list = mutableListOf<AnimalBreed>()

    override fun getAnimals(): List<Animal> {
        val localAnimals = localDataSource.getFullAnimals()

        return if (localAnimals.isEmpty()){
            val remoteAnimals = remoteDataSource.getAnimals()
            localDataSource.saveAnimals(remoteAnimals)
            localDataSource.saveBreeds(remoteAnimals)
            localDataSource.saveTypes(remoteAnimals)

            remoteAnimals
        } else {
            localAnimals
        }

    }

    override fun getAnimalBreed(): List<AnimalBreed> {
        val localBreed = localDataSource.getAnimalBreed()

        return if (localBreed.isEmpty()){
            val remoteAnimals = remoteDataSource.getAnimals()
            remoteAnimals.map {
                list.add(it.animalBreed)
            }
            localDataSource.saveAnimals(remoteAnimals)
            localDataSource.saveBreeds(remoteAnimals)
            localDataSource.saveTypes(remoteAnimals)

            list
        } else{
            localBreed
        }
    }

    fun deleteAnimals(){
        localDataSource.deleteAnimals()
    }
}