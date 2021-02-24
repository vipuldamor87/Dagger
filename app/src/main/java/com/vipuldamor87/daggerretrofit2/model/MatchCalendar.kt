package com.vipuldamor87.daggerretrofit2.model

import com.google.gson.annotations.SerializedName


class MatchCalender(
    @field:SerializedName("unique_id") var uniqueId: String, @field:SerializedName(
        "name"
    ) var name: String, @field:SerializedName("date") var date: String
)
