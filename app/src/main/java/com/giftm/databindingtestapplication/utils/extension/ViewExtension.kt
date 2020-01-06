package com.giftm.databindingtestapplication.utils.extension

import android.content.ContextWrapper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.giftm.databindingtestapplication.utils.testval
import com.giftm.databindingtestapplication.utils.lastChar

fun View.getParentActivity(): AppCompatActivity?{

    val context = this.context

    "test".lastChar()
    "haha".testval

    while(context is ContextWrapper){
        if(context is AppCompatActivity){
            return context
        }
    }
    return null
}
