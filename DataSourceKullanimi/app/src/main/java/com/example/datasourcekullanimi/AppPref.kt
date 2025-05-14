package com.example.datasourcekullanimi

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first

class AppPref(var context : Context) {
    val Context.ds: DataStore<Preferences> by preferencesDataStore("bilgiler") //ds dataasource anlamında verdim. bilgiler adında bir dosya oluşturdum.

    companion object {
        val SAYAC_KEY = intPreferencesKey("SAYAC")
    }
    suspend fun kayit(sayac : Int){
        context.ds.edit {
            it[SAYAC_KEY] = sayac
        }
    }

    suspend fun oku() : Int{
        val p = context.ds.data.first()
        return p[SAYAC_KEY] ?: 0 //hata olması durumunda sıfır gelsin
    }

    suspend fun sil (){
        context.ds.edit {
            it.remove(SAYAC_KEY)
        }
    }
}