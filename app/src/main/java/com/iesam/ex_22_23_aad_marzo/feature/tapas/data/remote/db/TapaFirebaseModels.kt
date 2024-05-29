package com.iesam.ex_22_23_aad_marzo.feature.tapas.data.remote.db

import com.google.firebase.database.PropertyName

data class TapaFirebaseModel(
    @get:PropertyName("id") @set:PropertyName("id") var id: Int = 0,
    @get:PropertyName("name") @set:PropertyName("name") var name: String = "",
    @get:PropertyName("description") @set:PropertyName("description") var description: String = "",
)

data class EstablishmentFirebaseModel(
    @get:PropertyName("id") @set:PropertyName("id") var id: Int = 0,
    @get:PropertyName("name") @set:PropertyName("name") var name: String = ""
)

data class PhotoTapasFirebaseModel(
    @get:PropertyName("id") @set:PropertyName("id") var id: Int,
    @get:PropertyName("url") @set:PropertyName("url") var url: String)