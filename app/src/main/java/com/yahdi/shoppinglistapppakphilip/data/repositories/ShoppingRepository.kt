package com.yahdi.shoppinglistapppakphilip.data.repositories

import com.yahdi.shoppinglistapppakphilip.data.db.ShoppingDatabase
import com.yahdi.shoppinglistapppakphilip.data.db.entities.ShoppingItem

class ShoppingRepository(
    private val db: ShoppingDatabase
) {
    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)

    suspend fun remove(item: ShoppingItem) = db.getShoppingDao().remove(item)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()
}