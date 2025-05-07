package com.example.navigationodev4

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import com.example.navigationodev4.databinding.FragmentXPageBinding
import com.example.navigationodev4.databinding.FragmentYPageBinding

class Y_Page : Fragment() {
    private lateinit var binding: FragmentYPageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentYPageBinding.inflate(inflater, container, false)

        val geriTusu = object : OnBackPressedCallback(true){ //true demek geri tusu aktif
            override fun handleOnBackPressed() {
                Log.e("Detay Sayfa","geri tuşu çalıştı")
                findNavController().navigate(R.id.geriGecis)
                isEnabled = false
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,geriTusu)

        return binding.root
    }


}