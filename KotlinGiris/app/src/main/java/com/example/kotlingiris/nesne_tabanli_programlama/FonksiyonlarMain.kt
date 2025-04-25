package com.example.kotlingiris.nesne_tabanli_programlama

fun main() {
    val f1 = Fonksiyonlar()

    //void : Unit
    f1.selamla1()

    //return : String
    val gelenSonuc = f1.selamla2()
    println("Gelen Sonuc : $gelenSonuc")

    //parametre
    f1.selamla3("Sinem")

    f1.topla(1,1)
    f1.topla(2.2,2.3)
    f1.topla(2,3,"Beyza")
}