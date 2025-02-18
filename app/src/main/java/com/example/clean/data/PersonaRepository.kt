package com.example.clean.data

import com.example.clean.data.model.PersonaModel

interface PersonaRepository {

    suspend fun leer(): PersonaModel
}