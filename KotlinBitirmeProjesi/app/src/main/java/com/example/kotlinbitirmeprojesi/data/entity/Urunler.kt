package com.example.kotlinbitirmeprojesi.data.entity

import java.io.Serializable

data class Urunler (var yemek_id : Int,
                    var yemek_adi : String,
                    var yemek_resim_adi : String,
                    var yemek_fiyat : Int) : Serializable {
}