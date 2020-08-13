package com.badadarr.instagramclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.badadarr.instagramclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // ViewBinding inflater
        val inflater = layoutInflater
        // set ViewBinding untuk activity main.xml
        binding = ActivityMainBinding.inflate(inflater)
        // setContentView diisi dengan (binding.root)
        setContentView(binding.root)

        //definisikan id navigationHostFragment yang ada di activty_main.xml
        // idnya itu fragment_container
        val host: NavHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragment_container) as NavHostFragment? ?: return
        val navController = host.navController

        // navView itu adalah id dari bottomNavigation
        binding.navView.setupWithNavController(navController)

    }
}