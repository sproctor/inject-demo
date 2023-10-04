package com.seanproctor.demo.core.data

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import me.tatarka.inject.annotations.Inject

@DataScope
@Inject
class NetworkManagerImpl(private val externalScope: CoroutineScope) : NetworkManager {

    private var job: Job? = null

    private val _status = MutableStateFlow("uninitialized")

    override fun start() {
        job = externalScope.launch {
            _status.value = "unimplemented"
        }
    }

    override fun stop() {
        job?.cancel()
        job = null
    }

    override fun status(): Flow<String> = _status
}
