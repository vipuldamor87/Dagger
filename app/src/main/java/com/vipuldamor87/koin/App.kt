package com.vipuldamor87.koin

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

import com.vipuldamor87.koin.di.module.appModule
import com.vipuldamor87.koin.di.module.repoModule
import com.vipuldamor87.koin.di.module.viewModelModule

class App : Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(appModule, repoModule, viewModelModule))
        }
    }
}