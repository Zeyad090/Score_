package com.example.score_

import androidx.lifecycle.ViewModel

class ScoreViewModel:ViewModel () {

    private var _reslut = 0
    val reslutre: Int
        get() = _reslut

fun AddOne(){
    _reslut += 1
}
fun AddFour(){
    _reslut +=4
}
fun LessTow(){
    _reslut =-2
}
}