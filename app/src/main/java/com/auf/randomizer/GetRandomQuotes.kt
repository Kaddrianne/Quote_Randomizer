package com.auf.randomizer

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.auf.randomizer.databinding.ActivityMainBinding

class GetRandomQuotes : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.LoveButton.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0!!.id){
            (R.id.LoveButton)->{
                var loves = "Love"
                var intent = Intent(this,MainActivity::class.java)
                intent.putExtra("Quotes",loves)
                startActivity(intent)
            }
        }
    }
}