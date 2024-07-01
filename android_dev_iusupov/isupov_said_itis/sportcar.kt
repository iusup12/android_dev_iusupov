package com.example.isupov_said_itis

class sportcar(make: String, model: String, year: Int, val topSpeed: Int) :
    Car(make, model, year) {

    override fun getInfo(): String {
        return super.getInfo() + ", Top Speed: $topSpeed km/h"
    }
}