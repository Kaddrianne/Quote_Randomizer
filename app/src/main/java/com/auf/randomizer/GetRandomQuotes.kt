package com.auf.randomizer

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.auf.randomizer.databinding.ActivityGetQuotesBinding
import com.auf.randomizer.databinding.ActivityMainBinding

class GetRandomQuotes : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityGetQuotesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetQuotesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = getIntent()
        binding.randombutton.setOnClickListener(this)
        var QQuote = intent.getExtras()?.getString("Quotes");

    }

    override fun onClick(p0: View?) {
        var intent = getIntent()
        var QQuote = intent.getExtras()?.getString("Quotes");
        when (p0!!.id){
            (R.id.randombutton)->{
                if(QQuote=="love"){
                    val LoveRandomizer=lovequotes.getQuotess2()
                    binding.TextView10.text=LoveRandomizer
                }
            }
            (R.id.MotButton)->{
                if(QQuote=="moti"){
                    val motiRandomizer=lovequotes.getQuotess2()
                    binding.TextView10.text=motiRandomizer
                }
            }
        }



    }
}