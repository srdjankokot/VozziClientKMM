package com.srdjankokot.testapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform