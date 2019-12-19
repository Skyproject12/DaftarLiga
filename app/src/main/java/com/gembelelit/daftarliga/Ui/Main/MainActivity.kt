package com.gembelelit.daftarliga.Ui.Main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.gembelelit.daftarliga.Model.Liga
import com.gembelelit.daftarliga.Component.MainActivityUi
import com.gembelelit.daftarliga.R
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerview.layoutManager = LinearLayoutManager(this)
        val list: ArrayList<Liga> = arrayListOf()
        list.add(
            Liga(
                4328,
                "English Premier League",
                "The Premier League (often referred to as the English Premier League (EPL)",
                R.drawable.english_premier_league
            )
        )
        list.add(
            Liga(
                4334,
                "French Ligue 1",
                "Ligue 1 (French pronunciation: \u200B; League 1, formerly known as Division 1)",
                R.drawable.french_ligue
            )
        )
        list.add(
            Liga(
                4331,
                "German Bundesliga",
                "The Fußball-Bundesliga (English: Football Federal League), commonly known as",
                R.drawable.german_bundesliga
            )
        )
        list.add(
            Liga(
                4332,
                "Italian Serie A",
                "Serie A, also called Serie A TIM due to sponsorship by Telecom Italia, is",
                R.drawable.italian_serie_a
            )
        )
        list.add(
            Liga(
                4335,
                "Spanish La Liga",
                "The Primera División, commonly known as La Liga and as La Liga ",
                R.drawable.spanish_la_liga
            )
        )
        list.add(
            Liga(
                4346,
                "American Mayor League",
                "Major League Soccer (MLS) is a professional soccer league representing",
                R.drawable.american_mayor_league
            )
        )
        list.add(
            Liga(
                4344,
                "Protugeuese Premiera Liga",
                "The Primeira Liga (First League; Portuguese pronunciation: ), formerly ",
                R.drawable.portugeuese_premiera_liga
            )
        )
        list.add(
            Liga(
                4356,
                "Australian A League",
                "The A-League is a professional men's soccer league, run by Football Federation",
                R.drawable.australian_a_league
            )
        )
        list.add(
            Liga(
                4330,
                "Scotish Premier League",
                "The Scottish Premiership is the top division of the Scottish Professional",
                R.drawable.scotish_premier_league
            )
        )
        list.add(
            Liga(
                4396,
                "English League 1",
                "Football League One (often referred to as League One for short or Sky Bet",
                R.drawable.english_league
            )
        )
        val adapter: RecyclerViewAdapter =
            RecyclerViewAdapter(list)
        MainActivityUi(this, adapter).setContentView(this)
    }


}
