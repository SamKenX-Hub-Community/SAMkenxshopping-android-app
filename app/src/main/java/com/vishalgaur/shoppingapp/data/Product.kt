package com.vishalgaur.shoppingapp.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "products")
data class Product @JvmOverloads constructor(
    @PrimaryKey
    var productId: String = "",
    var name: String = "",
    var owner: String = "",
    var description: String = "",
    var price: Double = 0.0,
    var availableSizes: List<Int> = ArrayList(),
    var availableColors: List<String> = ArrayList(),
    var images: List<String> = ArrayList(),
    var rating: Double = 0.0
) : Parcelable {
    fun toHashMap(): HashMap<String, Any> {
        return hashMapOf(
            "productId" to productId,
            "name" to name,
            "owner" to owner,
            "price" to price,
            "description" to description,
            "availableSizes" to availableSizes,
            "availableColors" to availableColors,
            "images" to images,
            "rating" to rating
        )
    }
}