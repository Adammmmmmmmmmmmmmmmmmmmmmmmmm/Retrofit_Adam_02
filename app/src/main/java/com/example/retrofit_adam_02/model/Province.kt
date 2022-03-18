package com.example.retrofit_adam_02.model

import com.google.gson.annotations.SerializedName

class Province (
    @SerializedName("kode_Provi")
    val code: Int,
    @SerializedName("Provinsi")
    val province: String,
    @SerializedName("Kasus_Posi")
    val positive:Int,
    @SerializedName("Kasus_Semb")
    val recover:Int,
    @SerializedName("Kasus_meni")
    val death: Int
)
