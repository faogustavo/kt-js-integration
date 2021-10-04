package dev.valvassori.jvm

import dev.valvassori.api.FakeApi
import dev.valvassori.di.startProjectKoin
import dev.valvassori.jvm.api.JVMFakeApi
import dev.valvassori.repository.FakeRepository
import dev.valvassori.repository.FakeRepositoryImpl
import kotlinx.coroutines.runBlocking
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.dsl.module

fun main() {
    println("Starting: ${System.currentTimeMillis()}")
    startProjectKoin {
        modules(
            module {
                factory<FakeApi> { JVMFakeApi() }
            }
        )
    }

    Application().main()
}

class Application : KoinComponent {
    private val repository: FakeRepository by inject()

    fun main() = runBlocking {
        println(repository.getUser())
        println("Finishing: ${System.currentTimeMillis()}")
    }
}
