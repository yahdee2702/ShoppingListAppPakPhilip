package com.yahdi.shoppinglistapppakphilip.ui.shoppinglist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.yahdi.shoppinglistapppakphilip.data.repositories.ShoppingRepository

class ShoppingViewModelProvider(private val repository: ShoppingRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        @Suppress("UNCHECKED_CAST")
        if (modelClass.isAssignableFrom(ShoppingViewModel::class.java)) {
            return ShoppingViewModel(repository) as T
        }

        throw IllegalArgumentException("Not a valid class")
    }
}