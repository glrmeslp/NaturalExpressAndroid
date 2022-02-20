package com.naturalexpress.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.naturalexpress.model.Banner
import com.naturalexpress.model.Category
import com.naturalexpress.model.Product
import com.naturalexpress.model.Repository

class HomeViewModel : ViewModel() {

    private val _banners = MutableLiveData<ArrayList<Banner>>().apply {
        value =  arrayListOf(
            Banner(1, "https://static-images.ifood.com.br/image/upload/t_high/discoveries/itensBasicosNOV21Principal_zE1X.png"),
            Banner(2, "https://static-images.ifood.com.br/image/upload/t_high/discoveries/Bebidas40offPrincipal_cljA.png"),
            Banner(3, "https://static-images.ifood.com.br/image/upload/t_high/discoveries/MerceariaeMatinaisPrincipal_mfDO.png"),
        )
    }

    private val _categories = MutableLiveData<ArrayList<Category>>().apply {
        value = Repository.categories
    }

    val banners: LiveData<ArrayList<Banner>> = _banners
    val categories: LiveData<ArrayList<Category>> = _categories

}