package com.example.bottomtab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var toolbar : ActionBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = supportActionBar!!
        val bottomNavigation : BottomNavigationView = findViewById<BottomNavigationView>(R.id.navigation_view)
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavaigationItemSelectedListner)
    }

    val mOnNavaigationItemSelectedListner = BottomNavigationView.OnNavigationItemSelectedListener {item ->
        when(item.itemId){
            R.id.contact -> {
                toolbar.title = "Contacts"
                val mainFragment = MainFragment.newInstance()
                openFragment(mainFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.groups ->{
                toolbar.title = "Groups"
                val groupsFragment = GroupsFragment.newInstance()
                openFragment(groupsFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.favorites ->{
                toolbar.title = "Favorites"
                val favoritesFragment = FavoritesFragment.newInstance()
                openFragment(favoritesFragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false

    }
    fun openFragment(fragment: Fragment){
        val transection = supportFragmentManager.beginTransaction()
        transection.replace(R.id.container,fragment,"fragment")
        transection.addToBackStack(null)
        transection.commit()
    }

}
