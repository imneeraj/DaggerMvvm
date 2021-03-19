package com.example.mvvm_dagger_template.screens_ui.splash

import android.os.Looper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvm_dagger_template.base.BaseViewModel
import com.example.mvvm_dagger_template.utilities.AppUtils
import kotlinx.coroutines.delay
import java.util.logging.Handler
import javax.inject.Inject

class SplashViewModel @Inject constructor()  : BaseViewModel()
{
    var startup = MutableLiveData<Boolean>()

    // adding delay to simulate some data fetch waiting
    fun splashStartUp()
    {
        android.os.Handler(Looper.getMainLooper()).postDelayed({
            startup.value = true
        }, 2000)


    }
}