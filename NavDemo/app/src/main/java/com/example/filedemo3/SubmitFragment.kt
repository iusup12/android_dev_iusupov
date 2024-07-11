package com.example.filedemo3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.filedemo3.databinding.FragmentSubmitBinding
import com.google.android.material.snackbar.Snackbar

class SubmitFragment : Fragment() {

    private lateinit var binding: FragmentSubmitBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSubmitBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.submitButton.setOnClickListener {
            onButtonClicked(it)

        }
    }

    fun onButtonClicked(view: View) {
        val text = binding.editText.text.toString()
        if (text.isBlank()) {
            Snackbar.make(binding.root, "data", Snackbar.LENGTH_LONG).show()
        } else {
            val action = SubmitFragmentDirections.actionSubmitFragmentToResultFragment(text)
            findNavController().navigate(action)
        }
    }
}