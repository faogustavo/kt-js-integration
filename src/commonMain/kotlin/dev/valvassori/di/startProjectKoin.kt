package dev.valvassori.di

import dev.valvassori.repository.FakeRepository
import dev.valvassori.repository.FakeRepositoryImpl
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

fun startProjectKoin(
    block: KoinAppDeclaration = {}
) {
    startKoin {
        // Shared Stuff
        modules(
            module {
                factory<FakeRepository> { FakeRepositoryImpl(get()) }
            }
        )

        // Platform specific stuff
        block()
    }
}
