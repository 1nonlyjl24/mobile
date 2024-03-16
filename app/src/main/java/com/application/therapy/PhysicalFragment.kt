package com.application.therapy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.application.therapy.databinding.FragmentHomeBinding
import com.application.therapy.databinding.FragmentPhysicalBinding

class PhysicalFragment : Fragment() {

    private lateinit var binding: FragmentPhysicalBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPhysicalBinding.inflate(inflater,container,false)
        binding.back.setOnClickListener {
            findNavController().navigate(R.id.action_physicalFragment_to_homeFragment)
        }
        return binding.root
    }

}