package com.seanproctor.demo.core.data

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import me.tatarka.inject.annotations.Inject
import me.tatarka.inject.annotations.Provides

@DataScope
abstract class DataModule {
    @DataScope
    @Provides
    fun provideNetworkManager(impl: NetworkManagerImpl): NetworkManager = impl
}

interface NetworkManager {
    fun status(): Flow<String>
}

@DataScope
@Inject
class NetworkManagerImpl(externalScope: CoroutineScope) : NetworkManager {
    override fun status(): Flow<String> =
        flow {
            emit("unimplemented")
        }
}