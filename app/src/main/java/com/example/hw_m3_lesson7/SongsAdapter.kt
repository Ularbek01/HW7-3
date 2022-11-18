package com.example.hw_m3_lesson7

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.hw_m3_lesson7.databinding.ItemSongBinding

class SongsAdapter(private val songs : ArrayList<Songs>,val onItemClick: OnItemClick) : Adapter<SongsAdapter.SongsViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongsViewHolder {
        return SongsViewHolder(ItemSongBinding.inflate(LayoutInflater.from(parent.context),
            parent, false))
    }

    override fun onBindViewHolder(holder: SongsViewHolder, position: Int) {
        holder.bind()
        holder.itemView.setOnClickListener{
            onItemClick.onItemClick(songs.get(position).name.toString(), songs.get(position).artist.toString())
        }
    }

    override fun getItemCount(): Int {
        return songs.size
    }


    inner class SongsViewHolder(private val binding : ItemSongBinding) : ViewHolder(binding.root) {



        fun bind() {
            val song = songs.get(adapterPosition)
            binding.tvSongIndex.text = song.songIndex
            binding.tvName.text = song.name
            binding.tvArtist.text = song.artist
            binding.tvSongDuration.text = song.songDuration
        }
    }
}