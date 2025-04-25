package com.example.kotlingiris.nesne_tabanli_programlama

class Fonksiyonlar {
    //swift dilinde fun -> func olur.

    init {
        println("********** nesne olusturuldu *********")
    }

    //void : sadece işlem yapar
    fun selamla1(){
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }

    //return : hem işlem yapar hem veri transferi yapar
    fun selamla2() : String{
        val sonuc = "Merhaba Ahmet"
        return sonuc
    }

    //parametre
    fun selamla3(isim : String){
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    //Overloading
    //Bir sınıf içerisnde aynı isimde fonksiynları tekrar kullanmak
    fun topla (sayi : Int , sayi2 : Int){
        println("Toplama : ${sayi+sayi2}")
    }

    fun topla (sayi : Double , sayi2 : Double){
        println("Toplama : ${sayi+sayi2}")
    }

    fun topla (sayi : Int , sayi2 : Int , isim : String){
        println("Toplama : ${sayi+sayi2} - islem yapan : $isim")
    }
}