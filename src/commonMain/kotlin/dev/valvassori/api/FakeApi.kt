package dev.valvassori.api

import dev.valvassori.model.User

interface FakeApi {
    suspend fun getUser(): User?
}
