package com.taghavi.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import kotlinx.android.synthetic.main.activity_main.*

private const val TEXT_CONTENTS = "TextContent"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainTextView.movementMethod = ScrollingMovementMethod()

        mainButton.setOnClickListener {
            mainTextView.append(mainEditText.text)
            mainTextView.append("\n")
            mainEditText.setText("")
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        mainTextView.text = savedInstanceState.getString(TEXT_CONTENTS, "")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(TEXT_CONTENTS, mainTextView.text.toString())
    }
}
