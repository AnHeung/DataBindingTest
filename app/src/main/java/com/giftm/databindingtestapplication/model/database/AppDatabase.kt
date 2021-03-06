package com.giftm.databindingtestapplication.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.giftm.databindingtestapplication.model.Post
import com.giftm.databindingtestapplication.model.PostDao


@Database(entities = [Post::class] , version = 1)
abstract class AppDatabase : RoomDatabase (){
    abstract  fun postDao(): PostDao
}