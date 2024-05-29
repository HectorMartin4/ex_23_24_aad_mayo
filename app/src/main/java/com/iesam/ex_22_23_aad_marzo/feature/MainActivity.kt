package com.iesam.ex_22_23_aad_marzo.feature

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.iesam.ex_22_23_aad_marzo.R
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.AnimalDataRepository
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.db.AnimalsRoomDataSource
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.remote.AnimalRemoteDataSource
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button?>(R.id.action_delete_user).setOnClickListener {
            deleteLogin()
        }
        findViewById<Button?>(R.id.action_delete_animals).setOnClickListener {
            deleteAnimals()
        }
        initLogin()
        initAnimals()
        initAnimalBreed()
        initTapas()
    }

    private fun initLogin() {
        val email = "example@email.es"
        val password = "example_password"

        //Llamar al repositorio
        //LoginRepository loginRepository = ...
    }

    private fun deleteLogin() {
        //Eliminar datos del login.
    }

    private fun initAnimals() {
        thread {
            val repository = AnimalDataRepository(AnimalsRoomDataSource(this), AnimalRemoteDataSource())

            val animalData = repository.getAnimals()

            Log.d("dev", "Data: $animalData")
        }
    }

    private fun initAnimalBreed() {
        thread {
            val repository = AnimalDataRepository(AnimalsRoomDataSource(this), AnimalRemoteDataSource())

            val animalData = repository.getAnimalBreed()

            Log.d("dev", "Data: $animalData")
        }
    }

    private fun deleteAnimals() {
        thread {
            val repository = AnimalDataRepository(AnimalsRoomDataSource(this), AnimalRemoteDataSource())

            repository.deleteAnimals()
        }
    }

    private fun initTapas() {
        thread {
            //Hacer la llamada al repositorio desde aquí.
        }
    }
}