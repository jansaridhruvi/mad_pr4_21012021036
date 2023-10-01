package com.example.mad_pr4_21012021036

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var signup:Button=findViewById(R.id.signup);
        signup.setOnClickListener(){
            var intent=Intent(this,regester::class.java);
            startActivity(intent);
        }
    }
}
