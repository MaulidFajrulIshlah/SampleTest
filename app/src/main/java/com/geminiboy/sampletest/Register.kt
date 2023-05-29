package com.geminiboy.sampletest

object Register {

    private val userListTest = listOf("Maulid", "Fajrul", "Ishlah")

    fun validDataRegister(
        userName : String,
        password : String,
        confirmPassword : String
    ) : Boolean{
        if (userName.isEmpty() || password.isEmpty()|| confirmPassword.isEmpty()){
            return false
        }
        if (userName in userName){
            return false
        }
        if (password != confirmPassword){
            return false
        }
        if (password.count { it.isDigit() } < 2){
            return false
        }
        return true
    }
}