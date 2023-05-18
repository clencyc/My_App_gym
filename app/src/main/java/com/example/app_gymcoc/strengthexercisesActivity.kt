package com.example.app_gymcoc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView

class strengthexercisesActivity : AppCompatActivity() {

    lateinit var videoView: VideoView
    val videoUrl = "https://www.youtube.com/watch?v=cZyHgKtK75A"

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_strengthexercises)


    }
}