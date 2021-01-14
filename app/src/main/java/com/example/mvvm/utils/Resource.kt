package com.example.mvvm.utils


/*this class will be responsible to communicate the current state of Network Call to the UI Layer*/
class data class Resource<out T>(val status: Status, val data: T?, val message: String?) {

    companion object{
        fun <T> success(data: T?): Resource<T> {
            return Resource(Status.SUCCESS, data, null)
        }

        fun <T> error(msg: String, data: T?): Resource<T> {
            return Resource(Status.ERROR, data, msg)
        }

        fun <T> loading(data: T?): Resource<T> {
            return Resource(Status.LOADING, data, null)
        }

    }
}