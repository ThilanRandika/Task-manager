package com.example.task_manager.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.recyclerview.widget.RecyclerView
import com.example.task_manager.HomeActivity
import com.example.task_manager.R
import com.example.task_manager.model.Task

//class TaskAdapter (private val activity: HomeActivity): RecyclerView.Adapter<TaskAdapter.ViewHolder>() {
//    private val todoList: List<Task> = mutableListOf()
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val itemView = LayoutInflater.from(parent.context)
//            .inflate(R.layout.single_task, parent, false)
//        return ViewHolder(itemView)
//    }
//
//
//}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val task: CheckBox = view.findViewById(R.id.task_checkBox)
}