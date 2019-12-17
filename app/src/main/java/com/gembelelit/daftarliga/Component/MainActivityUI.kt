package com.gembelelit.daftarliga.Component

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.gembelelit.daftarliga.Ui.Main.MainActivity
import com.gembelelit.daftarliga.Ui.Main.RecyclerViewAdapter
import com.gembelelit.daftarliga.Ui.Detail.SecondActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class MainActivityUi(val context: Context, val mAdapter: RecyclerViewAdapter) :
    AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>): View = with(ui) {
        return relativeLayout {
            padding = dip(16)
            lparams(width = matchParent, height = wrapContent)
            recyclerView {
                lparams(width = matchParent, height = wrapContent)
                layoutManager = LinearLayoutManager(ctx)
                adapter = mAdapter
                mAdapter.onItemClick = { liga ->
                    startActivity<SecondActivity>(
                        "judul" to liga.judul,
                        "id" to liga.id,
                        "deskripsi" to liga.deskripsi,
                        "gambar" to liga.gambar
                    )
                }
            }
        }
    }
}