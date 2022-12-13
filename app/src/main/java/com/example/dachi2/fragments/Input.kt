package com.example.dachi2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.navigation.Navigation
import com.example.dachi2.R

class Input : Fragment(R.layout.fragment_input) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val input = view.findViewById<EditText>(R.id.input)
        val send = view.findViewById<Button>(R.id.send)
        val navController = Navigation.findNavController(view)

        send.setOnClickListener {

            val amount = input.text.toString()
            if (amount.isEmpty()){
                return@setOnClickListener
            }
            val amount2 = amount.toInt() * 2
            val action = InputDirections.actionInputToOutput(amount2)

            navController.navigate(action)

        }

    }
}
