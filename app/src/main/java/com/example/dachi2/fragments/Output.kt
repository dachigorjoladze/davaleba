package com.example.dachi2.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import android.widget.TextView
import androidx.navigation.Navigation
import com.example.dachi2.R


class Output : Fragment(R.layout.fragment_output) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val next = view.findViewById<Button>(R.id.next)
        val ans = view.findViewById<TextView>(R.id.ans)
        val navController = Navigation.findNavController(view)

        ans.text = OutputArgs.fromBundle(requireArguments()).amount.toString()

        next.setOnClickListener{
            val amount = OutputArgs.fromBundle(requireArguments()).amount.toString()
            if (amount.isEmpty()){
                return@setOnClickListener
            }
            val amount2 = amount.toInt()
            val action = OutputDirections.actionOutputToHistory(amount2)

            navController.navigate(action)
        }
    }
}
