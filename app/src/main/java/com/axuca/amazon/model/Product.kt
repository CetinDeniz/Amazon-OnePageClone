package com.axuca.amazon.model

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes

/**
 * List Item height in the row is equal to maximum list item height in that row
 *
 * - Eklenebilir -
 * önceki fiyatı -> indirim varsa
 * toplu alım indirimi
 */

data class Product(
    val id: Int,

    val choiceOfAmazon:Boolean,
    val bestSeller: Boolean,

    @DrawableRes
    val image: Int,

    val title:String,

    val rating: Float,
    val reviewCount:Int,

    val price: String,/** Can be change */

    val stock: Int, /** If stock < 10 -> show stock information in the list_item */

    /** Logic in here must be think wisely */
    val primeAvailable:Boolean,
    val primeDeliveryDate: String,
    val normalDeliveryDate: String,
)