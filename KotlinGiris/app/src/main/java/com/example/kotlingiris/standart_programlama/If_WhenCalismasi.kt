package com.example.kotlingiris.standart_programlama

fun main() {
    val yas = 19

    println(yas >= 18)

    if (yas >= 18) {
        println("resitsiniz")
    }else{
        println("resit degilsiniz")
    }

    val k = "admin"
    val s = 123456
    val sayi = 10

    if(k == "admin" && s == 123456){
        println("hosgeldiniz")
    }else{
        println("hatali giris")
    }

    if (sayi == 9 || sayi == 10){
        println("sayi 9 veya 10 dur.")
    }else{
        println("9 veya 10 değildir")
    }

    //when (diğer dillerde switch olarak bilinir.)
    val number = 3
    when (number){
        1 -> println("sayi 1 dir")
        2 -> println("sayi 2 dir")
        3 -> println("sayi 3 dir")
        4 -> println("sayi 4 dir")
        else -> println("tanımlanmayan sayi")
    }

}
