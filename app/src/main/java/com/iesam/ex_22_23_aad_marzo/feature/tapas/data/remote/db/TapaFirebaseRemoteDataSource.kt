package com.iesam.ex_22_23_aad_marzo.feature.tapas.data.remote.db

import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.iesam.ex_22_23_aad_marzo.feature.tapas.domain.Establishment
import com.iesam.ex_22_23_aad_marzo.feature.tapas.domain.PhotoTapas
import com.iesam.ex_22_23_aad_marzo.feature.tapas.domain.Tapa
import kotlinx.coroutines.tasks.await

class TapaFirebaseRemoteDataSource {

    val db = Firebase.database


    suspend fun getTapas(): List<Tapa>{
        db.getReference("tapa").get().await().children.map {
            it.getValue(TapaFirebaseModel::class.java)
        }
        return
    }


    suspend fun getEstablishment(): Establishment{
        db.getReference("establishment").get().await().children.map {
            it.getValue(Establishment::class.java,)
        }
        return
    }

    suspend fun getPhotoTapas(): List<PhotoTapas>{
        db.getReference("photoTapas").get().await().children.map {
            it.getValue(PhotoTapasFirebaseModel::class.java)
        }
        return
    }
}