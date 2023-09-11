package com.example.stagetwotask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvName = findViewById<TextView>(R.id.tvName)
        val tvSlackName = findViewById<TextView>(R.id.tvSlackName)
        val tvGithubHandle = findViewById<TextView>(R.id.tvGithubHandle)
        val tvPersonalDetails = findViewById<TextView>(R.id.tvPersonalDetails)
        val btnEditAll = findViewById<Button>(R.id.btnEditAll)
        val bundle = intent.extras
        if (bundle != null){
            tvName.text = bundle.getString("name")
            tvSlackName.text = bundle.getString("slackName")
            tvGithubHandle.text = bundle.getString("githubHandle")
            tvPersonalDetails.text = bundle.getString("personalDetails")
        }
        btnEditAll.setOnClickListener {
            val intent = Intent(this, EditablePageActivity::class.java)
            startActivity(intent)
        }
    }
}