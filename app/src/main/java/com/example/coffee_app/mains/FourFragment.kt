package com.example.coffee_app.mains

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.coffee_app.R
import com.example.coffee_app.databinding.FragmentFourBinding

class FourFragment : Fragment() {

    private var _binding: FragmentFourBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFourBinding.inflate(inflater, container, false)
        return _binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonReturn50.setOnClickListener {
            findNavController().navigate(R.id.action_fourFragment_to_firstFragment)
        }

        binding.buttonAboutUs.setOnClickListener {
            findNavController().navigate(R.id.action_fourFragment_to_aboutusFragment)
        }

        binding.buttonQuestions.setOnClickListener {
            findNavController().navigate(R.id.action_fourFragment_to_questionfragment)
        }

        binding.buttonReviews.setOnClickListener {
            findNavController().navigate(R.id.action_fourFragment_to_reviewFragment)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}