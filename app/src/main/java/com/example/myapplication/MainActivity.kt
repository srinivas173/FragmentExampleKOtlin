package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frag1 = findViewById<TextView>(R.id.text1)
        val frag2 = findViewById<TextView>(R.id.text)


        frag1.text = "fragment1"
        frag2.text = "fragment2"

        frag2.setOnClickListener {

        val fragmentTwo = FragmentTwo()
            showFragment(fragmentTwo)
        }

        frag1.setOnClickListener{
            val firstFragment = FragmentOne()
            showFragment(firstFragment)

            Toast.makeText(this@MainActivity,
                "COMPUTER SCIENCE PORTAL", Toast.LENGTH_LONG).show()
        }

    }

    private fun showFragment(fragment: Fragment) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        fragment.arguments = intent.extras
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }
}
