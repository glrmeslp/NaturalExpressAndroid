package com.naturalexpress.ui.cart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import co.tiagoaguiar.atway.ui.adapter.ATAdapter
import com.naturalexpress.databinding.FragmentCartBinding
import com.naturalexpress.model.Repository
import com.naturalexpress.ui.home.BannerView

class CartFragment : Fragment() {

    private var _binding: FragmentCartBinding? = null

    private val cartAdapter = ATAdapter({ CartProductView(it) })
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentCartBinding.inflate(inflater, container, false)
        val root: View = binding.root


        setupViews()
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun setupViews() {
        cartAdapter.items = Repository.order.products
        binding.let {
            it.rvCartProducts.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            it.rvCartProducts.adapter = cartAdapter
        }
    }
}