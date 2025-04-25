package com.example.kotlingiris.nesne_tabanli_programlama

fun main() {

    //Nesne oluşturma
    val yemek1 = Yemekler(1,"Makarna", 300)
    val yemek2 = Yemekler(2,"Baklava", 1200)

   yemek1.bilgiAl()



    // değer değiştirme
    yemek1.fiyat = 500
    yemek1.bilgiAl()

    yemek2.bilgiAl()


}