package com.vipuldamor87.koin.data.model

import com.squareup.moshi.Json

data class CalendarResponse(
        @Json(name = "data")
        var data: List<MatchCalendar>? = null
)