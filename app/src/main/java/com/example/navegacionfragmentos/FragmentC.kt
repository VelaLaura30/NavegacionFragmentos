package com.example.navegacionfragmentos

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentC : Fragment(R.layout.fragment_c) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonNavigateToA).setOnClickListener {
            findNavController().navigate(R.id.action_C_to_A)
        }
    }
}
