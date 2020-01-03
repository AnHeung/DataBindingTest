package com.giftm.databindingtestapplication.base

import androidx.lifecycle.ViewModel
import com.giftm.databindingtestapplication.injection.component.ViewModelInjector
import com.giftm.databindingtestapplication.injection.module.NetworkModule

class BaseViewModel : ViewModel(){

//    private val injector: ViewModelInjector = DaggerViewModelInjector
//        .builder()
//        .networModule(NetworkModule)
//        .build()

    init{
        inject()
    }

    private fun inject() {
        when(this){

        }
    }

}