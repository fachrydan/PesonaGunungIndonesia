package com.pifachry.pesonagunungindonesia.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageButton
import com.pifachry.pesonagunungindonesia.R

class AboutApps : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_apps)

        val buttonAboutMe : ImageButton = findViewById(R.id.btn_about_me)
        buttonAboutMe.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_about_me -> {
                val aboutAct = Intent(this@AboutApps, AboutDeveloper::class.java)
                startActivity(aboutAct)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_about -> {
                startActivity(Intent(this@AboutApps, AboutDeveloper::class.java))
            }

        }
    }
}