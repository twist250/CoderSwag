package com.twist.coderswag.Services

import com.twist.coderswag.Model.Category
import com.twist.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")

    )

    val hats = listOf(
        Product("Devslops Graphics beanie", "$18", "hat1"),
        Product("Devslops Hat black", "$20", "hat2"),
        Product("Devslops Hat White", "$18", "hat3"),
        Product("Devslops Hat snapback", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("Devlops Hoodie Gray", "$28", "hoodie1"),
        Product("Devlops Hoodie Red", "$28", "hoodie2"),
        Product("Devlops Hoodie Black", "$28", "hoodie3"),
        Product("Devlops Black Hoodie", "$28", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslops Black shirt", "$20", "shirt1"),
        Product("Devslops Badge Light gray", "$18", "shirt2"),
        Product("Devslops Logo shirt red", "$15", "shirt3"),
        Product("Devslops Hustle", "$22", "shirt4"),
        Product("Kickflip Studios", "$22", "shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String): List<Product> = when (category) {
        "SHIRTS" -> shirts
        "HATS" -> hats
        "HOODIES" -> hoodies
        else -> digitalGood
    }

}