package com.naturalexpress.ui.home

import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import co.tiagoaguiar.atway.ui.adapter.ATAdapter
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.naturalexpress.databinding.CategoryItemBinding
import com.naturalexpress.model.Category

class CategoryView(viewGroup: ViewGroup): ATViewHolder<Category, CategoryItemBinding>(
    CategoryItemBinding::inflate,
    viewGroup
) {

    private val productAdapter = ATAdapter ({ ProductView(it)})

    override fun bind(item: Category) {
        binding.txtCategory.text = item.name

        productAdapter.items = item.products

        binding.let {
            it.rvCategory.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
            it.rvCategory.adapter = productAdapter
        }
    }
}