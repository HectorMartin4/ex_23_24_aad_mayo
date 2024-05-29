package com.iesam.ex_22_23_aad_marzo.feature.animals.domain

interface AnimalRepository {

    fun getAnimals(): List<Animal>

    fun getAnimalBreed(): List<AnimalBreed>
}