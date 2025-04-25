package com.example.kotlingiris.nesne_tabanli_programlama

fun main() {

    //1.soru
    var s1 = Odev2()
    var cozum = s1.fahrenhietDonustur(30)
    println("Fahrenheit : $cozum")

    //2.soru
    s1.cevreHesapla(10,20)

    //3.soru
    var cozum2 = s1.faktoriyelHesapla(0)
    println("Faktöriyel Hesabı : $cozum2")

    //4.soru
    s1.harfBul("araba")

    //5.soru
    var cozum3 = s1.icAciHesapla(3)
    println("İç açılar toplamı : $cozum3")

    //6.soru
    var cozum4 = s1.maasHesapla(30)
    println("Maaş : $cozum4")

    //7.soru
    var cozum5 = s1.kotaHesapla(52)
    println("Ucret : $cozum5")
}