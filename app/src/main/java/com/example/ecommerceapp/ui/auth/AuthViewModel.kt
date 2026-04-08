package com.example.ecommerceapp.ui.auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ecommerceapp.repository.AuthRepository
import com.example.ecommerceapp.utils.Resource
import com.google.firebase.auth.FirebaseUser
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val repository: AuthRepository
) : ViewModel() {

    private val _authState = MutableStateFlow<Resource<FirebaseUser>?>(null)
    val authState: StateFlow<Resource<FirebaseUser>?> = _authState

    val currentUser = repository.getCurrentUser()

    fun login(email: String, password: String) {
        viewModelScope.launch {
            repository.loginUser(email, password).collect {
                _authState.value = it
            }
        }
    }

    fun register(email: String, password: String, name: String) {
        viewModelScope.launch {
            repository.registerUser(email, password, name).collect {
                _authState.value = it
            }
        }
    }

    fun logout() {
        repository.logoutUser()
    }
    
    fun resetState() {
        _authState.value = null
    }
}
