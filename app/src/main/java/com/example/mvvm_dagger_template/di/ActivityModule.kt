package com.example.mvvm_dagger_template.di

import com.example.mvvm_dagger_template.screens_ui.landing.LandingActivity
import com.example.mvvm_dagger_template.screens_ui.splash.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule
{

    @ContributesAndroidInjector
    abstract fun contributeSplashActivity(): SplashActivity

    @ContributesAndroidInjector
    abstract fun contributeLandingActivity(): LandingActivity

}