package com.example.kisileruygulamasi.ui.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.kisileruygulamasi.data.repo.KisilerRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class KisiKayitViewModel: ViewModel() {
    var kisilerRepository = KisilerRepository()

    fun kaydet(kisi_ad: String, kisi_tel: String){ //suspend olmasına gerek olmadığı için böyle yaptık
        CoroutineScope(Dispatchers.Main).launch {
            kisilerRepository.kaydet(kisi_ad,kisi_tel)
        }
    }


}