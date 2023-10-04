package com.seanproctor.demo.core.common

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import me.tatarka.inject.annotations.Component
import me.tatarka.inject.annotations.Provides

@CommonScope
@Component
abstract class CommonModule(
    @get:Provides val ioDispatcher: CoroutineDispatcher,
) {

    @CommonScope
    @Provides
    fun coroutineScope(): CoroutineScope = CoroutineScope(SupervisorJob() + ioDispatcher)
}