package dev.valvassori.jvm.api

import dev.valvassori.api.FakeApi
import dev.valvassori.model.MobileUser
import dev.valvassori.model.User
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

class JVMFakeApi : FakeApi {
    override suspend fun getUser(): User? {
        return Json.decodeFromString<MobileUser>(
            """{"id": 1, "name": "Gustavo"}"""
        )
    }
}
