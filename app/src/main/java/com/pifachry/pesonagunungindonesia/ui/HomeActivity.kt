package com.pifachry.pesonagunungindonesia.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.pifachry.pesonagunungindonesia.R

class HomeActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        supportActionBar?.hide()
        val buttonMasuk : Button = findViewById(R.id.btn_masuk)
        val buttonAbout : Button = findViewById(R.id.btn_about)
        buttonMasuk.setOnClickListener(this)
        buttonAbout.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_masuk -> {
                val homeAct = Intent(this@HomeActivity, MainActivity::class.java)
                startActivity(homeAct)
            }
            R.id.btn_about -> {
                val homeAct = Intent(this@HomeActivity, AboutApps::class.java)
                startActivity(homeAct)
            }
        }
    }
}