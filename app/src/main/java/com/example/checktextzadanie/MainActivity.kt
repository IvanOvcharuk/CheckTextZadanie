package com.example.checktextzadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckedTextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val CTView = findViewById<CheckedTextView>(R.id.ctv)
        if (CTView != null) {
            CTView.isChecked = false
            CTView.setCheckMarkDrawable(
                android.R.drawable.checkbox_off_background)

            CTView.setOnClickListener {
                CTView.isChecked = !CTView.isChecked
                CTView.setCheckMarkDrawable(
                    if (CTView.isChecked)
                        android.R.drawable.checkbox_on_background
                    else
                        android.R.drawable.checkbox_off_background)

                val msg = getString(R.string.msg_shown)+ " " +
                        getString(if (CTView.isChecked)
                            R.string.checked else R.string.unchecked)
                Toast.makeText(this@MainActivity, msg,
                    Toast.LENGTH_SHORT).show()
            }
        }
        val CTView1 = findViewById<CheckedTextView>(R.id.ctv2)
        if (CTView1 != null) {
            CTView1.isChecked = false
            CTView1.setCheckMarkDrawable(
                android.R.drawable.checkbox_off_background)

            CTView1.setOnClickListener {
                CTView1.isChecked = !CTView1.isChecked
                CTView1.setCheckMarkDrawable(
                    if (CTView1.isChecked)
                        android.R.drawable.checkbox_on_background
                    else
                        android.R.drawable.checkbox_off_background)

                val msg = getString(R.string.msg_shown1)+ " " +
                        getString(if (CTView1.isChecked)
                            R.string.checked1 else R.string.unchecked1)
                Toast.makeText(this@MainActivity, msg,
                    Toast.LENGTH_SHORT).show()
            }
        }
        val CTView2 = findViewById<CheckedTextView>(R.id.ctv3)
        if (CTView2 != null) {
            CTView2.isChecked = false
            CTView2.setCheckMarkDrawable(
                android.R.drawable.checkbox_off_background)

            CTView2.setOnClickListener {
                CTView2.isChecked = !CTView2.isChecked
                CTView2.setCheckMarkDrawable(
                    if (CTView2.isChecked)
                        android.R.drawable.checkbox_on_background
                    else
                        android.R.drawable.checkbox_off_background)

                val msg = getString(R.string.msg_shown2)+ " " +
                        getString(if (CTView2.isChecked)
                            R.string.checked2 else R.string.unchecked2)
                Toast.makeText(this@MainActivity, msg,
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}

