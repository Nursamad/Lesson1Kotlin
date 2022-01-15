package com.geektech.lesson1kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    //целочисленные переменные
    //var age: Int = 18
    //var size: Short = 32223
    //var id: Long = 24232L
    //не обязательно писать тип данных

    //дробные переменные
    //var f: Float or var f: 24.3F
    //var d: Double = 45.0 or var d: 45.0

    //Строковые переенные
    var name: String = "name"
    var name1: Char = 'c'

    val surname = "Nur" //val не изменяемая переменная

    //условные переменные
    var inLoaded: Boolean = false
    lateinit var test: String //поздняя инициальзация
    var test1 : String? = null //? может быть null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    companion object{}
}