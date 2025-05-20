package com.example.recyclerviewkullanimi_odev6

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewkullanimi_odev6.databinding.CardTasarimBinding
import com.example.recyclerviewkullanimi_odev6.databinding.FragmentUrunlerBinding
import com.google.android.material.snackbar.Snackbar

class UrunlerAdapter(var mContext : Context , var urunlerListesi : List<Urunler>) :
RecyclerView.Adapter<UrunlerAdapter.CardTasarimTutucu>(){

    inner class CardTasarimTutucu(var tasarim : CardTasarimBinding) :RecyclerView.ViewHolder(tasarim.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        var binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }



    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val urun = urunlerListesi.get(position)
        val t = holder.tasarim
        t.textViewFiyat.text = "${urun.urunFiyat} TL"
        t.textViewUrunName.text = "${urun.urunIsim}"
        t.imageViewUrunResim.setImageResource(
            mContext.resources.getIdentifier(urun.urunResim,"drawable",mContext.packageName)
        )
        t.butonEkle.setOnClickListener {
            Snackbar.make(it,"${urun.urunIsim} sepete eklendi.", Snackbar.LENGTH_SHORT).show()
        }
        t.cardViewUrun.setOnClickListener{
            val gecis = UrunlerFragmentDirections.detayGecis(urunNesnesi = urun)
            Navigation.findNavController(it).navigate(gecis)
        }
    }

    override fun getItemCount(): Int {
        return urunlerListesi.size
    }
}