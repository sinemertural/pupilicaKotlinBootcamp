package com.example.kotlingiris.nesne_tabanli_programlama

class Odev2 {

    init {
        println("************* Nesne Oluşturuldu ***********")
    }

    fun fahrenhietDonustur(derece : Int) : Double{
        var sonuc = (derece * 1.8) + 32
        return sonuc
    }

    fun cevreHesapla (kisaKenar : Int , uzunKenar : Int){
        var sonuc = (kisaKenar + uzunKenar) * 2
        println("Çevre Hesabi : $sonuc")
    }

    fun faktoriyelHesapla(sayi : Int) : Int{
        var sonuc = 1
        if (sayi != 0){
           for (i in 1..sayi){
               sonuc = i * sonuc
           }
        }else{
            return 1
        }
        return sonuc
    }

    fun harfBul (metin : String){
        var metinUzunluk = metin.length
        var sayac = 0
        for(i in 0..metinUzunluk-1){
            if(metin[i].toChar() == 'a'){
                sayac = sayac + 1
            }
        }
        println("Metindeki a sayisinin değeri : $sayac")
    }

    fun icAciHesapla(kenarSayisi : Int) : Int{
        var sonuc = (kenarSayisi-2) * 180
        return sonuc
    }

    fun maasHesapla(gunSayisi: Int): Int {
        val toplamSaat = gunSayisi * 8
        return if (toplamSaat <= 160) {
            toplamSaat * 10
        } else {
            val mesaiSaat = toplamSaat - 160
            (160 * 10) + (mesaiSaat * 20)
        }
    }

    fun kotaHesapla(kota : Int) : Int {
        var sonuc = 0
        if (kota <= 50 ){
            sonuc = 100
        }else {
            sonuc = (kota - 50) * 4 + 100
        }
        return sonuc
    }

}