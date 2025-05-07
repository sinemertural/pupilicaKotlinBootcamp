package com.example.navigationodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationodev4.databinding.FragmentXPageBinding

class X_Page : Fragment() {
    private lateinit var binding: FragmentXPageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =  FragmentXPageBinding.inflate(inflater, container, false)
        binding.buttonXToY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.page_xto_y)
        }
        return binding.root
    }
}