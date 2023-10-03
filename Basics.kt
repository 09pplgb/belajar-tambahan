package com.example.kotlinbasics

fun main(){
    // variabel yang tidak dapat diubah
    // TODO: Add new functionality

    /*
    this
    is a multiline
    comment
     */

    // type data string
    val myName = "Cebok"
    // type int 32 bit
    var myAge = 12


    // Integer TYPES: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 39_812_309_487_120_300

    // Floating point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.14159265358979323846

    // Booleans he type boolean is used to represent logical values.
    // It can have two possible values true and false
    var isSunny: Boolean = true
    isSunny = false

    //Character
    val letterChar = 'A'
    val digitChar = '1'

    //Strings
    val myStr = "Hello World"
    val FirstCharInStr = myStr[0]

    print("halo " + myName)
}