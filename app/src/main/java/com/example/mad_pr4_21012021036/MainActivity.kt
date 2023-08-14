package com.example.mad_pr4_21012021036
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var l:Button=findViewById(R.id.login);
        var s:Button=findViewById(R.id.signup);
        s.setOnClickListener(){
            var i=Intent(this,regester::class.java)
            startActivity(i);
        }
        l.setOnClickListener(){
            var k=Intent(this,login::class.java)
            startActivity(k);
        }
    }
}