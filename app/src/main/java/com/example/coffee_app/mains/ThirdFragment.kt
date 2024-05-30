package com.example.coffee_app.mains


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.coffee_app.R
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

        binding.buttonCarnation.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_carnationFragment)
        }

        binding.buttonGinger.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_gingerFragment)
        }

        binding.buttonBlackpepper.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_blackFragment)
        }

        binding.buttonSalt.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_saltFragment)
        }

        binding.buttonRedpepper.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_redFragment)
        }

        binding.buttonNutmeg.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_nutFragment)
        }

        binding.buttonCoconutoil.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_coconutFragment)
        }

        binding.buttonButter.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_butterFragment)
        }

        binding.buttonCaramel.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_caramelFragment)
        }

        binding.buttonCheese.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_cheeseFragment)
        }

        binding.buttonTonic.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_tonicFragment)
        }

        binding.buttonMint.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_mintFragment)
        }

        binding.buttonLavender.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_lavanderFragment)
        }

        binding.buttonCitrusfruits.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_citrusFragment)
        }

        binding.buttonHoney.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_honeyFragment)
        }

        binding.buttonAlcohol.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_alcoFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}