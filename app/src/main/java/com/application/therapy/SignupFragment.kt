package com.application.therapy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.application.therapy.databinding.FragmentCBinding
import com.application.therapy.databinding.FragmentSignupBinding

class SignupFragment : Fragment() {

    private lateinit var binding: FragmentSignupBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignupBinding.inflate(inflater,container,false)
        binding.signup.setOnClickListener {
            findNavController().navigate(R.id.action_signupFragment_to_loginFragment2)
        }
        binding.Login.setOnClickListener {
            findNavController().navigate(R.id.action_signupFragment_to_loginFragment2)
        }
        return binding.root
    }
}