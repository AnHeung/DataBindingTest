package com.giftm.databindingtestapplication.injection.component

import com.giftm.databindingtestapplication.injection.module.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjector{

    fun inject()
}