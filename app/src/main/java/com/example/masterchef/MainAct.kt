package com.example.masterchef

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.example.masterchef.fragment.FavoriteFragment
import com.example.masterchef.fragment.HomeFragment
import com.example.masterchef.fragment.SettingFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainAct : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_main)

        initViews()

        initEvents()
    }

    private fun initViews() {
        bottomNavigationView = findViewById(R.id.bottomNavigation)
        openFragment(HomeFragment.newInstance(""))
    }

    private fun initEvents() {
        //https://androidwave.com/bottom-navigation-bar-android-example/
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.navHome -> openFragment(HomeFragment.newInstance(""))
                R.id.navFavorite -> openFragment(FavoriteFragment.newInstance(""))
                R.id.navSetting -> openFragment(SettingFragment.newInstance(""))
                else -> Log.e("Logger", "Bottom Navigation Failed")
            }
            return@setOnNavigationItemSelectedListener true
        }
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_layout_main, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}

