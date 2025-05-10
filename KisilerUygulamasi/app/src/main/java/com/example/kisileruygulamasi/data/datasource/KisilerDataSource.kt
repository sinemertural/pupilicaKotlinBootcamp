package com.example.kisileruygulamasi.data.datasource

import android.util.Log

class KisilerDataSource {
    suspend fun kaydet(kisi_ad: String,kisi_tel: String){   //suspend - coroutine oluyor  / corputine aynı anda birden fazla iş yapmasını sağlar
        Log.e("Kişi Kaydet","$kisi_ad - $kisi_tel")
    }

    suspend fun guncelle(kisi_id:Int,kisi_ad: String,kisi_tel: String){
        Log.e("Kişi Güncelle","$kisi_id - $kisi_ad - $kisi_tel")
    }

    suspend fun ara( aramaKelimesi: String){
        Log.e("Kişi Ara", aramaKelimesi)
    }

    suspend fun sil(kisiId: Int) {
        Log.e("Kişi sil : " , kisiId.toString())
    }
}