package com.example.masterchef.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.masterchef.R

class FavoriteFragment: Fragment() {
    private lateinit var mValue: String

    companion object{
        private const val keyParamFavorite: String = "keyParamFavorite"

        fun newInstance(valueFavorite: String): FavoriteFragment{
            val fragment = FavoriteFragment()
            val args = Bundle()
            args.putString(keyParamFavorite, valueFavorite)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if(arguments != null){
            mValue = requireArguments().get(keyParamFavorite) as String
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frag_favorite, container, false)

    }
}