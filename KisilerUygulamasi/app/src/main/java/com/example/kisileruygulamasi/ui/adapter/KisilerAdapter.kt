package com.example.kisileruygulamasi.ui.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.kisileruygulamasi.data.entity.Kisiler
import com.example.kisileruygulamasi.databinding.CardTasarimBinding
import com.example.kisileruygulamasi.databinding.FragmentAnasayfaBinding
import com.example.kisileruygulamasi.ui.fragment.AnasayfaFragmentDirections
import com.google.android.material.snackbar.Snackbar

class KisilerAdapter(var mContext : Context, var kisilerListesi : List<Kisiler>) :
RecyclerView.Adapter<KisilerAdapter.CardTasarimTutucu>(){



    inner class CardTasarimTutucu (var tasarim :CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
       val tasarim = CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun getItemCount(): Int {
        return kisilerListesi.size
    }



    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val kisi = kisilerListesi.get(position)
        val t = holder.tasarim
        t.kisiAd.text = kisi.kisi_ad
        t.kisiTel.text = kisi.kisi_tel


        t.imageViewSil.setOnClickListener{
            Snackbar.make(it,"${kisi.kisi_ad} silinsin mi ?", Snackbar.LENGTH_SHORT)
                .setAction("EVET"){
                    sil(kisi.kisi_id)
                }.show()
        }

        t.cardViewSatir.setOnClickListener{
            val gecis = AnasayfaFragmentDirections.kisiDetayGecis(kisi = kisi )
            Navigation.findNavController(it).navigate(gecis)
        }

    }


    fun sil(kisiId: Int) {
        Log.e("Kişi sil : " , kisiId.toString())
    }




}