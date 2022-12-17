package com.example.login

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class LoginModel(name: String, password: String) : BaseObservable() {
    private var name = ""
    private var password = ""

    init {
        this.name = name
        this.password = password
    }

    @Bindable
    fun getPassword(): String {
        return password
    }

    @Bindable
    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        if (!name.equals(this.name, true)) {
            this.name = name
            notifyPropertyChanged(BR.name)
        }
    }

    fun setPassword(password: String) {
        if (!password.equals(this.password, true)) {
            this.password = password
            notifyPropertyChanged(BR.password)
        }
    }

}
