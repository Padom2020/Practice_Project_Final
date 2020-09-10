package com.example.practiceproject.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practiceproject.databinding.RecordRecyclerViewBinding
import com.example.practiceproject.models.Record

class RecordsAdapter : RecyclerView.Adapter<RecordsAdapter.RecordViewHolder>() {

    var records = emptyList<Record>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecordViewHolder =
        RecordViewHolder(
            RecordRecyclerViewBinding.inflate(LayoutInflater.from(parent.context))
        )

    override fun onBindViewHolder(holder: RecordViewHolder, position: Int) {
        holder.bind(records[position])
    }

    override fun getItemCount(): Int = records.size

    fun records(records: List<Record>) {
        this.records = records

        notifyDataSetChanged()
    }

    class RecordViewHolder(private val binding: RecordRecyclerViewBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(record: Record) {
            binding.record = record
        }
    }

}