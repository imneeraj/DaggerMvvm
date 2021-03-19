package com.example.mvvm_dagger_template.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject


abstract class BaseActivity<BVM : BaseViewModel>: DaggerAppCompatActivity()
{
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    abstract val viewModel : BVM
}