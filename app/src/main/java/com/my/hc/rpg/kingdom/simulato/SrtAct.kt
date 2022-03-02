package com.my.hc.rpg.kingdom.simulato

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SrtAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_srt)
    }

    fun Quest(view: View) {
        Intent(applicationContext, ExaltedFox::class.java).also { startActivity(it) }
        finish()
    }
}