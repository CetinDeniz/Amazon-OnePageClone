package com.axuca.amazon.data

import android.content.Context
import com.axuca.amazon.MainActivity
import com.axuca.amazon.R
import com.axuca.amazon.model.Product

fun getProducts(context: Context): List<Product> {
    return arrayListOf(
        Product(
            1,
            true,
            false,
            R.drawable.macbook,
            "2021 Apple MacBook Pro (14 inç, 8 çekirdekli CPU’ya ve…",
            4.5f,
            49,
            "30.950",
            9,
            true,
            "Kargo BEDAVA: 9 Mayıs Pazartesi tarihinde teslim alın.",
            "Normal Delivery Date"
        ),
        Product(
            3,
            false,
            false,
            R.drawable.mac_mini,
            "Mac mini: Apple M1 chip with 8‑core CPU and 8‑core GPU…",
            3.5f,
            50,
            "11.790",
            20,
            true,
            "Kargo BEDAVA: 9 Mayıs Pazartesi tarihinde teslim alın.",
            "Normal Delivery Date"
        ),
        Product(
            2,
            false,
            false,
            R.drawable.macbook_pro_2021_m1_pro_preview_rev_1,
            "2021 Apple MacBook Pro (16 inç, 10 çekirdekli CPU’ya ve…",
            5f,
            12,
            "41.060",
            11,
            true,
            "Kargo BEDAVA: 9 Mayıs Pazartesi tarihinde teslim alın.",
            "Normal Delivery Date"
        ),
        Product(
            4,
            true,
            false,
            R.drawable.apple_airpods_pro,
            "Apple AirPods Pro ( Yeni Nesil MagSafe Şarj Kutulu) 2021",
            5f,
            50,
            "3.300",
            15,
            true,
            "Kargo BEDAVA: 9 Mayıs Pazartesi tarihinde teslim alın.",
            "Normal Delivery Date"
        )
//        ,
//        Product(
//            5,
//            false,
//            true,
//            R.drawable.macbook_air_2020_m1,
//            "2020 Apple MacBook Air Laptop: Apple M1 Çip, 13 inç Retina Ekran, 8 GB RAM, 256 GB SSD Depolama, Arkadan Aydınlatmalı Klavye, FaceTime HD Kamera, Touch ID. iPhone/iPad ile çalışır; Uzay Grisi",
//            4.5f,
//            50,
//            "14.685,29TL",
//            20,
//            true,
//            "ÜCRETSİZ teslimat 7 Mayıs Cumartesi. 22 saat 15 dakika içinde sipariş verirseniz",
//            "Normal Delivery Date"
//        ),
//        Product(
//            6,
//            true,
//            false,
//            R.drawable.macbook_pro_2020_m1,
//            "2020 Apple Macbook Pro (13 inç, 8 Çekirdekli CPU'ya ve 8 Çekirdekli GPU'ya Sahip Apple M1 Çip, 8 GB RAM, 256 GB SSD) - Uzay Grisi",
//            4.5f,
//            50,
//            "19.599,00TL",
//            5,
//            true,
//            "ÜCRETSİZ teslimat 7 Mayıs Cumartesi. 22 saat 10 dakika içinde sipariş verirseniz",
//            "Normal Delivery Date"
//        ),
//        Product(
//            5,
//            false,
//            true,
//            R.drawable.apple_iphone_13_mini,
//            "Apple iPhone 13 mini (128 GB) - Mavi",
//            4.5f,
//            50,
//            "17.081,90TL",
//            20,
//            true,
//            "ÜCRETSİZ teslimat 7 Mayıs Cumartesi. 21 saat 29 dakika içinde sipariş verirseniz",
//            "Normal Delivery Date"
//        ),
//        Product(
//            6,
//            true,
//            false,
//            R.drawable.apple_ipad_pro,
//           "2021 Apple iPad Pro (12.9 inç, Wi-Fi, 128 GB) - Uzay Grisi (5. nesil)",
//            4.5f,
//            50,
//            "17.984,60TL",
//            8,
//            true,
//            "ÜCRETSİZ teslimat 7 Mayıs Cumartesi. 21 saat 29 dakika içinde sipariş verirseniz",
//            "Normal Delivery Date"
//        )
    )
}