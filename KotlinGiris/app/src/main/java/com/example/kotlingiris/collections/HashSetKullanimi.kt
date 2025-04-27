package com.example.kotlingiris.collections

fun main() {
    //HASHSET
    //TANIMLAMA
    val meyveler = HashSet<String>()
    meyveler.add("elma")
    meyveler.add("muz")
    meyveler.add("kiraz")
    println(meyveler)

    //tekrar ekleme yapmaz
    meyveler.add("elma")
    println(meyveler)

    //boyut
    println("boyut : ${meyveler.size}")

    //veri çekme
    val y = meyveler.elementAt(2)
    println(y)

    //dizi içerisinde gezme ve yazdırma
    for (meyve in meyveler){
        println("Sonuç : $meyve")
    }

    //index ve veri ile gezme ve yazdırma
    for ((index , meyve ) in meyveler.withIndex()){
        println("$index -> $meyve")
    }

    //istediğim elmanı silebilirim
    meyveler.remove("elma")
    println(meyveler)

    //tüm listeyi silebilirim
    meyveler.clear()
    println(meyveler)
}