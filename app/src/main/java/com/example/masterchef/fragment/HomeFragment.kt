package com.example.masterchef.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.masterchef.R

class HomeFragment: Fragment() {

    private lateinit var mValue: String

    companion object{
        private const val keyParamHome: String = "keyParamHome"

        fun newInstance(valueHome: String): HomeFragment{
            val fragment = HomeFragment()
            val args = Bundle()
            args.putString(keyParamHome, valueHome)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if(arguments != null){
            mValue = requireArguments().get(keyParamHome) as String
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frag_home, container, false)

    }

}