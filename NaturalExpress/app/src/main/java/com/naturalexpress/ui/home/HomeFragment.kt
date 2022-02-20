package com.naturalexpress.ui.home

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.text.Editable
import android.text.InputType
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.naturalexpress.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        setupViews()

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun setupViews() {
        val viewPager = binding.viewPagerHome
        val adapter = ViewPagerAdapter(this)
        viewPager.adapter = adapter
        viewPager.isUserInputEnabled = false
    }

    class ViewPagerAdapter(fa: HomeFragment) : FragmentStateAdapter(fa) {
        val fragment = ProductsFragment()

        override fun getItemCount(): Int = 1

        override fun createFragment(position: Int): Fragment {
            return fragment
        }
    }
}