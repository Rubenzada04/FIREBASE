package dev.sebastianleon.firebase.model

data class UserModel (
    val fullName: String = "",
    val country: String = "",
    val email: String = "",
    val uid: String? = ""
)