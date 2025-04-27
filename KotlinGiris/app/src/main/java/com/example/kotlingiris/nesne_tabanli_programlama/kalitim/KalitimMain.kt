package com.example.kotlingiris.nesne_tabanli_programlama.kalitim

fun main() {
    var hayvan = Hayvan()
    var memeli = Memeli()
    var kedi = Kedi()
    var kopek = Kopek()

    hayvan.sesCikar() //kalitim yok kendi methoduna erişti
    memeli.sesCikar() //kalitim var hayvan methoduna erişti
    kedi.sesCikar() //kalitim var override ile üst sınıfı değiştirdi
    kopek.sesCikar() //kalitim var override ile üst sınıfı değiştirdi
}