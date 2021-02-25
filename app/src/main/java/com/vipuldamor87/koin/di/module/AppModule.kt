package com.vipuldamor87.koin.di.module

import android.content.Context
import com.vipuldamor87.koin.BuildConfig
import com.vipuldamor87.koin.data.api.ApiHelper
import com.vipuldamor87.koin.data.api.ApiHelperImpl
import com.vipuldamor87.koin.data.api.ApiService
import com.vipuldamor87.koin.utils.NetworkHelper
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

    val appModule = module {
        single { provideOkHttpClient() }
        single { provideRetrofit(get(), "https://cricapi.com") }
        single { provideApiService(get()) }
        single { provideNetworkHelper(androidContext()) }
    }

    private fun provideNetworkHelper(context: Context) = NetworkHelper(context)

    private fun provideOkHttpClient() = if (BuildConfig.DEBUG) {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()
    } else OkHttpClient
        .Builder()
        .build()

    private fun provideRetrofit(
        okHttpClient: OkHttpClient,
        BASE_URL: String
    ): Retrofit =
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .build()

    private fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)

    private fun provideApiHelper(apiHelper: ApiHelperImpl): ApiHelper = apiHelper
