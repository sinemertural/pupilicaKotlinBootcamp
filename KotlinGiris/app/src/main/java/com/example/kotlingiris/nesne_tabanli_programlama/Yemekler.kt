package com.example.kotlingiris.nesne_tabanli_programlama

data class Yemekler(var id : Int , var ad : String , var fiyat : Int) {

    //constructor - init fonksiynu
    //bu sınıftan nesne oluştuğunda çalışsın

    init {
        println("******nesne oluştu********")
    }

    fun bilgiAl (){
        println("-------------------")
        println("Id : ${id}")
        println("Ad : ${ad}")
        println("Fiyat : ${fiyat}")
    }

    //this = bulunduğu sınıfı temsil eder . Swift dilinde self olarak adlandırır.
    //super = kalıtım ile bir üst sınıfı temsil eder
}