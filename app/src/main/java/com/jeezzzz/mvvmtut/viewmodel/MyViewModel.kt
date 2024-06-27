package com.jeezzzz.mvvmtut.viewmodel

import androidx.lifecycle.ViewModel
import com.jeezzzz.mvvmtut.model.CalucatorData

class MyViewModel: ViewModel() {
    fun calculateSum(num1: Int, num2: Int): CalucatorData
    {
        val sum=num1+num2
        return CalucatorData(num1, num2, sum)
    }
}