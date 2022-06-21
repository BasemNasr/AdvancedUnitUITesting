package com.basemnasr.unittestingexample3roomdb.repositories

import androidx.lifecycle.LiveData
import com.basemnasr.unittestingexample3roomdb.data.local.ShoppingItem
import com.basemnasr.unittestingexample3roomdb.data.remote.responses.ImageResponse
import com.basemnasr.unittestingexample3roomdb.other.Resource


interface ShoppingRepository {

    suspend fun insertShoppingItem(shoppingItem: ShoppingItem)

    suspend fun deleteShoppingItem(shoppingItem: ShoppingItem)

    fun observeAllShoppingItems(): LiveData<List<ShoppingItem>>

    fun observeTotalPrice(): LiveData<Float>

    suspend fun searchForImage(imageQuery: String): Resource<ImageResponse>
}