package com.example.clean.data

import com.example.clean.data.model.PersonaModel
import com.example.clean.domain.model.Persona

interface PersonaRepository {

    suspend fun leer(): Persona
}