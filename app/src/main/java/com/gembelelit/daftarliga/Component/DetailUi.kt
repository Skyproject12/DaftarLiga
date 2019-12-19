package com.gembelelit.daftarliga.Component

import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import com.gembelelit.daftarliga.Ui.Detail.SecondActivity
import org.jetbrains.anko.*

class DetailUi(val title: String, val deskripsi: String, val gambar: Int) :
    AnkoComponent<SecondActivity> {
    override fun createView(ui: AnkoContext<SecondActivity>): View = with(ui) {
        linearLayout {
            orientation = LinearLayout.VERTICAL
            lparams(matchParent, matchParent)
            backgroundColor = Color.WHITE
            linearLayout {
                orientation = LinearLayout.VERTICAL
                padding = dip(16f)
                lparams(matchParent, matchParent)
                backgroundColor = Color.WHITE
                imageView {
                    id = LigaUI.imageLiga
                    setImageResource(gambar)
                }.lparams(width = 100, height = 100) {
                    gravity = Gravity.CENTER
                }
                textView {
                    id = LigaUI.tvTitleId
                    layoutParams = LinearLayout.LayoutParams(matchParent, wrapContent)
                    text = title
                    textSize = 16f
                    textColor = Color.BLACK
                }
                textView {
                    id = LigaUI.tvYearId
                    // ukuran dari textview
                    layoutParams = LinearLayout.LayoutParams(matchParent, wrapContent)
                    text = deskripsi
                    textSize = 14f
                }
            }
        }
    }
}