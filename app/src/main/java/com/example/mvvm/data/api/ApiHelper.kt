package com.example.mvvm.data.api

/*this is a helper class*/

class ApiHelper(private val apiService: ApiService) {

    fun getUsers() = apiService.getUsers()

}