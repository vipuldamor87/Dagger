package com.vipuldamor87.daggerretrofit2.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vipuldamor87.daggerretrofit2.R
import com.vipuldamor87.daggerretrofit2.model.MatchCalender


class MatchCalenderAdapter(matchlist: List<MatchCalender>, context: Context) :
    RecyclerView.Adapter<MatchCalenderAdapter.MatchCalenderViewHolder?>() {
    var matchlist: List<MatchCalender>
    var context: Context

    class MatchCalenderViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var name: TextView
        var date: TextView

        init {
            name = v.findViewById<View>(R.id.name) as TextView
            date = v.findViewById<View>(R.id.date) as TextView
        }
    }

    override fun onBindViewHolder(holder: MatchCalenderViewHolder, position: Int) {
        holder.name.text = matchlist[position].date
        holder.date.text = matchlist[position].name
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MatchCalenderViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.match_calender_item, parent, false)
        return MatchCalenderViewHolder(view)
    }

    override fun getItemCount(): Int {
        return matchlist.size
    }

    init {
        this.matchlist = matchlist
        this.context = context
    }
}

