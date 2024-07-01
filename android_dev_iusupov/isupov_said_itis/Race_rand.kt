package com.example.isupov_said_itis
import kotlin.random.Random

object Race_rand {
    fun race(car1: Car, car2: Car): Car {
        val random = Random.nextInt(2)
        return if (random == 0) car1 else car2
    }
}