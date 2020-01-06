package com.giftm.databindingtestapplication.base

import androidx.lifecycle.ViewModel
import com.giftm.databindingtestapplication.injection.component.DaggerViewModelInjector
import com.giftm.databindingtestapplication.injection.component.ViewModelInjector
import com.giftm.databindingtestapplication.injection.module.NetworkModule
import com.giftm.databindingtestapplication.ui.post.PostListViewModel
import com.giftm.databindingtestapplication.ui.post.PostViewModel

abstract class BaseViewModel : ViewModel(){

    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init{
        inject()
    }

    private fun inject() {
        when(this){
            is PostListViewModel -> injector.inject(this)
            is PostViewModel -> injector.inject(this)
        }
    }
}