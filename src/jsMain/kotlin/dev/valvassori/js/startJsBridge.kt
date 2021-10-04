package dev.valvassori.js

import dev.valvassori.api.FakeApi
import dev.valvassori.di.startProjectKoin
import dev.valvassori.js.api.JSFakeApi
import org.koin.dsl.module

@JsExport
fun startJsBridge() {
    startProjectKoin {
        modules(
            module { factory<FakeApi> { JSFakeApi() } }
        )
    }
}
