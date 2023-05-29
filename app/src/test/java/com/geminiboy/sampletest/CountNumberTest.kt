package com.geminiboy.sampletest

import org.junit.Assert.*
import org.junit.Test

class CountNumberTest{

    private val testCountNumberTest : CountNumber = CountNumber()


    @Test
    fun testSum(){
        val expected = 42
        assertEquals(expected, testCountNumberTest.sum(40, 2))
}

}