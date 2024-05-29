package com.iesam.ex_22_23_aad_marzo.app

import androidx.room.Database
import androidx.room.RoomDatabase
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.db.AnimalBreedEntity
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.db.AnimalDao
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.db.AnimalEntity
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.db.AnimalTypeEntity

@Database(
    entities = [AnimalEntity::class, AnimalBreedEntity::class, AnimalTypeEntity::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun animalDao(): AnimalDao
}