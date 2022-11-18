package com.example.hw_m3_lesson7

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_m3_lesson7.databinding.FragmentBottomBinding


class BottomFragment : Fragment(),OnItemClick {

    private lateinit var binding: FragmentBottomBinding
    private val songs = ArrayList<Songs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBottomBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        songs.add(Songs("1", "Blank Space", "Taylor Swift", "3:22"))
        songs.add(Songs("2", "Sebelep", "JAX 02.14", "4:27"))
        songs.add(Songs("3", "Watch Me", "Silento", "5:36"))
        songs.add(Songs("4", "Earned It", "The Weekend", "4:51"))
        songs.add(Songs("5", "The Hills", "The Weekend", "3:41"))
        songs.add(Songs("6", "Marlboro", "Miyagi", "3:36"))
        songs.add(Songs("7", "Fallin", "Edmofo", "3:24"))
        songs.add(Songs("8", "In The End", "Linkin Park", "3:35"))
        songs.add(Songs("9", "BALENCIAGA", "Halsey", "2:46"))
        songs.add(Songs("10", "Hi", "Halsey", "2:46"))

        val adapter = SongsAdapter(songs, this)
        binding.recyclerView.adapter = adapter
    }

    override fun onItemClick(name : String, artist : String) {
        val intent = Intent(requireContext(), SecondActivity::class.java)
        intent.putExtra(KEY_FOR_NAME, name)
        intent.putExtra(KEY_FOR_ARTIST,artist)
        startActivity(intent)
    }

    companion object {
        const val KEY_FOR_NAME = "key"
        const val KEY_FOR_ARTIST = "artist"
    }

}