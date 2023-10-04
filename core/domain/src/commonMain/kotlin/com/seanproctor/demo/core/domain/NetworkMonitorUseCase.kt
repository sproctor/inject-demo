package com.seanproctor.demo.core.domain

import com.seanproctor.demo.core.data.NetworkManager
import kotlinx.coroutines.flow.Flow
import me.tatarka.inject.annotations.Inject

@DomainScope
@Inject
class NetworkMonitorUseCase(private val networkManager: NetworkManager) {
    operator fun invoke(): Flow<String> {
        return networkManager.status()
    }
}
