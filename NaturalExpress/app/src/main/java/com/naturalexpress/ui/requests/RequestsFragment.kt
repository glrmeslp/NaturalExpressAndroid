package com.naturalexpress.ui.requests

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import co.tiagoaguiar.atway.ui.adapter.ATAdapter
import com.naturalexpress.databinding.FragmentRequestsBinding
import com.naturalexpress.model.Repository
import com.naturalexpress.ui.cart.CartProductView

class RequestsFragment : Fragment() {

    private var _binding: FragmentRequestsBinding? = null

    private val orderAdapter = ATAdapter({ OrderView(it) })
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentRequestsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        orderAdapter.items = Repository.orders
        binding.let {
            it.rvRequests.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            it.rvRequests.adapter = orderAdapter
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}