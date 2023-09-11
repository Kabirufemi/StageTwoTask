package com.example.stagetwotask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class EditablePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editable_page)
        val etName = findViewById<EditText>(R.id.etName)
        val etSlackName = findViewById<EditText>(R.id.etSlackName)
        val etGithubHandle = findViewById<EditText>(R.id.etGithubHandle)
        val etPersonalDetails = findViewById<EditText>(R.id.etPersonalDetails)
        val btnSave = findViewById<Button>(R.id.btnSaveAll)
        btnSave.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("name", etName.text.toString())
            bundle.putString("slackName", etSlackName.text.toString())
            bundle.putString("githubHandle", etGithubHandle.text.toString())
            bundle.putString("personalDetails", etPersonalDetails.text.toString())

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}