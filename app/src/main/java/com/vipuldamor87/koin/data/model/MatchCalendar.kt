package com.vipuldamor87.koin.data.model

import com.squareup.moshi.Json

data class MatchCalendar(
        @Json(name = "unique_id")
        val uniqueid: String = "",
        @Json(name = "name")
        val name: String = "",
        @Json(name = "date")
        val date: String = "",
        @Json(name = "avatar")
        val avatar: String = ""
)
