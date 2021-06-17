package com.example.note2self

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NoteAdapter(
        private val mainActivity: MainActivity,
        private val noteList: List<Note>):
        RecyclerView.Adapter<NoteAdapter.ListItemHolder>() {



    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int): NoteAdapter.ListItemHolder {

        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.listitem, parent, false)
        return ListItemHolder(itemView)
    }

    override fun onBindViewHolder(
        holder: NoteAdapter.ListItemHolder, position: Int) {

        val note = noteList(position)
        holder.title.text = note.title

        // Show the first 15 characters of the actual note
        holder.description.text =
            note.description!!.substring(0, 15)

        //What is the status of the note?
        when {
            note.idea -> holder.status.text =
                mainActivity.resources.getString(R.string.idea_text)

            note.important -> holder.status.text =
                mainActivity.resources.getString(R.string.important_text)

            note.todo -> holder.status.text =
                mainActivity.resources.getString(R.string.todo_text)
        }
    }

    override fun getItemCount(): Int {
        //supplies the current number of items in List
        if (noteList != null) {
            return noteList.size
        }
        //error
        return -1
    }

    inner class ListItemHolder(view: View)  :
            RecyclerView.ViewHolder(view),
            View.onClickListener {

        init {

        }

        override fun onClick(view: View) {

        }
    }

}
