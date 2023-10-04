package com.seanproctor.demo.core.data

import me.tatarka.inject.annotations.Provides

@DataScope
abstract class DataModule {
    @DataScope
    @Provides
    fun provideNetworkManager(impl: NetworkManagerImpl): NetworkManager = impl
}
