package com.example.navigationodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationodev4.databinding.ActivityMainBinding
import com.example.navigationodev4.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)
        binding.buttonAnaToA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.page_A_gecis)
        }
        binding.buttonAnaToX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.page_X_gecis)
        }
        return binding.root
    }
}