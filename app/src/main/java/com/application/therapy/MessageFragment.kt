package com.application.therapy

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.VideoView
import androidx.navigation.fragment.findNavController
import com.application.therapy.databinding.FragmentMessageBinding

class MessageFragment : Fragment() {

    private lateinit var binding: FragmentMessageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        binding = FragmentMessageBinding.inflate(inflater,container,false)

//        val videoView: VideoView = binding.videoView
//        val mediaController = MediaController(this.context)
//        mediaController.setAnchorView(videoView)
//
//        val onlineUri = Uri.parse("https://www.youtube.com/watch?v=YJAM03cVh10")
//        val offline = Uri.parse("android.resource://${R.raw.massage}")

//        videoView.setMediaController(mediaController)
//        videoView.setVideoURI(offline)
//        videoView.requestFocus()
//        videoView.start()

        binding.back.setOnClickListener {
            findNavController().navigate(R.id.action_messageFragment_to_homeFragment)
        }
        return binding.root
    }

}