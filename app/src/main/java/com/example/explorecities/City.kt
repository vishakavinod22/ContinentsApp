package com.example.explorecities

import android.os.Parcel
import android.os.Parcelable

data class City(
    val cityName: String?,
    val cityImage: Int,
    var continentName: String?,
    val spokenLanguage: String?,
    val population: String?,
    val famousDish: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(cityName)
        parcel.writeInt(cityImage)
        parcel.writeString(continentName)
        parcel.writeString(spokenLanguage)
        parcel.writeString(population)
        parcel.writeString(famousDish)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<City> {
        override fun createFromParcel(parcel: Parcel): City {
            return City(parcel)
        }

        override fun newArray(size: Int): Array<City?> {
            return arrayOfNulls(size)
        }
    }
}
