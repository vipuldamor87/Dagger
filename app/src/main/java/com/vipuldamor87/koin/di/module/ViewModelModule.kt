package com.vipuldamor87.koin.di.module

import com.vipuldamor87.koin.ui.main.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

    val viewModelModule = module {
        viewModel {
            MainViewModel(get(),get())
        }
    }
