package com.example.isupov_said_itis
open class Car(val make: String, val model: String, val year: Int) {
    open fun getInfo(): String {
        return "Car: $make $model ($year)"
    }
}
