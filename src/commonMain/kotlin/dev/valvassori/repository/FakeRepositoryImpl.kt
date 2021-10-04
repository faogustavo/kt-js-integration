package dev.valvassori.repository

import dev.valvassori.api.FakeApi
import dev.valvassori.model.User
import kotlinx.coroutines.delay
import kotlin.js.JsExport

class FakeRepositoryImpl(
    private val api: FakeApi,
) : FakeRepository {
    override suspend fun getUser(): User? {
        println("FakeRepositoryImpl.getUser()")
        delay(1500)

        return api.getUser()
    }
}
