package com.naturalexpress.ui.requests

import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import co.tiagoaguiar.atway.ui.adapter.ATAdapter
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.naturalexpress.databinding.CategoryItemBinding
import com.naturalexpress.databinding.OrderItemBinding
import com.naturalexpress.model.Category
import com.naturalexpress.model.Order

class OrderView(viewGroup: ViewGroup): ATViewHolder<Order, OrderItemBinding>(
    OrderItemBinding::inflate,
    viewGroup
) {

    override fun bind(item: Order) {
        var items = 0
        for (item in item.products) {
            items += item.amount
        }
        binding.let {
            it.descriptionOrderValue.text = "valor do pedido: R$ ${item.price}"
            it.descriptionOrderNumItems.text = "$items itens"
        }
    }
}