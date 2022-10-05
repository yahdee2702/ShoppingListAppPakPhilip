package com.yahdi.shoppinglistapppakphilip.ui.shoppinglist

import androidx.lifecycle.ViewModel
import com.yahdi.shoppinglistapppakphilip.data.db.entities.ShoppingItem
import com.yahdi.shoppinglistapppakphilip.data.repositories.ShoppingRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ShoppingViewModel(
    private val repository: ShoppingRepository,
) : ViewModel() {
    fun upsert(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repository.upsert(item)
    }

    fun remove(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repository.remove(item)
    }

    fun getAllShoppingItems() = repository.getAllShoppingItems()
}