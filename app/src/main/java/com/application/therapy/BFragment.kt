package com.application.therapy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.application.therapy.databinding.FragmentABinding
import com.application.therapy.databinding.FragmentBBinding

class BFragment : Fragment() {

    private lateinit var binding: FragmentBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBBinding.inflate(inflater,container,false)
        binding.continue1.setOnClickListener {
            findNavController().navigate(R.id.action_BFragment_to_CFragment)
        }
        binding.back.setOnClickListener {
            findNavController().navigate(R.id.action_BFragment_to_AFragment)
        }
        binding.Female.setOnClickListener {
            findNavController().navigate(R.id.action_BFragment_to_CFragment)
        }
        binding.Male.setOnClickListener {
            findNavController().navigate(R.id.action_BFragment_to_CFragment)
        }
        binding.skip.setOnClickListener {
            findNavController().navigate(R.id.action_BFragment_to_CFragment)
        }
        binding.nope.setOnClickListener {
            findNavController().navigate(R.id.action_BFragment_to_CFragment)
        }
        return binding.root
    }
}