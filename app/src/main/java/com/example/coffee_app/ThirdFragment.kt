package com.example.coffee_app


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.coffee_app.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    private var _binding: FragmentThirdBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonReturn2.setOnClickListener {
            findNavController().navigate(R.id.action_ThirdFragment_to_FirstFragment)
        }

        binding.buttonCinnamon.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_cinnamonFragment)
        }

        binding.buttonVanilla.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_vanillaFragment)
        }

        binding.buttonBadian.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_badianFragment)
        }



    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}