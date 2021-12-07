package com.example.mystory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class logen_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logen_)

        moveToLoginScreen()
    }

    private fun moveToLoginScreen() {
        Handler(Looper.myLooper()!!).postDelayed({//هذا الكود خاص بعمل تاخير لتنفيذ الاكواد البرمجيه

         finish() // هذه الداله تستخدم لانهاء الواجهه او حذفها من الذاكره
            val i = Intent(this,logen_Activity::class.java)

            startActivity(i)

        },30000)

    }
}