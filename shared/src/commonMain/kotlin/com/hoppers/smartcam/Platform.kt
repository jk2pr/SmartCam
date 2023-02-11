package com.hoppers.smartcam

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform