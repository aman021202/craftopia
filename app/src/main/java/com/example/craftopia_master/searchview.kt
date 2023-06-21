package com.example.craftopia_master

import android.os.Bundle
import android.os.PersistableBundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class searchview : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.searchview)


        val drawerLayout: DrawerLayout = findViewById(R.id.drawerLayout)
        val navView: NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this,drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

       supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
                when(it.itemId){
                    R.id.user -> Toast.makeText(applicationContext,
                        "Clicked on User", Toast.LENGTH_LONG).show()

                    R.id.yourOrder -> Toast.makeText(applicationContext,
                        "To display your order", Toast.LENGTH_LONG).show()

                    R.id.Become_A_Seller -> Toast.makeText(applicationContext,
                        "Wanted to be a seller", Toast.LENGTH_LONG).show()
                }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
         return super.onOptionsItemSelected(item)
    }


}