package com.example.clean.data

import com.example.clean.data.mock.PersonaProvider
import com.example.clean.domain.model.Persona
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject
import javax.inject.Singleton


public class PersonaRepository @Inject constructor(
    private val repository: PersonaProvider

    //Aquí podría añadir dos atributos: retrofit y room
) {


   suspend fun  leer(): Persona{
       return repository.leer()
   }
}