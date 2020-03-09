package com.taghavi.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var numTimeClicked = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainTextView.movementMethod = ScrollingMovementMethod()

        mainButton.setOnClickListener {
            numTimeClicked += 1
            mainTextView.append("The Button got tapped $numTimeClicked time")
            if (numTimeClicked != 1) {
                mainTextView.append("s\n")
            } else {
                mainTextView.append("\n")
            }
        }
    }
}
