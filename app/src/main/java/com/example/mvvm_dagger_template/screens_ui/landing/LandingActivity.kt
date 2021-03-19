package com.example.mvvm_dagger_template.screens_ui.landing

import android.os.Bundle
import androidx.activity.viewModels
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mvvm_dagger_template.R
import com.example.mvvm_dagger_template.base.BaseActivity
import com.example.mvvm_dagger_template.databinding.ActivityLandingBinding

class LandingActivity : BaseActivity<LandingViewModel>() {

    override val viewModel: LandingViewModel by viewModels {
        viewModelFactory
    }
    lateinit var binding: ActivityLandingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_landing)
        setSupportActionBar(binding.toolbar)

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}