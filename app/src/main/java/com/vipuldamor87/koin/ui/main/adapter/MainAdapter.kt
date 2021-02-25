package com.vipuldamor87.koin.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vipuldamor87.koin.R
import com.vipuldamor87.koin.data.model.CalendarResponse
import com.vipuldamor87.koin.data.model.MatchCalendar
import kotlinx.android.synthetic.main.item_layout.view.*

class MainAdapter(

        private val matchCalendar: ArrayList<MatchCalendar>
) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(mc: MatchCalendar) {
            itemView.textViewUserName.text = mc.name
            itemView.textViewUserEmail.text = mc.date
           /* Glide.with(itemView.imageViewAvatar.context)
                .load(user.avatar)
                .into(itemView.imageViewAvatar)*/
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_layout, parent,
                false
            )
        )

    override fun getItemCount(): Int = matchCalendar.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(matchCalendar[position])

    fun addData(list: List<MatchCalendar>) {
        matchCalendar.addAll(list)
    }

}