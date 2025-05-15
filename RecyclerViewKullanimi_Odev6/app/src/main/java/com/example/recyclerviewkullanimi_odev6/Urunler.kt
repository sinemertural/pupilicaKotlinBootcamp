package com.example.recyclerviewkullanimi_odev6

import java.io.Serializable

class Urunler(
    var id: Int,
    var urunIsim: String,
    var urunFiyat: Double,
    var urunResim: String
    ) : Serializable{

}