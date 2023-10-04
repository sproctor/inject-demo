package com.seanproctor.demo

import com.seanproctor.demo.core.common.CommonModule
import com.seanproctor.demo.core.common.create
import com.seanproctor.demo.core.data.DataModule
import com.seanproctor.demo.core.data.JvmDataModule
import com.seanproctor.demo.core.data.create
import com.seanproctor.demo.core.domain.DomainModule
import com.seanproctor.demo.core.domain.create
import com.seanproctor.demo.core.view.ViewModule
import com.seanproctor.demo.core.view.create
import kotlinx.coroutines.Dispatchers

fun main() {
    val commonModule = CommonModule::class.create(Dispatchers.IO)
    val dataModule = JvmDataModule::class.create(commonModule)
    val domainModule = DomainModule::class.create(commonModule, dataModule)
    val viewModule = ViewModule::class.create(commonModule, dataModule, domainModule)
    println("Hello, world!")
}