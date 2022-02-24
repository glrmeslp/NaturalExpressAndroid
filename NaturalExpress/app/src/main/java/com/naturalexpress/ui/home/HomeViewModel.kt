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
        value = Repository.banners
    }

    private val _categories = MutableLiveData<ArrayList<Category>>().apply {
        value = Repository.categories
    }

    val banners: LiveData<ArrayList<Banner>> = _banners
    val categories: LiveData<ArrayList<Category>> = _categories

}