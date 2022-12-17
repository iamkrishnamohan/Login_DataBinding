package com.example.login

import android.util.Log
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    var emailAddress = MutableLiveData<String>()
    var password = MutableLiveData<String>()

    init {
        emailAddress.value = ""
        password.value = ""
    }

    private lateinit var userMutableLiveData: MutableLiveData<LoginModel>

    val user: MutableLiveData<LoginModel>
        get() {
            userMutableLiveData = MutableLiveData()

            return userMutableLiveData
        }

    fun onClick(view: View?) {
        val loginUser = LoginModel(emailAddress.value!!, password.value!!)
        userMutableLiveData.value = loginUser
    }
}