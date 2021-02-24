package com.vipuldamor87.daggerretrofit2.module

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AppModule(
    @get:Provides
    @get:Singleton val application: Application
)
