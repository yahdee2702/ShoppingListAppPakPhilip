package com.yahdi.shoppinglistapppakphilip.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.yahdi.shoppinglistapppakphilip.data.db.entities.ShoppingItem

@Dao
interface ShoppingDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: ShoppingItem)

    @Delete
    suspend fun remove(item: ShoppingItem)

    @Query("SELECT * FROM shopping_items")
    fun getAllShoppingItems(): LiveData<List<ShoppingItem>>
}