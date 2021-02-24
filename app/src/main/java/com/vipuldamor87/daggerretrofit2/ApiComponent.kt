package com.vipuldamor87.daggerretrofit2


import com.vipuldamor87.daggerretrofit2.module.ApiClientModule
import com.vipuldamor87.daggerretrofit2.module.AppModule
import dagger.Binds
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApiClientModule::class, AppModule::class])
interface ApiComponent {
    fun inject(mainActivity: MainActivity?)
}
