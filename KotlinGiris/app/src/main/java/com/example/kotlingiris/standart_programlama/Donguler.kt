package com.example.kotlingiris.standart_programlama

fun main() {
    // i denilmesinin sebebi index'ten gelir.
    for(i in 1..3){
        println("Dongu $i")
    }
// 10 dan 20 ye kadar 5 er arttırdı.
    for (i in 10..20 step 5){
        println("Dongu 2 : $i")
    }
//20 den 10 a 5 er azalttı.
    for (i in 20 downTo 10 step 5){
        println("Dongu 3 : $i")
    }
//dongu icerisinde sayaç arttırma
    var sayac = 1
    while (sayac < 4){
        println("Dongu 4 : $sayac")
        sayac +=1 // sayac = sayac +1
    }
// break (donguyu durdur)
    for(i in 1..5){
        if(i == 3) break // break döngüyü durdurur.
        println("Dongu 5 :  $i")
    }
//continue (bulundugun adımı pas gec)
    for(i in 1..5){
        if(i == 3) continue //  bulunduğu adımı pas geçer.
        println("Dongu 6 :  $i")
    }
}