package com.sevgitellioglu.photoviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import uk.co.senab.photoview.PhotoViewAttacher

class MainActivity : AppCompatActivity() {


    private lateinit var img:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        img=findViewById(R.id.imageButton)

        var photo:PhotoViewAttacher= PhotoViewAttacher(img)
        photo.update()
    }
}
