package com.example.kotlingiris.nesne_tabanli_programlama

class ClassB : MyInterface{
    override var degisken: Int = 100


    override fun metod1() {
       println("metod 1 çalıştı")
    }

    override fun metod2(): String {
        return "metod 2 çalıştı"
    }

}