package com.example.clean.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.clean.domain.model.Persona
import com.example.clean.data.mock.PersonaProvider

class PersonaViewModel: ViewModel() {

    val personaModel = MutableLiveData<Persona>()

    /** Leemos una nueva persona
     */
    fun leerPersona(){
        //Esta realiza la llamada al backend, en nuestro caso simulado
        val persona = PersonaProvider.leer()
        //Con el valor leído, se carga en el LiveData
        personaModel.postValue(persona)
    }
}