package co.cvik.user.datasource.network

import io.ktor.client.HttpClient

expect class KtorClientFactory() {
    fun build(): HttpClient
}