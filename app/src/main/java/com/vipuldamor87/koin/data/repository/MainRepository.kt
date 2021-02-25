package com.vipuldamor87.koin.data.repository

import com.vipuldamor87.koin.data.api.ApiHelper

class MainRepository (private val apiHelper: ApiHelper) {

    suspend fun getUsers() =  apiHelper.getUsers()

}