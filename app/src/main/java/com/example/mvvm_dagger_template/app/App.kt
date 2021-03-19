package com.example.mvvm_dagger_template.app

import com.example.mvvm_dagger_template.di.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class App : DaggerApplication()
{
    /*
     injecting ApplicationComponent::class
     */
    private val applicationInjector = DaggerApplicationComponent.builder().applicationBind(this).build()
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = applicationInjector

}