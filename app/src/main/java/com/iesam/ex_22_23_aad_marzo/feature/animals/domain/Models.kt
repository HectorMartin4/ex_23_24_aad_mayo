package com.iesam.ex_22_23_aad_marzo.feature.animals.domain

data class Animal(val id: Int, val name: String, val type: AnimalType, val animalBreed: AnimalBreed)
data class AnimalType(val id: Int, val type: String)
data class AnimalBreed(val id: Int, val name: String, val country: String)