package com.naturalexpress.model

data class Category(
    val id: Int,
    val name: String,
    val products: ArrayList<Product>
)
