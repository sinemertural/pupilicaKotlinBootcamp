package com.example.recyclerviewkullanimi_odev6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recyclerviewkullanimi_odev6.databinding.FragmentUrunlerBinding

class UrunlerFragment : Fragment() {
    private lateinit var binding: FragmentUrunlerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUrunlerBinding.inflate(inflater, container, false)

        val urunlerListesi = ArrayList<Urunler>()
        val u1 = Urunler(1,"Limon" , 79.95 ,"limonn")
        val u2 = Urunler(2,"Acı Biber" , 119.95 ,"acibiberr")
        val u3 = Urunler(3,"Atom Salata" , 36.95 ,"atomsalataa")
        val u4 = Urunler(4,"Çeri Domates" , 64.95 ,"cerii")
        val u5 = Urunler(5,"Çilek" , 164.95 ,"cilekk")
        val u6 = Urunler(6,"Domates" , 49.95 ,"domatess")
        val u7 = Urunler(7,"Havuç" , 64.95 ,"havucc")
        val u8 = Urunler(8,"Kabak" , 37.95 ,"kabakk")
        val u9 = Urunler(9,"Maydanoz" , 17.95 ,"maydanozz")
        val u10 = Urunler(10,"Muz" , 99.95 ,"muzz")
        val u11 = Urunler(11,"Portakal" , 59.95 ,"portakall")
        val u12 = Urunler(12,"Salatalık" , 29.95 ,"salatalikk")
        val u13 = Urunler(13,"Sivri Biber" , 49.95 ,"sivribiberr")

        urunlerListesi.add(u1)
        urunlerListesi.add(u2)
        urunlerListesi.add(u3)
        urunlerListesi.add(u4)
        urunlerListesi.add(u5)
        urunlerListesi.add(u6)
        urunlerListesi.add(u7)
        urunlerListesi.add(u8)
        urunlerListesi.add(u9)
        urunlerListesi.add(u10)
        urunlerListesi.add(u11)
        urunlerListesi.add(u12)
        urunlerListesi.add(u13)

        val urunlerAdapter = UrunlerAdapter(requireContext(),urunlerListesi)
        binding.urunlerRV.adapter = urunlerAdapter
        binding.urunlerRV.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        return binding.root
    }
}