package com.giftm.databindingtestapplication.utils

import android.opengl.Visibility
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import com.giftm.databindingtestapplication.utils.extension.getParentActivity

@BindingAdapter("adapter")
fun setAdatper(view:  RecyclerView , adapter : RecyclerView.Adapter<*>){
    view.adapter = adapter
}

@BindingAdapter("mutableVisibility")
fun setMutableVisibility(view : View , visibility: MutableLiveData<Int>?){
    val parentActivity :AppCompatActivity? = view.getParentActivity()

    if(parentActivity != null && visibility!= null){
        visibility.observe(parentActivity , Observer { value->view.visibility = value?:View.VISIBLE })
    }
}

@BindingAdapter("mutableText")
fun setMutableText(view : TextView , text: MutableLiveData<String>?){
    val parentActivity : AppCompatActivity? = view.getParentActivity()
    if(parentActivity != null && text != null){
        text.observe(parentActivity, Observer { value->view.text = value?:"" })
    }
}


val String.testval: String
    get() = "test"

fun String.lastChar() : Char? = this.get(this.length - 1)