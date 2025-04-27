package com.example.kotlingiris.collections

fun main() {
    //tanimlama
    val meyveler = ArrayList<String>()

    //veri ekleme
    meyveler.add("Elma") //0.
    meyveler.add("Armut") //1.
    meyveler.add("Muz") //2.

    println(meyveler)

    //güncelleme
    meyveler[1]="Kiraz"
    println(meyveler)

    //insert : istediğimiz yere ekleme yapar
    meyveler.add(1,"Portakal")
    println(meyveler)

    //okuma
    println(meyveler.get(3))

    //boyut
    println("Boyut : ${meyveler.size}")

    //terse çevirme
    meyveler.reverse()
    println(meyveler)

    //dizi içerisinde gezme ve yazdırma
    for (meyve in meyveler){
        println("Sonuç : $meyve")
    }

    //index ve veri ile gezme ve yazdırma
    for ((index , meyve ) in meyveler.withIndex()){
        println("$index -> $meyve")
    }

    //indexe göre silme
    meyveler.removeAt(0)
    println(meyveler)

    //tüm diziyi silme
    meyveler.clear()
    println(meyveler)
}