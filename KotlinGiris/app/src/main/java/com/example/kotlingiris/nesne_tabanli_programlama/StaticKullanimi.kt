package com.example.kotlingiris.nesne_tabanli_programlama

fun main() {
    val a = Class_A()

    //nesne ile başka sınıftaki method ve değişkene eriştim. (standart nesne tabanli erişim)
   // println(a.x)
    //a.method()

    //yularidaki ve altındaki kullanimda fark şudur alttaki yöntemde iki ayrı nesne oluşturuldu.yukarida tek nesne ile halloldu.

    // Sanal nesne (virtual object) (nameless object)
    //println(Class_A().x) //1.nesne
    //Class_A().method() //2.nesne


    //static kullanimi
    println(Class_A.x)
    Class_A.method()

    //parantez yoksa stattic kullanim diyebilirim.

}