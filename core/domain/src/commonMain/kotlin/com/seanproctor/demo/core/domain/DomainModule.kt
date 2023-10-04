package com.seanproctor.demo.core.domain

import com.seanproctor.demo.core.common.CommonModule
import com.seanproctor.demo.core.data.DataModule
import me.tatarka.inject.annotations.Component

@DomainScope
@Component
abstract class DomainModule(@Component val commonModule: CommonModule, @Component val dataModule: DataModule)
