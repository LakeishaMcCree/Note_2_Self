package com.example.note2self

import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment


class DialogNewNote : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?) : Dialog {

        //all the rest of the code goes here
        val builder = AlertDialog.Builder(activity!!)

        val inflater = activity!!.layoutInflater

        val dialogView = inflater.inflate(R.layout.dialog_new_note, null)

        val editTitle = dialogView.findViewById(R.id.editTitle) as EditText

        val editDescription = dialogView.findViewById(R.id.editDescription) as EditText

        val checkBoxIdea = dialogView.findViewById(R.id.checkBoxIdea) as CheckBox

        val checkBoxToDo = dialogView.findViewById(R.id.checkBoxTodo) as CheckBox

        val checkBoxImportant = dialogView.findViewById(R.id.checkBoxImportant) as CheckBox

        val btnCancel = dialogView.findViewById(R.id.btnCancel) as Button

        val btnOK = dialogView.findViewById(R.id.btnOK) as Button

        builder.setView(dialogView).setMessage("Add a new note")

        //handle the cancel button
        btnCancel.setOnClickListener {
            dismiss()
        }

//        btnOK.setOnClickListener {
//            //create a new note
//            val newNote = Note()



            //set its properties to match the user's entries on the form
            //newNote.title = editTitle.text.toString()
        }
    }
}