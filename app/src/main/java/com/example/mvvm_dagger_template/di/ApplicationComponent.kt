package com.example.mvvm_dagger_template.di

import android.app.Application
import com.example.mvvm_dagger_template.app.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidInjectionModule::class,
        ActivityModule::class,
        //FragmentsModule::class,
        ViewModelModule::class
    ]
)
interface ApplicationComponent : AndroidInjector<App> {

    override fun inject(app: App)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun applicationBind(application: Application): Builder

        fun build(): ApplicationComponent
    }
}