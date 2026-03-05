package com.example.tarea1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.materialswitch.MaterialSwitch

class SelectionFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_selection, container, false)
        val cb = view.findViewById<CheckBox>(R.id.cb_example)
        val rg = view.findViewById<RadioGroup>(R.id.rg_example)
        val sw = view.findViewById<MaterialSwitch>(R.id.sw_example)
        val status = view.findViewById<TextView>(R.id.tv_selection_status)

        val updateStatus = {
            val selectedRb = view.findViewById<RadioButton>(rg.checkedRadioButtonId)
            val rbText = selectedRb?.text ?: "Ninguno"
            status.text = "CheckBox: ${cb.isChecked}\nRadioButton: $rbText\nSwitch: ${sw.isChecked}"
        }

        cb.setOnCheckedChangeListener { _, _ -> updateStatus() }
        rg.setOnCheckedChangeListener { _, _ -> updateStatus() }
        sw.setOnCheckedChangeListener { _, _ -> updateStatus() }

        return view
    }
}