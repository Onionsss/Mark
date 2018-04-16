package com.onion.base.di.module

import com.onion.base.AppCenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by OnionMac on 2018/4/13.
 */
@Module
class AppModule(val appCenter: AppCenter) {

    @Singleton
    @Provides
    fun provideAppCenter(): AppCenter{
        return appCenter
    }

}