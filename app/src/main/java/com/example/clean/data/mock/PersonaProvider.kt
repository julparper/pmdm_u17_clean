package com.example.clean.data.mock

import com.example.clean.data.model.PersonaModel
import com.example.clean.domain.model.Persona
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

class PersonaProvider  @Inject constructor(){

    companion object{
        var pos = 1
        private val personas = listOf(
            PersonaModel("Persona 0", "Apellidos Persona 0"),
            PersonaModel("Persona 1", "Apellidos Persona 1")
        )
    }

    suspend fun leer(): Persona {
        pos = (pos +1) % 2
        val persona = personas[pos]
        return Persona(persona.nombre, persona.apellidos)
    }
}