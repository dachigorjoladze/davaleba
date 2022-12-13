package com.example.dachi2.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import android.widget.TextView
import com.example.dachi2.R


class History : Fragment(R.layout.fragment_history) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val formula = view.findViewById<TextView>(R.id.formula)

        val amount = HistoryArgs.fromBundle(requireArguments()).amount1.toString()

        val string = "Formula: input * 2 = "

        formula.text = string + amount

    }
}
