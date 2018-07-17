package com.mbobiosio.letseat.activities

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import com.mbobiosio.letseat.R
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)

        facebook.setOnClickListener {
            val fbUrl = Uri.parse("https://facebook.com/cazeewonder")
            val facebook = Intent(Intent.ACTION_VIEW, fbUrl)
            startActivity(facebook)
        }
        twitter.setOnClickListener {
            val twitUrl = Uri.parse("https://twitter.com/cazewonder")
            val twitter = Intent(Intent.ACTION_VIEW, twitUrl)
            startActivity(twitter)
        }
        linkedin.setOnClickListener {
            val linkedinUrl = Uri.parse("https://www.linkedin.com/in/mb-obiosio/")
            val linkedIn = Intent(Intent.ACTION_VIEW, linkedinUrl)
            startActivity(linkedIn)
        }
        github.setOnClickListener {
            val gitUrl = Uri.parse("https://github.com/mbobiosio")
            val git = Intent(Intent.ACTION_VIEW, gitUrl)
            startActivity(git)
        }
    }

}