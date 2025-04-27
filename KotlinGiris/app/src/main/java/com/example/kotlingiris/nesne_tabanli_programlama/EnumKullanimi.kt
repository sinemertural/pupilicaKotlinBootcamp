package com.example.kotlingiris.nesne_tabanli_programlama

fun main() {
    ucretHesapla(KonserveBoyut.ORTA , 55)
}

fun ucretHesapla(boyut: KonserveBoyut, adet : Int){
    when (boyut){
        KonserveBoyut.KUCUK -> println("Ucret : ${adet * 104} TL")
        KonserveBoyut.ORTA -> println("Ucret : ${adet * 207} TL")
        KonserveBoyut.BUYUK -> println("Ucret : ${adet * 309} TL")
    }
}