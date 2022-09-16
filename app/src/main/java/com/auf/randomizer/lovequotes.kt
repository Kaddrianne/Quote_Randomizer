package com.auf.randomizer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import kotlin.random.Random


class lovequotes : AppCompatActivity() {

    companion object{

        }
        private val lovequotes = mapOf(
            Pair(1,"You call it madness, but I call it love. – Don Byas"),
            Pair(2,"Love is friendship on fire. – Susan Sontag"),
            Pair(3,"The love we give away is the only love we keep. – Elbert Hubbard"),
            Pair(4,"If I know what love is, it is because of you. – Hermann Hesse"),
            Pair(5,"I swear I couldn’t love you more than I do right now, and yet I know I will tomorrow. – Leo Christopher"),
            Pair(6,"Trust your intuition and be guided by love. – Charles Eisenstein"),
            Pair(7,"Love is not a volunteer thing – Samuel Richardson"),
            Pair(8,"Thinking of you keeps me awake. Dreaming of you keeps me asleep. Being with you keeps me alive"),
            Pair(9,"Baby baby you're my sun and moon -Jroa. – Susan Sontag"),
            Pair(10,"Tell me whom you love and I will tell you who you are. – Houssaye"),
        )
        fun getQuote(): String? {
            val numbers = Random.nextInt(1,10)
            var a = lovequotes.get(numbers)
            return a
        }

}