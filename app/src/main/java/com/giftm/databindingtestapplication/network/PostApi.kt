package com.giftm.databindingtestapplication.network

import com.giftm.databindingtestapplication.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface PostApi {

    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}