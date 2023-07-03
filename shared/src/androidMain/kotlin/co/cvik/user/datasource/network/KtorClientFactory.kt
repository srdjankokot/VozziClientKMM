package co.cvik.user.datasource.network

import io.ktor.client.HttpClient
import io.ktor.client.engine.android.*
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import kotlinx.serialization.json.Json

actual class KtorClientFactory {
    actual fun build(): HttpClient {
        return HttpClient(Android) {
            install(ContentNegotiation) {
                Json {
                    ignoreUnknownKeys = true
                }
            }
        }
    }
}