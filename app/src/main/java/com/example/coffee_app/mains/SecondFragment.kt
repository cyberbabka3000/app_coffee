package com.example.coffee_app.mains

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.coffee_app.R
import com.example.coffee_app.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return _binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonReturn.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_FirstFragment)
        }

        binding.buttonEspresso.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_EspressoFragment)
        }

        binding.buttonAmericano.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_americanoFragment)
        }

        binding.buttonDoppio.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_doppioFragment)
        }

        binding.buttonRistretto.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_ristettoFragment)
        }

        binding.buttonLungo.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_lungoFragment)
        }

        binding.buttonRomanscoffee.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_romanoFragment)
        }

        binding.buttonCubancoffee.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_cubanFragment)

        }

        binding.buttonTriplo.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_tripploFragment)
        }

        binding.buttonAffogato.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_affogatoFragment)
        }

        binding.buttonCappuccino.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_cappuccinoFragment)
        }

        binding.buttonLatte.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_latteFragment)
        }

        binding.buttonViennesecoffee.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_vienneFragment)
        }

        binding.buttonMelange.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_melangeFragment)
        }

        binding.buttonFlatWhite.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_flatwhiteFragment)
        }

        binding.buttonRafCoffee.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_rafFragment)
        }

        binding.buttonMoccachino.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_moccachinoFragment)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}