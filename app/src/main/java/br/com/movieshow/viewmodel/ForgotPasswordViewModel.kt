package br.com.movieshow.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ForgotPasswordViewModel : ViewModel() {
    val password = MutableLiveData<String>()
    val email = MutableLiveData<String>()
}
