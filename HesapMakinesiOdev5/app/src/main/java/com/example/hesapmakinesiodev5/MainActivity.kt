package com.example.hesapmakinesiodev5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hesapmakinesiodev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var currentInput: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Rakam butonları
        binding.buttonSifir.setOnClickListener { appendToInput("0") }
        binding.buttonBir.setOnClickListener { appendToInput("1") }
        binding.buttonIki.setOnClickListener { appendToInput("2") }
        binding.buttonUc.setOnClickListener { appendToInput("3") }
        binding.buttonDort.setOnClickListener { appendToInput("4") }
        binding.buttonBes.setOnClickListener { appendToInput("5") }
        binding.buttonAlti.setOnClickListener { appendToInput("6") }
        binding.buttonYedi.setOnClickListener { appendToInput("7") }
        binding.buttonSekiz.setOnClickListener { appendToInput("8") }
        binding.buttonDokuz.setOnClickListener { appendToInput("9") }

        // İşlem butonları
        binding.buttonTopla.setOnClickListener { appendToInput("+") }
        binding.buttonCikar.setOnClickListener { appendToInput("-") }
        binding.buttonCarpma.setOnClickListener { appendToInput("*") }
        binding.buttonBolme.setOnClickListener { appendToInput("/") }

        // AC butonu
        binding.buttonAC.setOnClickListener {
            currentInput = ""
            binding.textViewSonuc.text = ""
        }

        // Eşittir (=) butonu: sonucu hesapla
        binding.buttonSonuc.setOnClickListener {
            val result = hesapla(currentInput)
            binding.textViewSonuc.text = result
            currentInput = result
        }
    }

    private fun appendToInput(str: String) {
        currentInput += str
        binding.textViewSonuc.text = currentInput
    }

    private fun hesapla(ifade: String): String {
        return try {
            when {
                ifade.contains("+") -> {
                    val parts = ifade.split("+")
                    (parts[0].toDouble() + parts[1].toDouble()).toString()
                }
                ifade.contains("-") -> {
                    val parts = ifade.split("-")
                    (parts[0].toDouble() - parts[1].toDouble()).toString()
                }
                ifade.contains("*") -> {
                    val parts = ifade.split("*")
                    (parts[0].toDouble() * parts[1].toDouble()).toString()
                }
                ifade.contains("/") -> {
                    val parts = ifade.split("/")
                    if (parts[1].toDouble() == 0.0) "Hata" else (parts[0].toDouble() / parts[1].toDouble()).toString()
                }
                else -> "Hata"
            }
        } catch (e: Exception) {//hata mesajı
            "Hata"
        }
    }
}
