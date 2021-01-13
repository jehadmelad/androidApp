package com.faircorp.model

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class ApiServices {
    // Adding in AndroidManifest.xml file ###(android:usesCleartextTraffic="true")### to help to disply results on the emulatore
    // also, in case you are using your phone then you have to add a permition route to your PC, because "Localhost"can not
    // work anymore when both devices considering same, then you have to use PC private IP.
    //    https://jehad.cleverapps.io:443/api/
    //    https://dev-mind.fr/training/android/
    //    http://192.168.1.30:8080/api/
    val windowsApiService: WindowApiService by lazy {
        Retrofit.Builder()
                .addConverterFactory(MoshiConverterFactory.create())
                .baseUrl("http://192.168.1.30:8080/api/")
                .build()
                .create(WindowApiService::class.java)
    }
}