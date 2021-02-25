package com.vipuldamor87.koin.data.api

import com.vipuldamor87.koin.data.model.CalendarResponse
import com.vipuldamor87.koin.data.model.MatchCalendar
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("api/matchCalendar/7FJc4VS4ZGN4jPk8Bc5iPPU8Djy2")
    suspend fun getUsers(): Response<CalendarResponse>

}