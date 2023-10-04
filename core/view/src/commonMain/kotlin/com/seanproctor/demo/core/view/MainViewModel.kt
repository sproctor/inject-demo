package com.seanproctor.demo.core.view

import com.seanproctor.demo.core.domain.NetworkMonitorUseCase
import me.tatarka.inject.annotations.Inject

@ViewScope
@Inject
class MainViewModel(monitorNetworkUseCase: NetworkMonitorUseCase) {
    val networkStatus = monitorNetworkUseCase()
}
