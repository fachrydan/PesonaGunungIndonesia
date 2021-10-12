package com.pifachry.pesonagunungindonesia.ui

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.ActionBar
import com.pifachry.pesonagunungindonesia.R

class AboutDeveloper : AppCompatActivity(), View.OnClickListener {
    private var title = "About Developer"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_developer)
        setActionBarTitle(title)

        val btnLinkedin: ImageButton = findViewById(R.id.btn_linkedin)
        btnLinkedin.setOnClickListener(this)

        val btnEmail: ImageButton = findViewById(R.id.btn_email)
        btnEmail.setOnClickListener(this)

        val btnInstagram: ImageButton = findViewById(R.id.btn_instagram)
        btnInstagram.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_instagram -> {
                val profileInstagramURL = "https://www.instagram.com/fachrydan/"
                val checkDevProfileIntent = Intent(Intent.ACTION_VIEW, Uri.parse(profileInstagramURL))
                startActivity(checkDevProfileIntent)
            }
            R.id.btn_email -> {
                val emailDev = "fachrydan@gmail.com"
                val dialPhoneIntent = Intent(Intent.ACTION_SENDTO, Uri.parse ("mailto:$emailDev"))
                startActivity(dialPhoneIntent)
            }
            R.id.btn_linkedin -> {
                val profileLinkedinURL = "https://www.linkedin.com/in/fachry-ramadhan"
                val check1DevProfileIntent = Intent(Intent.ACTION_VIEW, Uri.parse(profileLinkedinURL))
                startActivity(check1DevProfileIntent)
            }
        }
    }

    private fun setActionBarTitle(title: String){
        if(supportActionBar != null){
            (supportActionBar as ActionBar).title = title
        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK){
            finish()
        }
        return super.onKeyDown(keyCode, event)
    }
}