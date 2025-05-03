package com.example.navigationcomponentkullanimi

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView( //onCreateView = yaşamDöngüsü methodu (görsel nesneleri bu methoda yükleriz )
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.buttonDetay.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.detayGecis("Nasılsın" , 99)
            Navigation.findNavController(it).navigate(gecis)//it burda buttonDetay ı temsil ediyor
        }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Uygulamayı çalıştırdığımız zaman bir kere çalışır
        Log.e("Yaşam Döngüsü","onCreate")
    }

    override fun onResume() {
        super.onResume()
        //Bululunduğu sayfa her göründüğünde çalışır.
        //Bu sayfaya geri dönülüdüğünde çalışr.
        Log.e("Yaşam Döngüsü","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Yaşam Döngüsü","onPause")
    }
}