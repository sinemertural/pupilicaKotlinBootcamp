package com.example.recyclerviewkullanimi_odev6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.recyclerviewkullanimi_odev6.databinding.FragmentDetayBinding
import com.google.android.material.snackbar.Snackbar

class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetayBinding.inflate(inflater, container, false)
        val bundle : DetayFragmentArgs by navArgs()
        val urun = bundle.urunNesnesi

        binding.textViewDetayFiyat.text = "${urun.urunFiyat} ₺"
        binding.textViewAciklama.text = "Ürünün stok, fiyat ve kampanya bilgisi,teslimatı gerçekleştirecek mağazanın stok, fiyat ve kampanya bilgilerine göre belirlenmektedir."
        binding.textViewKategori.text = "Meyve , Sebze"
        binding.textViewUrunDetay.text = "Ürün Detayı"
        binding.button.setOnClickListener {
            Snackbar.make(it,"${urun.urunIsim} sepete eklendi.",Snackbar.LENGTH_SHORT).show()
        }
        binding.imageViewUrunResim.setImageResource(
            resources.getIdentifier(urun.urunResim,"drawable",requireContext().packageName)
        )
        binding.textViewUrunAdi.text = "${urun.urunIsim}"


        return binding.root
    }
}