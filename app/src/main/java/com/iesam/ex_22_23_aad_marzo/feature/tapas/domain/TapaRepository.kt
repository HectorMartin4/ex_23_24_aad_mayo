package com.iesam.ex_22_23_aad_marzo.feature.tapas.domain

interface TapaRepository {

    suspend fun getTapas(): List<Tapa>
}