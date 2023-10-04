package com.seanproctor.demo.core.view

import com.seanproctor.demo.core.common.CommonModule
import com.seanproctor.demo.core.data.JvmDataModule
import com.seanproctor.demo.core.domain.DomainModule
import me.tatarka.inject.annotations.Component

@Component
abstract class JvmViewModule(
    @Component val commonModule: CommonModule,
    @Component val dataModule: JvmDataModule,
    @Component val domainModule: DomainModule
) : ViewModule()