package com.onion.base.di.module

import com.trello.rxlifecycle2.LifecycleProvider
import dagger.Module
import dagger.Provides

/**
 * Created by OnionMac on 2018/4/13.
 */
@Module
class LifecycleProviderModule(val lifecycleProvider:  LifecycleProvider<*>) {

    @Provides
    fun provideLifecycleProvider(): LifecycleProvider<*> {
        return lifecycleProvider
    }

}