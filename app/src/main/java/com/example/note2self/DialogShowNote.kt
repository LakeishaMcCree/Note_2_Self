package com.example.note2self

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class DialogShowNote : DialogFragment (){

    private var note: Note? = null
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        //All the other code goes here
        val builder = AlertDialog.Builder(this.activity!!)

        val inflater = activity!!.layoutInflater

        val dialogView = inflater.inflate(R.layout.dialog_show_note, null)
    }

    //Receive a note from the MainActivity class
    fun sendNoteSelected(noteSelected: Note) {
        note = noteSelected

    }
}