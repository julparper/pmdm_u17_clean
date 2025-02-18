package com.example.clean.data.mock

import com.example.clean.data.PersonaRepository
import com.example.clean.data.model.PersonaModel
import com.example.clean.domain.model.Persona

class PersonaProvider() : PersonaRepository {

    companion object{
        var pos = 1
        private val personas = listOf(
            PersonaModel("Persona 0", "Apellidos Persona 0"),
            PersonaModel("Persona 1", "Apellidos Persona 1")
        )
    }


    override suspend fun leer(): PersonaModel {
        pos = (pos +1) % 2
        return personas[pos]
    }
}