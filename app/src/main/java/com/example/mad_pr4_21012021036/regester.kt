package com.example.mad_pr4_21012021036

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class regester : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regester)
        var lgn:Button=findViewById(R.id.login);
        lgn.setOnClickListener(){
            var intent=Intent(this,login::class.java);
            startActivity(intent);
        }
    }
}