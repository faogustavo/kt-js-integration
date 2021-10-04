package dev.valvassori.repository

import dev.valvassori.model.User

interface FakeRepository {
    suspend fun getUser(): User?
}
