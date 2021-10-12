package com.pifachry.pesonagunungindonesia.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pifachry.pesonagunungindonesia.ui.adapter.ListGunungAdapter
import com.pifachry.pesonagunungindonesia.R
import com.pifachry.pesonagunungindonesia.utils.DataGunung
import com.pifachry.pesonagunungindonesia.utils.Gunung

class MainActivity : AppCompatActivity() {
    private lateinit var rvGunung: RecyclerView
    private var title = "Pesona Gunung Indonesia"
    private var listMain: ArrayList<Gunung> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setActionBarTitle(title)
        setContentView(R.layout.activity_main)

        rvGunung = findViewById(R.id.rv_gunung)
        rvGunung.setHasFixedSize(true)

        listMain.addAll(DataGunung.listData)
        showRecyclerList()
    }

    private fun showRecyclerList(){
        rvGunung.layoutManager = LinearLayoutManager(this)
        val listMountainAdapter = ListGunungAdapter(listMain)
        rvGunung.adapter = listMountainAdapter
    }

    private fun setActionBarTitle(title: String){
        if(supportActionBar != null){
            (supportActionBar as ActionBar).title = title
        }
    }

}