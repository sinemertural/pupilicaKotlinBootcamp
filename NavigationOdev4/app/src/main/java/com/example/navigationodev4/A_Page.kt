package com.example.navigationodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationodev4.databinding.FragmentAPageBinding

class A_Page : Fragment() {
    private lateinit var binding: FragmentAPageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAPageBinding.inflate(inflater, container, false)
        binding.buttonAToB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.page_B_gecis)
        }
        return binding.root
    }
}