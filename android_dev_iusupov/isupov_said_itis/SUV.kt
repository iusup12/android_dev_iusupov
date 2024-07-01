package com.example.isupov_said_itis

class SUV(make: String, model: String, year: Int, val driveType: String, val enginePower: Int) :
    Car(make, model, year) {

    override fun getInfo(): String {
        return super.getInfo() + ", Drive Type: $driveType, Engine Power: $enginePower"
    }
}