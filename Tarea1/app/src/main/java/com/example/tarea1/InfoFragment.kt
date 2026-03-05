package com.example.tarea1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import androidx.fragment.app.Fragment

class InfoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_info, container, false)
        val progressBar = view.findViewById<ProgressBar>(R.id.pb_example)
        val btnUpdate = view.findViewById<Button>(R.id.btn_update_pb)

        btnUpdate.setOnClickListener {
            val nextProgress = (progressBar.progress + 10) % 110
            progressBar.progress = nextProgress
        }

        return view
    }
}