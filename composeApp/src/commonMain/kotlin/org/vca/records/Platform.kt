package org.vca.records

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform