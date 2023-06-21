package com.example.ola

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class homepageActivity : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        val drawerLayout=findViewById<DrawerLayout>(R.id.drawerLayout)
        val navView=findViewById<NavigationView>(R.id.nav_View)
        toggle= ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navView.setNavigationItemSelectedListener {
            when (it.itemId){
                R.id.electric-> Toast.makeText(applicationContext, "Clicked Home", Toast.LENGTH_SHORT).show()
                R.id.rides->Toast.makeText(applicationContext, "Clicked rides", Toast.LENGTH_SHORT).show()
                R.id.money-> Toast.makeText(applicationContext, "Clicked money", Toast.LENGTH_SHORT).show()
                R.id.payments-> Toast.makeText(applicationContext, "Clicked payments", Toast.LENGTH_SHORT).show()
                R.id.insurance-> Toast.makeText(applicationContext, "Clicked insurance", Toast.LENGTH_SHORT).show()
                R.id.support-> Toast.makeText(applicationContext, "Clicked support", Toast.LENGTH_SHORT).show()
                R.id.about-> Toast.makeText(applicationContext, "Clicked about", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)


    }
}
//R.id.payments-> startActivity(Intent(this,Account::class.java))