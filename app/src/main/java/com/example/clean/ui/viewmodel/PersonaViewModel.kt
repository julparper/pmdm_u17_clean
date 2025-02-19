package com.example.clean.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.clean.domain.model.Persona
import com.example.clean.data.mock.PersonaProvider
import com.example.clean.domain.usecase.GetPersonaUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PersonaViewModel @Inject constructor(
    private val getPersonaUseCase: GetPersonaUseCase
): ViewModel() {

    val personaModel = MutableLiveData<Persona>()

    /** Leemos una nueva persona
     */
    fun leerPersona(){
        viewModelScope.launch { //Se ejecuta en una corrutina
            //Esta realiza la llamada al backend, en nuestro caso simulado
            val persona = getPersonaUseCase.invoke()
            //Con el valor leído, se carga en el LiveData
            personaModel.postValue(persona)
        }
    }
}