package com.naturalexpress.ui.home

import android.app.AlertDialog
import android.content.DialogInterface
import android.text.InputType
import android.util.Log
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.naturalexpress.databinding.ProductItemBinding
import com.naturalexpress.model.Product
import com.naturalexpress.model.ProductOrder
import com.naturalexpress.model.Repository
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
        binding.txtPrice.text = "R$ " + item.price
        binding.imgProduct.setOnClickListener {
            showDialog(item)
        }
    }

    fun showDialog(item: Product){
        val builder: AlertDialog.Builder = android.app.AlertDialog.Builder(itemView.context)
        builder.setTitle("Adicionar item ao Carrinho?")

        builder.setPositiveButton("Adicionar", DialogInterface.OnClickListener { dialog, which ->
            val productOrder = ProductOrder(item)
            Repository.order.products.add(productOrder)
            Log.d("Tag", Repository.order.toString())
        })
        builder.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, which -> dialog.cancel() })

        builder.show()
    }
}