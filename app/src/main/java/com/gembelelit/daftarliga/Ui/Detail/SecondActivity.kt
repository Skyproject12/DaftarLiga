package com.gembelelit.daftarliga.Ui.Detail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.gembelelit.daftarliga.Component.DetailUi
import com.gembelelit.daftarliga.R
import org.jetbrains.anko.setContentView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        var judul = intent.getStringExtra("judul")
        var deskripsi = intent.getStringExtra("deskripsi")
        var gambar = intent.getIntExtra("gambar", 0)
        DetailUi(judul, deskripsi, gambar).setContentView(this)
    }
}
