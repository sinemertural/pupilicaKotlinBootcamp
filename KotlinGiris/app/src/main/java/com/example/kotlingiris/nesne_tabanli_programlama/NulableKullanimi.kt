package com.example.kotlingiris.nesne_tabanli_programlama

fun main() {
    //Nullable , Null Safety , Optional (swift)
    //Genellkle mobil geliştirme dillerinde yer almaktadır.

    //1.tanımlama
    var mesaj : String? = null

    mesaj = "merhaba"

    //kullanım senaryosu yöntem 1
    //sorun yoksa çalışır , soru varsa uygulama çökmez
    println("Yontem 1 : ${mesaj?.uppercase()}")

    //kullanım senaryosu yöntem 2
    //sorun yoksa çalışır , soru varsa uygulama çökmez
    //çok emin olduğunuz kodlarda kullanabilirsiniz
   // println("Yontem 2 : ${mesaj!!.uppercase()}") //(bunu çalıştırdığımıdza hata alırız çünkü null emin değiliz yani uygulama çöker)


    //kullanım senaryosu yöntem 3
    if (mesaj != null){
      println("Yontem 3 : ${mesaj.uppercase()}")
    }else {
        println("değişkende null vardır")
    }


    //null  (if kısmını sağlaar else yoktur) (null kontrolü yapar) (null değilse çalışacaktır . null ise çalışmaz)
    mesaj?.let {
        println("Yontem 3 : ${mesaj.uppercase()}")
    }
}