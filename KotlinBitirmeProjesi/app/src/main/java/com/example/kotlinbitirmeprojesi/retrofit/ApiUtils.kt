package com.example.kotlinbitirmeprojesi.retrofit

class ApiUtils {
    companion object {
        val BASE_URL = "http://kasimadalan.pe.hu/"

        fun UrunlerDao() : UrunlerDao {
            return RetrofitClient.getClient(BASE_URL).create(UrunlerDao::class.java)
        }
    }
}