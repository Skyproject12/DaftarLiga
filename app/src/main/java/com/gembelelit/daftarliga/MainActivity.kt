package com.gembelelit.daftarliga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerview.layoutManager = LinearLayoutManager(this)
        val list: ArrayList<Liga> = arrayListOf()
        list.add(Liga("sumendra", 2009))
        list.add(Liga("sumendra", 2009))
        list.add(Liga("sumendra", 2009))
        list.add(Liga("sumendra", 2009))
        list.add(Liga("sumendra", 2009))
        list.add(Liga("sumendra", 2009))
        list.add(Liga("sumendra", 2009))
        val adapter: RecyclerViewAdapter = RecyclerViewAdapter(list)
        MainActivityUi(this, adapter).setContentView(this)
    }


}
