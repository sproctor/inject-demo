package com.seanproctor.demo.core.data

import com.seanproctor.demo.core.common.CommonModule
import me.tatarka.inject.annotations.Component

@Component
abstract class JvmDataModule(@Component val commonModule: CommonModule) : DataModule()