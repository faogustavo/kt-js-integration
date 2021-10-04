package dev.valvassori.js.api

import dev.valvassori.api.FakeApi
import dev.valvassori.model.User

class JSFakeApi : FakeApi {
    override suspend fun getUser(): User? {
        return JSON.parse("""
            {"id": 1, "name": "Gustavo", "type": "Root"}
        """.trimMargin())
    }
}
