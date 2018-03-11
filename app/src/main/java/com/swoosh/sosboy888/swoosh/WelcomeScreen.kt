package com.swoosh.sosboy888.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome_screen.*

class WelcomeScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)
        getStartedButton.setOnClickListener(){
            val leagueIntent=Intent(this,leagueSelection::class.java)
            startActivity(leagueIntent)

        }


    }
}
