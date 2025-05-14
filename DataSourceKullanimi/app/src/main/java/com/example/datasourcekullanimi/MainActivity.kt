package com.example.datasourcekullanimi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.datasourcekullanimi.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val appPref = AppPref(this)

        CoroutineScope(Dispatchers.Main).launch { //coroutine kullanmamın sebebi suspen fonksiyonu kullanıyor olmam
            appPref.sil() //cevap hep 1 gelir çünkü full siler ve açıldığınd abir olur
            var gelenSayac = appPref.oku()
            appPref.kayit(++gelenSayac)
            binding.textViewSayac.text="Açılış Sayisi = ${gelenSayac}"
        }


    }
}