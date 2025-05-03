package com.example.calismayapisi

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calismayapisi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding //ekledik
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) //ekledik görsel sonofları kodlamaya aktardığımız sınıflar
        setContentView(binding.root) //içini değiştirdik

        binding.buttonDetay.setOnClickListener {
            val intent = Intent(this@MainActivity,DetayActivity::class.java) //sayfa arası geçiş niyeti = intent
            intent.putExtra("mesaj", "Selam , nasılsın ? ") //veri geçişi (mesaj burada key dir.)
            startActivity(intent)
        }

    }
}