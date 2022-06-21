package com.basemnasr.unittestingexample3roomdb.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.basemnasr.unittestingexample3roomdb.repositories.FakeShoppingRepositoryAndroidTest
import com.basemnasr.unittestingexample3roomdb.ui.adapters.ImageAdapter
import com.basemnasr.unittestingexample3roomdb.ui.adapters.ShoppingItemAdapter
import com.bumptech.glide.RequestManager
import javax.inject.Inject

class TestShoppingFragmentFactory @Inject constructor(
    private val imageAdapter: ImageAdapter,
    private val glide: RequestManager,
    private val shoppingItemsAdapter:ShoppingItemAdapter
): FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when(className) {
            ImagePickFragment::class.java.name -> ImagePickFragment(imageAdapter)
            AddShoppingItemFragment::class.java.name -> AddShoppingItemFragment(glide)
            ShoppingFragment::class.java.name -> ShoppingFragment(
                shoppingItemsAdapter,
                ShoppingViewModel(FakeShoppingRepositoryAndroidTest())
                )
            else -> super.instantiate(classLoader, className)
        }
    }
}