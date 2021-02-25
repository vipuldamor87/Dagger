package com.vipuldamor87.koin.di.module

import com.vipuldamor87.koin.data.api.ApiHelper
import com.vipuldamor87.koin.data.api.ApiHelperImpl
import com.vipuldamor87.koin.data.repository.MainRepository
import org.koin.dsl.module

    val repoModule = module {
        single {
            MainRepository(get())
        }
        single<ApiHelper> {
            return@single ApiHelperImpl(get())
        }
    }
