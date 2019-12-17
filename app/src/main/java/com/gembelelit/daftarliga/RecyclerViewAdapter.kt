package com.gembelelit.daftarliga

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.jetbrains.anko.AnkoContext

class RecyclerViewAdapter(
    var list: ArrayList<Liga> = arrayListOf()
) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    var onItemClick: ((Liga)->Unit)?=null

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle = itemView.findViewById<TextView>(LigaUI.tvTitleId)
        var tvYear = itemView.findViewById<TextView>(LigaUI.tvYearId)

        fun bindItem(items: Liga) {
            tvTitle.text = "${items.title}"
            tvYear.text = "${items.year}"
            itemView.setOnClickListener {
                onItemClick?.invoke(items)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LigaUI().createView(AnkoContext.create(parent.context, parent)))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // mengambil nilai dari arraylist
        val liga = list[position]
        holder.bindItem(liga)

    }

}