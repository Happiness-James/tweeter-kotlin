package com.happinessjames.twitterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.happinessjames.twitterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweet()
    }
    fun displayTweet(){
        var tweet1 = Twitter("","@gesarejames","Happiness James","Future wars are all about the drones. Human crews of planes or tanks have no chance.","","8","","10","","5","")
        var tweet2 = Twitter("","@gesarejames","Happiness James","Future wars are all about the drones. Human crews of planes or tanks have no chance.","","8","","10","","5","")
        var tweet3 = Twitter("","@gesarejames","Happiness James","Future wars are all about the drones. Human crews of planes or tanks have no chance.","","8","","10","","5","")
        var tweet4 = Twitter("","@gesarejames","Happiness James","Future wars are all about the drones. Human crews of planes or tanks have no chance.","","8","","10","","5","")
        var tweet5 = Twitter("","@gesarejames","Happiness James","Future wars are all about the drones. Human crews of planes or tanks have no chance.","","8","","10","","5","")
        var tweet6 = Twitter("","@gesarejames","Happiness James","Future wars are all about the drones. Human crews of planes or tanks have no chance.","","8","","10","","5","")
        var tweet7 = Twitter("","@gesarejames","Happiness James","Future wars are all about the drones. Human crews of planes or tanks have no chance.","","8","","10","","5","")
        var tweet8 = Twitter("","@gesarejames","Happiness James","Future wars are all about the drones. Human crews of planes or tanks have no chance.","","8","","10","","5","")
        var tweet9 = Twitter("","@gesarejames","Happiness James","Future wars are all about the drones. Human crews of planes or tanks have no chance.","","8","","10","","5","")
        var tweet10 = Twitter("","@gesarejames","Happiness James","Future wars are all about the drones. Human crews of planes or tanks have no chance.","","8","","10","","5","")


        var tweetList = listOf(tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7,tweet8,tweet8,tweet9,tweet10)


        var twitterAdapter = TwitterRvAdapter(tweetList )
        binding.rvTwitter.layoutManager = LinearLayoutManager(this)
        binding.rvTwitter.adapter = twitterAdapter
    }
}