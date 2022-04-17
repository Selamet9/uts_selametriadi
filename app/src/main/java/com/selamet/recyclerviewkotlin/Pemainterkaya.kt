package com.selamet.recyclerviewkotlin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class Pemainterkaya(
    val imgPemainterkaya: Int,
    val namePemainterkaya: String,
    val descPemainterkaya: String,
) :Parcelable
