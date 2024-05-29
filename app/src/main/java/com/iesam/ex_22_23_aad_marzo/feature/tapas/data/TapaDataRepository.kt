package com.iesam.ex_22_23_aad_marzo.feature.tapas.data

import com.iesam.ex_22_23_aad_marzo.feature.tapas.data.remote.db.TapaFirebaseRemoteDataSource
import com.iesam.ex_22_23_aad_marzo.feature.tapas.domain.Tapa
import com.iesam.ex_22_23_aad_marzo.feature.tapas.domain.TapaRepository

class TapaDataRepository(private val firebaseRemoteDataSource: TapaFirebaseRemoteDataSource): TapaRepository {
    override suspend fun getTapas(): List<Tapa> {
        return firebaseRemoteDataSource.getTapas()
    }


}