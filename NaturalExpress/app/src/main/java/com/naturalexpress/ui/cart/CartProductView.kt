package com.naturalexpress.ui.cart

import android.view.ViewGroup
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.naturalexpress.databinding.BannerItemBinding
import com.naturalexpress.databinding.CartItemBinding
import com.naturalexpress.model.Banner
import com.naturalexpress.model.ProductOrder
import com.squareup.picasso.Picasso

class CartProductView(viewGroup: ViewGroup): ATViewHolder<ProductOrder, CartItemBinding>(
    CartItemBinding::inflate,
    viewGroup
) {
    override fun bind(item: ProductOrder) {
        val price = item.product.price * item.amount
        var amount = item.amount
        binding.txtAmountCartProduct.text = "$amount"
        binding.txtCartProduct.text = item.product.name
        binding.txtPriceCartProduct.text = "R$ $price"

        binding.plus.setOnClickListener {
            item.amount += 1
            amount = item.amount
            val price = item.product.price * item.amount
            binding.txtAmountCartProduct.text = "$amount"
            binding.txtPriceCartProduct.text = "R$ $price"
        }

        binding.menus.setOnClickListener {
            item.amount -= 1
            amount = item.amount
            val price = item.product.price * item.amount
            binding.txtAmountCartProduct.text = "$amount"
            binding.txtPriceCartProduct.text = "R$ $price"
        }
    }
}