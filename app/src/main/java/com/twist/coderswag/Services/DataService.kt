package com.twist.coderswag.Services

import com.twist.coderswag.Model.Category
import com.twist.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")

    )

    val hats = listOf(
        Product("Devslops Graphics beanie", "$18", "hat01"),
        Product("Devslops Hat black", "$20", "hat02"),
        Product("Devslops Hat White", "$18", "hat03"),
        Product("Devslops Hat snapback", "$22", "hat04")
    )

    val hoodies = listOf(
        Product("Devlops Hoodie Gray","$28","hoodie01"),
        Product("Devlops Hoodie Red","$28","hoodie02"),
        Product("Devlops Hoodie Black","$28","hoodie03"),
        Product("Devlops Black Hoodie","$28","hoodie04")
    )

    val shirts = listOf(
        Product("Devslops Black shirt","$20","shirt01"),
        Product("Devslops Badge Light gray","$18","shirt02"),
        Product("Devslops Logo shirt red","$15","shirt03"),
        Product("Devslops Hustle","$22","shirt04"),
        Product("Kickflip Studios","$22","shirt05")
    )

}