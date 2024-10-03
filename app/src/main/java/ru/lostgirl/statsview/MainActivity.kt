package ru.lostgirl.statsview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.lostgirl.statsview.ui.StatsView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val statsView = findViewById<StatsView>(R.id.stats)
        statsView.data = listOf(
            500F,
            500F,
            500F,
        )
        statsView.totalSum = 2000F
    }
}