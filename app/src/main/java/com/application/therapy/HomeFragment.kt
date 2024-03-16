package com.application.therapy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.application.therapy.databinding.FragmentBBinding
import com.application.therapy.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        binding.Physically.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_physicalFragment)
        }
        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_occupationalFragment2)
        }
        binding.button3.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_speechFragment)
        }
        binding.button4.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_messageFragment)
        }
        binding.logout.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_loginFragment)
        }
        binding.profile.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
        }
        return binding.root
    }

}