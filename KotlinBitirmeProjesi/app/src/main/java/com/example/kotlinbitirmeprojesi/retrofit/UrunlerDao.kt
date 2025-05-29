package com.example.kotlinbitirmeprojesi.retrofit

import com.example.kotlinbitirmeprojesi.data.entity.CRUDCevap
import com.example.kotlinbitirmeprojesi.data.entity.UrunlerCevap
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface UrunlerDao  {

    @GET("yemekler/tumYemekleriGetir.php")
    suspend fun urunleriYukle () : UrunlerCevap

    @POST("yemekler/sepeteYemekEkle.php")
    @FormUrlEncoded
    suspend fun sepeteUrunEkle(@Field("yemek_adi") yemek_adi: String,
                       @Field("yemek_resim_adi") yemek_resim_adi : String,
                       @Field("yemek_fiyat ") yemek_fiyat : Int,
                       @Field("yemek_siparis_adet ") yemek_siparis_adet : Int,
                       @Field("kullanici ") kullanici: String) : CRUDCevap

    @POST("yemekler/sepettekiYemekleriGetir.php")
    @FormUrlEncoded
    suspend fun sepetYemekGetir(@Field("kullanici_adi") kullanici_adi: String) : UrunlerCevap

    @POST("yemekler/sepettenYemekSil.php")
    @FormUrlEncoded
    suspend fun sepettenYemekSil(@Field("sepet_yemek_id ") sepet_yemek_id : Int,
                    @Field("kullanici ") kullanici: String): CRUDCevap
}