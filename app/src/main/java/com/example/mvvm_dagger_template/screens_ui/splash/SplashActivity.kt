package com.example.mvvm_dagger_template.screens_ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.mvvm_dagger_template.R
import com.example.mvvm_dagger_template.base.BaseActivity
import com.example.mvvm_dagger_template.databinding.ActivitySplashBinding
import com.example.mvvm_dagger_template.screens_ui.landing.LandingActivity

class SplashActivity : BaseActivity<SplashViewModel>() {
    override val viewModel: SplashViewModel by viewModels {
        viewModelFactory
    }

    lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)

    }

    override fun onResume() {
        super.onResume()

        viewModel.startup.observe(this, {
            if (it) {
                startActivity(Intent(this, LandingActivity::class.java))
                finish()
            }
        })

        viewModel.splashStartUp()

    }

}