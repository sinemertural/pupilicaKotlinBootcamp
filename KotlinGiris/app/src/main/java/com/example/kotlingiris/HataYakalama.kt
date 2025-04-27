package com.example.kotlingiris

fun main() {
    //compile error - kodlama yaparken olan hata
    //runtime error - (exceptions) / uygulama çalışırken ortaya çıkan hata

    var x = 10
    var y = 5

    println("sonuç : ${x/y}")
    println("işlem tamamlandı")

    try {
        y = 0
        println("sonuç : ${x/y}")
    }catch (e : Exception){
        println("payda sıfır olamaz")
    }
}