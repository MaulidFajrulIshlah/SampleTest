package com.geminiboy.sampletest

import org.junit.Assert.*
import org.junit.Test

class RegisterTest{


    @Test
    fun validUserNameAndPassword(){
        val result = Register.validDataRegister(
            "Maul",
        "1234567",
            "1234567"
        )
        assertEquals("oke", result, false)
    }

    @Test
    fun userNameEmpty(){
        val user = "Ulid"
        val result = Register.validDataRegister(user, "1234567", "1234567")
        assertEquals("oke",result, false)
    }
}