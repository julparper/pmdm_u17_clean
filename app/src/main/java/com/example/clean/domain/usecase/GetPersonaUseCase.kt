package com.example.clean.domain.usecase

import com.example.clean.data.PersonaRepository
import com.example.clean.domain.model.Persona
import javax.inject.Inject

class GetPersonaUseCase @Inject constructor(
    private val repository: PersonaRepository
) {

    suspend operator fun invoke(): Persona {
        val persona = repository.leer()
        return persona
    }
}