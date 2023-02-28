package com.example.test1
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_music.*
import java.util.*

class Music : AppCompatActivity() {
    lateinit var runnable: Runnable
    private var handler = android.os.Handler()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music)
        val mediaPlayer = MediaPlayer.create(this,R.raw.musicp1)
        seekbar.progress = 0
        seekbar.max = mediaPlayer.duration
        //Creation of play button
        play.setOnClickListener{
            if(!mediaPlayer.isPlaying)
            {
                mediaPlayer.start()
                //changing logo
                play.setImageResource(R.drawable.ic_baseline_pause_24)
            }
            else
            {
                mediaPlayer.pause()
                //changing logo
                play.setImageResource(R.drawable.ic_baseline_play_arrow_24)
            }
        }
        //Now we will add seekbar event
        //when we change our seekbar progress the song will change its current pos..
        seekbar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, pos: Int, changed: Boolean){
                //Now when  we change the position of seekbar the music will go to that position
                if(changed){
                    mediaPlayer.seekTo(pos)
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })
        runnable = Runnable {
            seekbar.progress = mediaPlayer.currentPosition
            handler.postDelayed(runnable,1000)
        }
        handler.postDelayed(runnable,1000)

        mediaPlayer.setOnCompletionListener {
            play.setImageResource(R.drawable.ic_baseline_play_arrow_24)
            seekbar.progress = 0
        }

    }
}