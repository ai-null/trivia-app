package com.gabutproject.triviaapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.gabutproject.triviaapp.databinding.AboutFragmentBinding

class AboutFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: AboutFragmentBinding =
            DataBindingUtil.inflate(inflater, R.layout.about_fragment, container, false)
        return binding.root
    }
}