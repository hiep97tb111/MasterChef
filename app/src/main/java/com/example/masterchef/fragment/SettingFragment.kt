package com.example.masterchef.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.masterchef.R

class SettingFragment: Fragment() {
    private lateinit var mValue: String

    companion object{
        private const val keyParamSetting: String = "keyParamSetting"

        fun newInstance(valueSetting: String): SettingFragment{
            val fragment = SettingFragment()
            val args = Bundle()
            args.putString(keyParamSetting, valueSetting)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if(arguments != null){
            mValue = requireArguments().get(keyParamSetting) as String
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frag_setting, container, false)

    }
}