package com.example.tarea1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment

class ButtonsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_buttons, container, false)
        val btnAction = view.findViewById<Button>(R.id.btn_action)
        val imgBtn = view.findViewById<ImageButton>(R.id.img_btn)
        val status = view.findViewById<TextView>(R.id.tv_button_status)

        btnAction.setOnClickListener {
            status.text = "Estado: Botón estándar presionado"
        }

        imgBtn.setOnClickListener {
            status.text = "Estado: ImageButton presionado"
        }

        return view
    }
}