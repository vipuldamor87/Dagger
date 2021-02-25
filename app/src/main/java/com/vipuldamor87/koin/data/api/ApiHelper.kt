package com.vipuldamor87.koin.data.api

import com.vipuldamor87.koin.data.model.CalendarResponse
import com.vipuldamor87.koin.data.model.MatchCalendar
import retrofit2.Response

interface ApiHelper {
    suspend fun getUsers(): Response<CalendarResponse>
}