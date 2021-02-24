package com.vipuldamor87.daggerretrofit2

import android.app.Application
import com.vipuldamor87.daggerretrofit2.module.ApiClientModule
import com.vipuldamor87.daggerretrofit2.module.AppModule


class MyApplication : Application() {
    private var mApiComponent: ApiComponent? = null
    override fun onCreate() {
        super.onCreate()
        mApiComponent = DaggerApiComponent.builder()
            .appModule(AppModule(this))
            .apiClientModule(ApiClientModule("http://cricapi.com/"))
            .build()
    }

    val component: ApiComponent?
        get() = mApiComponent
}
