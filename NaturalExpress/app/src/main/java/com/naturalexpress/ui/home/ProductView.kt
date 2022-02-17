package com.naturalexpress.ui.home

import android.view.ViewGroup
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.naturalexpress.databinding.ProductItemBinding
import com.naturalexpress.model.Product
import com.squareup.picasso.Picasso

class ProductView(viewGroup: ViewGroup): ATViewHolder<Product, ProductItemBinding>(
    ProductItemBinding::inflate,
    viewGroup
) {
    override fun bind(item: Product) {
        Picasso.get()
            .load(item.imgUrl)
            .into(binding.imgProduct)

        binding.txtName.text = item.name
        binding.txtPrice.text = item.price
    }
}