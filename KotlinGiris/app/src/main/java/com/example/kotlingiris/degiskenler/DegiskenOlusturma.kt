package com.example.kotlingiris.degiskenler

fun main() {
    var urunId = 1
    var urunName = "mont"
    var urunImage = "mont.png"
    var urunPoint = 4.7
    var urunPrice = 4500
    var urunStock = true

    println("ID : $urunId")
    println("Urun name : $urunName")
    println("Urun isim : $urunImage")
    println("Urun puan : $urunPoint")
    println("Urun fiyat : $urunPrice")
    println("Urun stok : $urunStock")

    //Sabitler (Constant)
    var number = 30
    number = 100
    println(number)

    val number2 = 37
    println(number2)

    //Tür Dönüşümü
    //1 - Sayisaldan sayisala dönüsüm
    val d = 89.56
    val sonuc = d.toInt()
    println("${d.toInt()}")
    println("$sonuc")

    //Sayisaldan metine dönüşüm
    var x = 85
    var metin = x.toString()
    println("$metin")

    //metinden sayisala
    val yazi = "39t"
    val sonuc2 = yazi.toIntOrNull()
    if (sonuc2 != null ){
        println("$yazi")
    }else {
        println("sayi nulldur.")
    }



}