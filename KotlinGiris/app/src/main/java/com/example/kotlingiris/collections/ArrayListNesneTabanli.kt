package com.example.kotlingiris.collections

fun main() {
    var f1 = Filmler(1,"Başlangıç", 500)
    var f2 = Filmler(2,"Kayıp Kız", 300)
    var f3 = Filmler(3,"Aslan Kral", 200)

    val filmlerListesi = ArrayList<Filmler>()
    filmlerListesi.add(f1)
    filmlerListesi.add(f2)
    filmlerListesi.add(f3)

    for(film in filmlerListesi){
       println("Id : ${film.id} - Ad : ${film.ad} - Fiyat : ${film.fiyat} TL")
    }

    //SIRALAMA
    println("---------------Fiyata göre artan-------------") //ASCEND - ASC - (artan)
    val siralama1 = filmlerListesi.sortedWith(compareBy{it.fiyat})

    for(film in siralama1){
        println("Id : ${film.id} - Ad : ${film.ad} - Fiyat : ${film.fiyat} TL")
    }

    println("---------------Fiyata göre azalan-------------") //DESCEND - DESC - (azalan)
    val siralama2 = filmlerListesi.sortedWith(compareByDescending{it.fiyat})

    for(film in siralama2){
        println("Id : ${film.id} - Ad : ${film.ad} - Fiyat : ${film.fiyat} TL")
    }

    //FİLTRELEME
    println("------------FİLTRELEME 1-------------")
    val filtreleme1 = filmlerListesi.filter { 300>= it.fiyat && it.fiyat>= 100 }

    for(film in filtreleme1){
        println("Id : ${film.id} - Ad : ${film.ad} - Fiyat : ${film.fiyat} TL")
    }

    println("------------FİLTRELEME 2-------------")
    val filtreleme2 = filmlerListesi.filter {it.ad.contains("K")}

    for(film in filtreleme2){
        println("Id : ${film.id} - Ad : ${film.ad} - Fiyat : ${film.fiyat} TL")
    }

}