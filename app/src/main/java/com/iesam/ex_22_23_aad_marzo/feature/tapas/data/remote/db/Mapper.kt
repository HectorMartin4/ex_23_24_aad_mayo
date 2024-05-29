package com.iesam.ex_22_23_aad_marzo.feature.tapas.data.remote.db

import com.iesam.ex_22_23_aad_marzo.feature.tapas.domain.Establishment
import com.iesam.ex_22_23_aad_marzo.feature.tapas.domain.PhotoTapas
import com.iesam.ex_22_23_aad_marzo.feature.tapas.domain.Tapa


fun PhotoTapasFirebaseModel.toDomain(): PhotoTapas =
    PhotoTapas(
        this.id,
        this.url
    )

fun EstablishmentFirebaseModel.toDomain(): Establishment =
    Establishment(
        this.id,
        this.name
    )

fun TapaFirebaseModel.toDomain(establishment: Establishment, photos: List<PhotoTapas>): Tapa =
    Tapa(
        this.id,
        this.name,
        this.description,
        establishment,
        photos
    )