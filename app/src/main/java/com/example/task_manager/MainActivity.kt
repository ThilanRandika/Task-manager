package com.example.task_manager

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val handler = Handler(Looper.getMainLooper())
    private val delayInMillis: Long = 3000 // 3 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Post a delayed action to navigate to the Home screen after 3 seconds
        handler.postDelayed({
            startActivity(Intent(this@MainActivity, HomeActivity::class.java))
            finish() // Optionally, finish the current activity to prevent going back
        }, delayInMillis)

    }

    override fun onDestroy() {
        super.onDestroy()
        // Remove any pending delayed actions to avoid memory leaks
        handler.removeCallbacksAndMessages(null)
    }

}