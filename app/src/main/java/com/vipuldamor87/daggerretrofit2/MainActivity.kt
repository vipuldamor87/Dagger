package com.vipuldamor87.daggerretrofit2

import android.app.Application
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vipuldamor87.daggerretrofit2.adapter.MatchCalenderAdapter
import com.vipuldamor87.daggerretrofit2.model.CalenderResponse
import com.vipuldamor87.daggerretrofit2.model.MatchCalender
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var retrofit: Retrofit

    @Inject
    lateinit var application: Application

    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as MyApplication).component?.inject(this)

        recyclerView = (findViewById(R.id.match_calender_recycler_view) as RecyclerView?)!!
        recyclerView.setLayoutManager(LinearLayoutManager(this))
        recyclerView.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))
        val apiService = retrofit!!.create(ApiInterface::class.java)
        val call: Call<CalenderResponse?>? = apiService.getMatchCalender(API_KEY)
        call!!.enqueue(object : Callback<CalenderResponse?> {

            override fun onResponse(
                call: Call<CalenderResponse?>?,
                response: Response<CalenderResponse?>?
            ) {
                val statuscode = response!!.code()
                val matchlist: List<MatchCalender> = response.body()!!.data!!
                recyclerView.setAdapter(
                    MatchCalenderAdapter(
                        matchlist,
                        application as MyApplication
                    )
                )
            }

            override fun onFailure(call: Call<CalenderResponse?>?, t: Throwable?) {
                Log.e(TAG, t.toString())
            }
        })
    }

    companion object {
        private const val API_KEY = "7FJc4VS4ZGN4jPk8Bc5iPPU8Djy2"
        private val TAG = MainActivity::class.java.simpleName
    }
}