package com.naturalexpress.ui.home

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import co.tiagoaguiar.atway.ui.adapter.ATAdapter
import com.naturalexpress.R
import com.naturalexpress.databinding.FragmentProductsBinding
import com.naturalexpress.model.FilterItem
import com.naturalexpress.model.toChip

class ProductsFragment : Fragment(R.layout.fragment_products) {

    private var binding: FragmentProductsBinding? = null

    private val bannerAdapter = ATAdapter({ BannerView(it)})
    private val categoryAdapter = ATAdapter ({ CategoryView(it)})

    private var filters = arrayOf(
        FilterItem("Em Destaque"),
        FilterItem("Promoções"),
        FilterItem("Tudo")
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        homeViewModel.banners.observe(viewLifecycleOwner) {
            bannerAdapter.items = it
        }

        homeViewModel.categories.observe(viewLifecycleOwner) {
            categoryAdapter.items = it
        }

        binding = FragmentProductsBinding.bind(view)

        binding?.let {
            it.rvBanners.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            it.rvBanners.adapter = bannerAdapter

            it.rvCategory.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            it.rvCategory.adapter = categoryAdapter

            it.rvBanners.addOnScrollListener(object : RecyclerView.OnScrollListener() {
                override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                    if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                        notifyPositionChanged(recyclerView)
                    }
                }
            })

            addDots(it.dots, bannerAdapter.items.size, 0)

            filters.forEach { filter ->
                it.chipGroupFilter.addView(filter.toChip(requireContext()))
            }
        }
    }

    private fun addDots(container: LinearLayout, size: Int, position: Int) {
        container.removeAllViews()

        Array(size) {
            val textView = TextView(context).apply {
                text = getString(R.string.dotted)
                textSize = 20f
                setTextColor(
                    if (position == it) ContextCompat.getColor(context, android.R.color.black)
                    else ContextCompat.getColor(context, android.R.color.darker_gray)
                )
            }
            container.addView(textView)
        }
    }

    private var position: Int? = RecyclerView.NO_POSITION
    private val snapHelper = LinearSnapHelper()

    private fun notifyPositionChanged(recyclerView: RecyclerView) {
        val layoutManager = recyclerView.layoutManager
        val view = snapHelper.findSnapView(layoutManager)
        val position = if (view == null) RecyclerView.NO_POSITION else layoutManager?.getPosition(view)

        val positionChanged = this.position != position
        if (positionChanged) {
            addDots(binding!!.dots, bannerAdapter.items.size, position ?: 0)
        }
        this.position = position
    }
}

