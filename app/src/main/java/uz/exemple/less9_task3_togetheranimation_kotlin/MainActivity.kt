package uz.exemple.less9_task3_togetheranimation_kotlin

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        val imageView = findViewById<ImageView>(R.id.iv_anim)
        val btn_anim = findViewById<Button>(R.id.btn_anim)
        btn_anim.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(
                applicationContext, R.anim.together
            )
            imageView.startAnimation(animation)
        }
    }
}