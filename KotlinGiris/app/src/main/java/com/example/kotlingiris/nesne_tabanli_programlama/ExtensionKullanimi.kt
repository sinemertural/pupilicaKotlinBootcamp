package com.example.kotlingiris.nesne_tabanli_programlama

fun main() {
   // val sonuc = 5.carp(2)
    val sonuc = 5 carp 2
    println(sonuc)
}

infix fun Int.carp (sayi1 : Int ) : Int{
    return this * sayi1 //this(int)
}