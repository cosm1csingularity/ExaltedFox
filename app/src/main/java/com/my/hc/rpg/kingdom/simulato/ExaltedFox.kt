package com.my.hc.rpg.kingdom.simulato

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.appsflyer.internal.i
import kotlinx.android.synthetic.main.activity_exalted_fox.*

class ExaltedFox : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exalted_fox)

        val characters = arrayListOf(apple1, star1, flute1, sakura1, water1)
        for (i in characters){
            i.setOnClickListener{
                i.isVisible = false
                characters.remove(i)
                if (characters.isEmpty()) {
                    againBtn.isVisible = true
                }

            }

        }

    }
    fun again (view: View){
        Intent(applicationContext, ExaltedFox::class.java).also { startActivity(it) }
        finish()
    }
}