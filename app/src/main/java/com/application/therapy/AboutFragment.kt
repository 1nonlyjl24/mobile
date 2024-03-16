package com.application.therapy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.application.therapy.databinding.FragmentAboutBinding
import com.application.therapy.databinding.FragmentBBinding

class AboutFragment : Fragment() {

    private lateinit var binding: FragmentAboutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAboutBinding.inflate(inflater,container,false)
//        binding.ratingBar.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
//            Toast.makeText(this, "Rating: $rating", Toast.LENGTH_SHORT).show()
//        }
        binding.back.setOnClickListener {
            findNavController().navigate(R.id.action_aboutFragment_to_profileFragment)
        }
        return binding.root
    }

}