package com.example.note2self

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.SharedPreferences


class SettingsActivity : AppCompatActivity() {

    private var showDividers: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val prefs = getSharedPreferences(
            "Note 2 Self", Context.MODE_PRIVATE
        )

        showDividers = prefs.getBoolean("dividers", true)

        //set the switch to on or off as appropriate
        switch1.ischecked = showDividers

        switch1.setOnCheckedChangeListener {
            buttonView, isChecked ->

            showDividers = isChecked
        }

    }


}