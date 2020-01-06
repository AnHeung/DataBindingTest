package com.giftm.databindingtestapplication.ui.post

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.giftm.databindingtestapplication.R
import com.giftm.databindingtestapplication.databinding.ActivityPostListBinding
import com.giftm.databindingtestapplication.injection.ViewModelFactory
import com.giftm.databindingtestapplication.injection.component.ViewModelInjector
import com.google.android.material.snackbar.Snackbar

class PostListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPostListBinding
    private lateinit var viewModel: PostListViewModel
    private var errorsnackBar : Snackbar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = DataBindingUtil.setContentView(this , R.layout.activity_post_list)
        binding.postRecv.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL , false)

        viewModel = ViewModelProviders.of(this , ViewModelFactory(this)).get(PostListViewModel::class.java)
        viewModel.errorMessage.observe(this,  Observer { errorMsg->if(errorMsg != null) showError(errorMsg)  else hideError()})

        binding.viewModel = viewModel
    }

    private fun showError(@StringRes errorMsg : Int){
        errorsnackBar = Snackbar.make(binding.root , errorMsg , Snackbar.LENGTH_INDEFINITE)
        errorsnackBar?.setAction(R.string.app_name,  viewModel.errorClickListener)
        errorsnackBar?.show()
    }

    private fun hideError(){
        errorsnackBar?.dismiss()
    }
}
