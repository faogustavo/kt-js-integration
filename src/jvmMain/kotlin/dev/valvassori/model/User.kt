package dev.valvassori.model

import kotlinx.serialization.Serializable

actual interface User {
    actual val id: Int
    actual val name: String
}

@Serializable
data class MobileUser(
    override val id: Int,
    override val name: String,
): User
