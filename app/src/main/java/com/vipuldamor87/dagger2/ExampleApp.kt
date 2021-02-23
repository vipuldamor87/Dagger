package com.vipuldamor87.dagger2

import android.app.Application

class ExampleApp :Application() {
    lateinit var carComponent :CarComponent

    override fun onCreate() {
        super.onCreate()
        carComponent = DaggerCarComponent.builder()
            .powerCapacity(200)
            .engineCapacity(10)
            .build()
    }
    fun  carComponent(): CarComponent{
        return carComponent
    }
}