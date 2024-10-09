package com.example.navegacionfragmentos

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentB : Fragment(R.layout.fragment_b) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonNavigateToC).setOnClickListener {
            findNavController().navigate(R.id.action_B_to_C)
        }
    }
}
