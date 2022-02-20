package com.naturalexpress.model

data class Order(
    var products: ArrayList<ProductOrder> = ArrayList(),
    var address: String = "",
    var price: Double = 0.0
)
