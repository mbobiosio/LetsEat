package com.mbobiosio.letseat.model

import android.os.Parcel
import android.os.Parcelable

class Foods constructor(var food: String, var breakfast: String, var lunch: String, var dinner: String) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(food)
        parcel.writeString(breakfast)
        parcel.writeString(lunch)
        parcel.writeString(dinner)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Foods> {
        override fun createFromParcel(parcel: Parcel): Foods {
            return Foods(parcel)
        }

        override fun newArray(size: Int): Array<Foods?> {
            return arrayOfNulls(size)
        }
    }
}