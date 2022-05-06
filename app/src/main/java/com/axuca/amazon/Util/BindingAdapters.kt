package com.axuca.amazon.Util

import android.graphics.Color
import android.graphics.Typeface
import android.icu.lang.UProperty.INT_START
import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.style.AbsoluteSizeSpan
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.databinding.BindingAdapter
import com.axuca.amazon.R


@BindingAdapter("image")
fun ImageView.setImage(@DrawableRes drawable: Int) {
    setImageResource(drawable)
}

@BindingAdapter("stockText")
fun TextView.setStockText(stock: Int) {
    visibility = if (stock <= 10) {
        text = "Stokta sadece $stock adet kaldı."
        View.VISIBLE
    } else {
        View.GONE
    }
}

@BindingAdapter("spanText")
fun TextView.setPriceText(price:String){
    val string = SpannableString("$price TL")
    string.setSpan(AbsoluteSizeSpan(24), string.length - 2, string.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
    text = string
}

@BindingAdapter("deliveryText")
fun TextView.setDeliveryText(deliveryDate: String) {
    val string = SpannableString("                  $deliveryDate")
    string.setSpan(AbsoluteSizeSpan(14,true), 32, 49, Spanned.SPAN_INCLUSIVE_INCLUSIVE)
    string.setSpan(ForegroundColorSpan(Color.DKGRAY),32,49,Spanned.SPAN_INCLUSIVE_INCLUSIVE)
    string.setSpan(StyleSpan(Typeface.BOLD), 32, 49, Spannable.SPAN_INCLUSIVE_INCLUSIVE)
    text = string
}

@BindingAdapter("amazonChoice") // , "bestSeller"
fun ImageView.loadImage(amazonChoice: Boolean) { // , bestSeller: Boolean
    when{
        amazonChoice -> {
         visibility = View.VISIBLE
         setImageResource(R.drawable.amazon_choice)
        }
//        bestSeller -> {
//            visibility = View.VISIBLE
//            setImageResource(R.drawable.amazon_best_seller_two)
//        }
        else -> visibility = View.INVISIBLE
    }
}