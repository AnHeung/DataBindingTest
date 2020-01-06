package com.giftm.databindingtestapplication.injection.component

import com.giftm.databindingtestapplication.injection.module.NetworkModule
import com.giftm.databindingtestapplication.ui.post.PostListViewModel
import com.giftm.databindingtestapplication.ui.post.PostViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjector{

    fun inject(postListViewModel: PostListViewModel)

    fun inject(postViewModel: PostViewModel)

    @Component.Builder
    interface Builder{

        fun build(): ViewModelInjector

        fun networkModule(networkModule : NetworkModule) : Builder
    }
}