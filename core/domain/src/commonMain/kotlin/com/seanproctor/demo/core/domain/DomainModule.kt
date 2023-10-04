package com.seanproctor.demo.core.domain

import com.seanproctor.demo.core.common.CommonModule
import com.seanproctor.demo.core.data.DataModule
import com.seanproctor.demo.core.data.NetworkManager
import kotlinx.coroutines.flow.Flow
import me.tatarka.inject.annotations.Component
import me.tatarka.inject.annotations.Inject

@DomainScope
@Component
abstract class DomainModule(@Component val commonModule: CommonModule, @Component val dataModule: DataModule)

@DomainScope
@Inject
class NetworkMonitorUseCase(private val networkManager: NetworkManager) {
    operator fun invoke(): Flow<String> {
        return networkManager.status()
    }
}
