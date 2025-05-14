package com.example.recyclerviewkullanimi_odev6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.recyclerviewkullanimi_odev6.databinding.FragmentUrunlerBinding

class UrunlerFragment : Fragment() {
    private lateinit var binding: FragmentUrunlerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUrunlerBinding.inflate(inflater, container, false)
        return binding.root
    }
}