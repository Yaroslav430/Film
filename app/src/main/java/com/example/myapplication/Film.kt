package com.example.myapplication


import android.annotation.SuppressLint
import android.os.Parcel
import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize

@SuppressLint("ParcelCreator")
@VersionedParcelize
 data class Film(
    val title: String,
    val poster: Int,
    val description: String
) : Parcelable {
    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(p0: Parcel, p1: Int) {
        TODO("Not yet implemented")
    }
}


