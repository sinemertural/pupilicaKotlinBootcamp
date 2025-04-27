package com.example.kotlingiris.collections

fun main() {
    var iller = HashMap<String, Int>()

    iller.put("bursa" ,16)
    iller.put("ankara" ,6)

    println(iller)

    for ((anahtar , deger) in iller){
        println("$anahtar - $deger")
    }


}