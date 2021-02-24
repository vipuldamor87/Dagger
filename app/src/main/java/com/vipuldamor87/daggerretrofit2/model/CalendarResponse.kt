package com.vipuldamor87.daggerretrofit2.model
import com.google.gson.annotations.SerializedName


class CalenderResponse {
    @SerializedName("data")
    var data: List<MatchCalender>? = null
}
