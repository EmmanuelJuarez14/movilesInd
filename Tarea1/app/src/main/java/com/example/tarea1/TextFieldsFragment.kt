package com.example.tarea1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class TextFieldsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_text_fields, container, false)
        val input = view.findViewById<EditText>(R.id.edit_text_input)
        val btn = view.findViewById<Button>(R.id.btn_show_text)
        val result = view.findViewById<TextView>(R.id.tv_result)
        val btnGoToLists = view.findViewById<Button>(R.id.btn_go_to_lists)

        btn.setOnClickListener {
            result.text = "Ingresaste: ${input.text}"
        }

        btnGoToLists.setOnClickListener {
            (activity as? MainActivity)?.navigateToTab(R.id.nav_lists)
        }

        return view
    }
}