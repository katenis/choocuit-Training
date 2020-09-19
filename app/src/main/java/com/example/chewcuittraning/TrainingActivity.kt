package com.example.chewcuittraning

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_training.*
import java.util.*
import kotlin.concurrent.timer

class TrainingActivity : AppCompatActivity() {

    private var time = 5
    private var timerTask: Timer? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_training)

        var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.countdown)
        mediaPlayer?.start()

        start()


        Glide.with(this).load(R.drawable.squat)
            .apply(RequestOptions.overrideOf(800, 1000))
            .into(imageView)

    }

    private fun start(){
        countdownTime.setText(time)

        timerTask = timer(period = 1000){
            time--
            runOnUiThread{
                countdownTime.text = "$time"
            }

            if(time==0){
                timerTask?.cancel()
            }
        }
    }
}

