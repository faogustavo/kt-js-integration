package dev.valvassori.js.repository

import dev.valvassori.model.User
import dev.valvassori.repository.FakeRepository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.promise
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import kotlin.js.Promise

@JsExport
class FakeService : KoinComponent {
    private val fakeRepository: FakeRepository by inject()
    fun getUser(): Promise<User?> = GlobalScope
        .promise { fakeRepository.getUser() }
}
