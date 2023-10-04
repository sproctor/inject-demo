package com.seanproctor.demo.core.view

import me.tatarka.inject.annotations.Inject

@ViewScope
@Inject
class MainViewModelFactory(val create: () -> MainViewModel)
