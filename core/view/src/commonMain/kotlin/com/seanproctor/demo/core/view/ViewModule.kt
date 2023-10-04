package com.seanproctor.demo.core.view

import com.seanproctor.demo.core.domain.NetworkMonitorUseCase
import kotlinx.coroutines.CoroutineScope
import me.tatarka.inject.annotations.Inject
import me.tatarka.inject.annotations.Provides

@ViewScope
abstract class ViewModule {
    abstract val mainViewModelFactory: MainViewModelFactory
}

@ViewScope
@Inject
class MainViewModel(private val monitorNetworkUseCase: NetworkMonitorUseCase) {
    val networkStatus = monitorNetworkUseCase()
}

@Inject
class MainViewModelFactory(val create: () -> MainViewModel)