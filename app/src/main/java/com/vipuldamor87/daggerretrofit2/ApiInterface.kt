package com.vipuldamor87.daggerretrofit2


import com.vipuldamor87.daggerretrofit2.model.CalenderResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiInterface {
    @GET("api/matchCalendar")
    fun getMatchCalender(@Query("apikey") apiKey: String?): Call<CalenderResponse?>?
}
