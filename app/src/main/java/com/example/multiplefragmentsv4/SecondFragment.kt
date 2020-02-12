package com.example.multiplefragmentsv4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.CheckedTextView
import androidx.fragment.app.Fragment
import android.widget.TextView
import kotlinx.android.synthetic.main.first_fragment.*
import kotlinx.android.synthetic.main.second_fragment.*


class SecondFragment : Fragment() {

    lateinit var textView:TextView
    lateinit var checkbox:CheckBox
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.second_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.second_fragment_text)
        textView.text  = "Display"



    }



}