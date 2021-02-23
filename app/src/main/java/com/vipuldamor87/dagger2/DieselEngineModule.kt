package com.vipuldamor87.dagger2

import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {
    @Provides
    fun provideDieselEngine(dieselEngine: DieselEngine): Engine{
        return dieselEngine
    }
}