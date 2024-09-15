package com.example.listfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.FragmentManager

class SecondFragment : Fragment() {

    lateinit var imageView: ImageView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val view: View = inflater.inflate(R.layout.fragment_second, container,false)
        imageView = view.findViewById(R.id.imageView)

        val position = arguments?.getInt("position",0)
        when(position) {
            0 -> imageView.setImageResource(R.drawable.i01)
            1 -> imageView.setImageResource(R.drawable.i02)
            2 -> imageView.setImageResource(R.drawable.i03)
            3 -> imageView.setImageResource(R.drawable.i04)
            4 -> imageView.setImageResource(R.drawable.i05)

        }

        return view
    }
}