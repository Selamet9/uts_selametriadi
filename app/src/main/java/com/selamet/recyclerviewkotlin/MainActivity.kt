package com.selamet.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.selamet.recyclerviewkotlin.PemainterkayaAdapter

class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val PemainterkayaList = listOf<Pemainterkaya>(
            Pemainterkaya(
                R.drawable.ronaldo,
                "Cristiano Ronaldo – Rp 7,1 triliun. ",
                " Total kekayaan CR7 saat ini mencapai 500 juta dolar AS atau sekitar Rp 7,1 triliun."
            ),
            Pemainterkaya(
                R.drawable.messi,
                "Lionel Messi – Rp 5,8 triliun.",
                "Hal yang tak kalah menarik adalah posisi Lionel Messi sebagai atlet terkaya di dunia di peringkat delapan dengan kekayaan 600 juta dollar."
            ),
            Pemainterkaya(
                R.drawable.neymar,
                "Neymar JR – Rp2,9 triliun.",
                "Penggawa Paris Saint-Germain (PSG), Neymar Jr masuk dalam jajaran pesepakbola paling kaya. Winger asal Brasil itu tercatat memiliki kekayaan hingga 200juta USD (Rp2,9 triliun)."
            ),
            Pemainterkaya(
                R.drawable.ibrahimovic,
                "Zlatan Ibrahimovic – Rp2,69 Triliun",
                "Pemain berusia 39 tahun itu memiliki kekayaan yang ditaksir hingga 190 juta ."
            ),
            Pemainterkaya(
                R.drawable.rooney,
                "Wayne Rooney – Rp 2,31 Triliun ",
                "Wayne Rooney meraup kekayaan sebesar USD160 juta atau Rp 2,31 Triliun selama berkarir sebagai pemain sepakbola."
            ),
            Pemainterkaya(
                R.drawable.kaka,
                "Ricardo Kaka – Rp 1,33 triliun.",
                "Ricardo Izecson dos Santos Leite ini juga bermain tenis. Sekarang, harta kekayaannya mencapai USD 95 juta atau Rp 1,33 triliun."
            ),
            Pemainterkaya(
                R.drawable.eto,
                "Samuel Eto'o – Rp1,18 triliun",
                "Samuel Eto'o menjadi pemain terkaya di Afrika dengan kekayaan yang ditaksir mencapai 1,18 triliun rupiah"
            ),
            Pemainterkaya(
                R.drawable.raul,
                "Raul Lemos – sebesar us 93 juta ",
                "Raul telah mengumpulkan kekayaan bersih sebesar 93 juta yang sebagian besar berasal dari 16 tahun di Real Madrid di mana ia memecahkan semua rekor tentang mencetak dan mencetak 323 gol untuk klub Spanyol."
            ),
            Pemainterkaya(
                R.drawable.ronaldinho,
                "Ronaldinho Gaucho - Rp2,1 triliun ",
                "Ronaldinho Gaucho, lebih dikenal sebagai Ronaldinho adalah pemain sepak bola legendaris Brasil yang telah mencetak sekitar. 33 gol dalam sekitar 97 pertandingan yang dimainkan dengan brilian untuk negaranya."
            ),
            Pemainterkaya(
                R.drawable.lampard,
                "Frank Lampard – us 87 juta ",
                "Frank Lampard adalah pemain sepak bola Inggris dan legenda Chelsea. Frank Lampard muncul sebagai gelandang paling berkembang di Liga Premier Inggris (EPL)"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_terkaya)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = PemainterkayaAdapter(this,PemainterkayaList ){

            val intent = Intent (this, DetailPemainterkayaActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}