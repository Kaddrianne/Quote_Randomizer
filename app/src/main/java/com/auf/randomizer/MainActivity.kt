package com.auf.randomizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.auf.randomizer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.LoveButton.setOnClickListener(this)

            val lovequotes = lovequotes.getQuotess2()
            binding.textview11.text = lovequotes

    }
    override fun onClick(p0: View?) {
        when(p0!!.id){
            (R.id.LoveButton)->{
                val intent = Intent(this,GetRandomQuotes::class.java)
                intent.putExtra("Quotes","love")
                startActivity(intent)

            }
            (R.id.MotButton)->{
                val intent = Intent(this,GetRandomQuotes::class.java)
                intent.putExtra("Quotes","moti")
                startActivity(intent)

            }
            (R.id.InspiButton)->{
                val intent = Intent(this,GetRandomQuotes::class.java)
                intent.putExtra("Quotes","inspi")
                startActivity(intent)

            }
            (R.id.FaveButton)->{

            }

        }

    }


}
