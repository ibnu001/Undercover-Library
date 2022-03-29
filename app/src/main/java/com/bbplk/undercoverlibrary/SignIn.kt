package com.bbplk.undercoverlibrary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        // BUTTON SIGN IN TO DASHBOARD
        btn_login.setOnClickListener{
            val intent = Intent(this, Dasboard::class.java)
            startActivity(intent)
        }
    }
}