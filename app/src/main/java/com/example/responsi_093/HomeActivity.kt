package com.example.responsi_093

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AbsListView
import kotlinx.android.synthetic.main.activity_account.*
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private lateinit var rviphone: RecyclerView
    private var list: ArrayList<iphone> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rviphone = findViewById(R.id.rv_iphone)
        rviphone.setHasFixedSize(true)
        list.addAll(Detail.iphonee)
        showiphonee()

        btn_profil.setOnClickListener() {
            intent = Intent(this, AccountActivity::class.java)
            startActivity(intent)
        }
    }

    private fun showiphonee(){
        rviphone.layoutManager = LinearLayoutManager(this)
        val iphonee = iphonee(list)
        rviphone.adapter = iphonee
    }
}