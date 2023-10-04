package com.seanproctor.demo.core.data

import kotlinx.coroutines.flow.Flow

interface NetworkManager {

    fun start()

    fun stop()

    fun status(): Flow<String>
}
