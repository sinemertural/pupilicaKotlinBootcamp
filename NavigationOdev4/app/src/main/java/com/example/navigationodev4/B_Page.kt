package com.example.navigationodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationodev4.databinding.FragmentAPageBinding
import com.example.navigationodev4.databinding.FragmentBPageBinding

class B_Page : Fragment() {
    private lateinit var binding: FragmentBPageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBPageBinding.inflate(inflater, container, false)
        binding.buttonBToY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.page_Y_gecis)
        }
        return binding.root
    }
}