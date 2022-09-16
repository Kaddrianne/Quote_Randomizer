package com.auf.randomizer

import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MotiQuotes : AppCompatActivity() {

    companion object{
        fun getQuotess2(): String? {
            val numbers = Random.nextInt(1,11)
            var b = MotiQuotes[numbers]
            return b

        }
        private val MotiQuotes = mapOf(
            Pair(1,"We cannot solve problems with the kind of thinking we employed when we came up with them. \n— Albert Einstein"),
            Pair(2,"Learn as if you will live forever, live like you will die tomorrow. \n— Mahatma Gandhi"),
            Pair(3,"Stay away from those people who try to disparage your ambitions. Small minds will always do that, but great minds will give you a feeling that you can become great too. \n— Mark Twain"),
            Pair(4,"When you give joy to other people, you get more joy in return. You should give a good thought to happiness that you can give out.\n— Eleanor Roosevelt"),
            Pair(5,"When you change your thoughts, remember to also change your world.\n—Norman Vincent Peale"),
            Pair(6,"It is only when we take chances, when our lives improve. The initial and the most difficult risk that we need to take is to become honest. \n—Walter Anderson"),
            Pair(7,"Nature has given us all the pieces required to achieve exceptional wellness and health, but has left it to us to put these pieces together. \n—Diane McLaren"),
            Pair(8,"Success is not final; failure is not fatal: It is the courage to continue that counts. \n— Winston S. Churchill"),
            Pair(9,"It is better to fail in originality than to succeed in imitation. \n— Herman Melville"),
            Pair(10,"The road to success and the road to failure are almost exactly the same. \n— Colin R. Davis"),
        )

    }
}