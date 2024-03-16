package com.application.therapy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.application.therapy.databinding.FragmentOccupationalBinding
import com.application.therapy.databinding.FragmentSpeechBinding

class SpeechFragment : Fragment() {

    private lateinit var binding: FragmentSpeechBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSpeechBinding.inflate(inflater,container,false)
        binding.back.setOnClickListener {
            findNavController().navigate(R.id.action_speechFragment_to_homeFragment)
        }
        return binding.root
    }

}