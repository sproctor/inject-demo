package com.seanproctor.demo.core.data

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import me.tatarka.inject.annotations.Component
import me.tatarka.inject.annotations.Provides

@SingletonScope
@Component
abstract class BaseComponent(
    @get:Provides val ioDispatcher: CoroutineDispatcher,
) {

    @SingletonScope
    @Provides
    fun coroutineScope(): CoroutineScope = CoroutineScope(SupervisorJob() + ioDispatcher)
}