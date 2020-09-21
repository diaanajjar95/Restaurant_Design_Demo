package com.example.restaurantdesigndemo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ListItem(val title: String?, val itemCount: Int, val image: String?) : Parcelable