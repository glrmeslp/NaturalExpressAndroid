package com.naturalexpress.model

data class ProductOrder(
    val product: Product,
    var amount: Int = 1,
    var price: Double = amount * product.price
)
