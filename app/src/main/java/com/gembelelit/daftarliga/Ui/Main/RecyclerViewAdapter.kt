package com.gembelelit.daftarliga.Ui.Main

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gembelelit.daftarliga.Model.Liga
import com.gembelelit.daftarliga.Component.LigaUI
import org.jetbrains.anko.AnkoContext

class RecyclerViewAdapter(
    var list: ArrayList<Liga> = arrayListOf()
) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    var onItemClick: ((Liga)->Unit)?=null

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle = itemView.findViewById<TextView>(LigaUI.tvTitleId)
        var tvYear = itemView.findViewById<TextView>(LigaUI.tvYearId)
        var imageLiga= itemView.findViewById<ImageView>(LigaUI.imageLiga)

        fun bindItem(items: Liga) {
            tvTitle.text = "${items.judul}"
            tvYear.text = "${items.deskripsi}"
            imageLiga.setImageResource(items.gambar)
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