package com.naturalexpress.ui.cart

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.text.InputType
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import co.tiagoaguiar.atway.ui.adapter.ATAdapter
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.naturalexpress.databinding.FragmentCartBinding
import com.naturalexpress.model.Order
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
            if (Repository.address == "") {
                it.addressButton.hint = "Adicionar Enderenço"
            } else {
                it.addressButton.text = Repository.address
            }

            it.addressButton.setOnClickListener {
                showDialog(it as Button)
            }
            it.btCancelOrder.setOnClickListener {
                if (Repository.order.products.isEmpty()){
                    showEmptyCartDialog("Carrinho Vazio")
                } else {
                    showCancelDialog()
                }
            }
            it.btFinalizeOrder.setOnClickListener {
                when {
                    Repository.order.products.isEmpty() -> {
                        showEmptyCartDialog("Carrinho Vazio")
                    }
                    Repository.address == "" -> {
                        showEmptyCartDialog("Endereço Nulo")
                    }
                    else -> {
                        showFinalizeDialog()

                    }
                }

            }
        }
    }

    private fun showEmptyCartDialog(string: String) {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle(string)
            .setNegativeButton("Okay") {dialog, which ->
                dialog.cancel()
            }
            .show()
    }

    private fun showCancelDialog() {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Cancelar Pedido")
            .setPositiveButton("Sim") {dialog, which ->
                Repository.order = Order()
            }
            .setNegativeButton("Não") {dialog, which ->
                dialog.cancel()
            }
            .show()
    }

    private fun showFinalizeDialog() {
        var price = 0.0
        for (item in Repository.order.products) {
            price += item.price
        }
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Confirmar Pedido")
            .setMessage("Verifique se não falta nada. Total do pedido: R$ $price")
            .setPositiveButton("Confirmar") {dialog, which ->
                Repository.order.price = price
                Repository.order.address = Repository.address
                Repository.orders.add(Repository.order)
                Repository.order = Order()
            }
            .setNegativeButton("Revisar") {dialog, which ->
                dialog.cancel()
            }
            .show()
    }



    private fun showDialog(button: Button){
        val builder: AlertDialog.Builder = android.app.AlertDialog.Builder(requireView().context)
        builder.setTitle("Endereço")
        val input = EditText(requireContext())
// Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
        input.setHint("Endereço")
        input.setText(button.text)
        input.inputType = InputType.TYPE_CLASS_TEXT
        builder.setView(input)
        builder.setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which ->
            var m_Text = input.text.toString()
            button.text = m_Text
            Repository.address = m_Text
        })
        builder.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, which -> dialog.cancel() })

        builder.show()
    }
}