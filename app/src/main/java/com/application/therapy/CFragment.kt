package com.application.therapy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.application.therapy.databinding.FragmentBBinding
import com.application.therapy.databinding.FragmentCBinding

class CFragment : Fragment() {

    private lateinit var binding: FragmentCBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCBinding.inflate(inflater,container,false)

        binding.continue1.setOnClickListener {
            findNavController().navigate(R.id.action_CFragment_to_signupFragment)
        }
        binding.back.setOnClickListener {
            findNavController().navigate(R.id.action_CFragment_to_BFragment)
        }
        binding.skip.setOnClickListener {
            findNavController().navigate(R.id.action_CFragment_to_signupFragment)
        }
        binding.nope.setOnClickListener {
            findNavController().navigate(R.id.action_CFragment_to_signupFragment)
        }
        return binding.root
    }

}