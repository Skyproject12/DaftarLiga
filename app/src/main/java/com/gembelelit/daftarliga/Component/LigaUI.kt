package com.gembelelit.daftarliga.Component

import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import org.jetbrains.anko.*

class LigaUI : AnkoComponent<ViewGroup> {
    companion object {
        val tvTitleId = 1
        val tvYearId = 2
        val imageLiga = 3;
    }

    override fun createView(ui: AnkoContext<ViewGroup>): View = with(ui) {
        linearLayout {
            orientation = LinearLayout.HORIZONTAL
            lparams(matchParent, wrapContent)
            backgroundColor= Color.WHITE
            padding = dip(16)
            imageView {
                id = imageLiga
            }.lparams(width = 60, height = 60)

            verticalLayout {
                // dimana width memiliki ukuran matchparent dan height wrapcontent
                lparams(matchParent, wrapContent)
                // make item for recycer view
                textView {
                    id = tvTitleId
                    layoutParams = LinearLayout.LayoutParams(matchParent, wrapContent)
                    text = "Sherlock"
                    textSize = 16f
                    textColor = Color.BLACK
                }
                textView {
                    id = tvYearId
                    // ukuran dari textview
                    layoutParams = LinearLayout.LayoutParams(matchParent, wrapContent)
                    text = "2009"
                    textSize = 14f
                }
            }

        }
    }
}