package com.example.aleckstina.wespeakandroid.model

/**
 * Created by aleckstina on 10/6/17.
 */
class User {
    private val email: String
    private val language: String
    private val user_description: String

    constructor(email: String, language: String, user_description: String) {
        this.email = email
        this.language = language
        this.user_description = user_description
    }

}