package com.basemnasr.unittestingexample3roomdb.mockitoExample

import com.basemnasr.unittestingexample3roomdb.utils.ComputationActivity
import com.basemnasr.unittestingexample3roomdb.utils.Operations
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ComputationTest {
    @Mock
    lateinit var operators: Operations
    lateinit var computationActivity: ComputationActivity

    @Before
    fun setUp() {
        computationActivity = ComputationActivity(operators)
    }

    @Test
    fun givenValidInput_getAddition_shouldCallAddOperator() {
        val x = 5
        val y = 10
        computationActivity.getAddition(x, y)
        verify(operators).add(x, y)
    }


    @Test
    fun givenValidInput_shouldCallNotReturnedFunc() {
        val x = 5
        computationActivity.notReturnedFunc(x)
        verify(operators).notReturnedFun(x)
    }
}