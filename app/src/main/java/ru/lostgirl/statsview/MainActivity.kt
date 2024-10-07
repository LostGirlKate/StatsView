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
            0.25F,
            0.25F,
            0.25F,
            0.25F,
        )
     //   statsView.totalSum = 2000F
//        val textView = findViewById<TextView>(R.id.label)
//
//        statsView.startAnimation(
//            AnimationUtils.loadAnimation(this, R.anim.animation).apply {
//                setAnimationListener(object: Animation.AnimationListener {
//                    override fun onAnimationStart(p0: Animation?) {
//                        textView.text = "onAnimationStart"
//                    }
//
//                    override fun onAnimationEnd(p0: Animation?) {
//                        textView.text = "onAnimationEnd"
//                    }
//
//                    override fun onAnimationRepeat(p0: Animation?) {
//                        textView.text = "onAnimationRepeat"
//                    }
//
//                })
//            }
//        )
    }
}