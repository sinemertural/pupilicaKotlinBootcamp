package com.example.kisileruygulamasi.data.repo

import android.util.Log
import com.example.kisileruygulamasi.data.datasource.KisilerDataSource

class KisilerRepository {
    var kisilerDataSource = KisilerDataSource()

    suspend fun kaydet(kisi_ad: String,kisi_tel: String) = kisilerDataSource.kaydet(kisi_ad,kisi_tel)   //suspend - coroutine oluyor  / corputine aynı anda birden fazla iş yapmasını sağlar
//fonskiyon olarak da yazılır bu şkeilde kısaltılmış olur

    suspend fun guncelle(kisi_id:Int,kisi_ad: String,kisi_tel: String) =  kisilerDataSource.guncelle(kisi_id,kisi_ad,kisi_tel)

    suspend fun ara( aramaKelimesi: String) =kisilerDataSource.ara(aramaKelimesi)

    suspend fun sil(kisiId: Int)  = kisilerDataSource.sil(kisiId)



}