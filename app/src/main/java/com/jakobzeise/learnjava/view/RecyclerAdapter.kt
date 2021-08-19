package com.jakobzeise.learnjava.view

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jakobzeise.learnjava.R
import com.jakobzeise.learnjava.modell.Chapters
import kotlinx.android.synthetic.main.item_recycler.view.*


class RecyclerAdapter(private var listOfChapters: MutableList<Chapters>) :
    RecyclerView.Adapter<RecyclerAdapter.ChapterViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChapterViewHolder {
        //Gets the item_recycler view and kinda translates it into a kotlin view
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent, false)
        return ChapterViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ChapterViewHolder, position: Int) {

        //Gets the current item
        val itemChapter = listOfChapters[position]

        //Sets the Chaptername and Chapterdescription
        holder.itemView.textViewChapterName.text = itemChapter.chapterName
        holder.itemView.textViewChapterDescription.text = itemChapter.description

        //Intent for opening the tutorial
        val intent = Intent(holder.itemView.context, LearningActivity::class.java).apply {
            putExtra("Chapter", itemChapter.chapter - 1)
        }

        holder.itemView.constraintLayoutBackground.setOnClickListener {
            holder.itemView.context.startActivity(intent)
        }
        holder.itemView.textViewChapterName.setOnClickListener {
            holder.itemView.context.startActivity(intent)
        }
        holder.itemView.textViewChapterDescription.setOnClickListener {
            holder.itemView.context.startActivity(intent)
        }


    }

    override fun getItemCount(): Int {
        return listOfChapters.size
    }

    class ChapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}