package com.example.kisileruygulamasi.ui.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.kisileruygulamasi.data.repo.KisilerRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AnasayfaViewModel : ViewModel() {
    var kisilerRepository = KisilerRepository()

    fun ara( aramaKelimesi: String){
        CoroutineScope(Dispatchers.Main).launch {
            kisilerRepository.ara(aramaKelimesi)
        }
    }

    fun sil(kisiId: Int) {
        CoroutineScope(Dispatchers.Main).launch {
            kisilerRepository.sil(kisiId)
        }
    }
}