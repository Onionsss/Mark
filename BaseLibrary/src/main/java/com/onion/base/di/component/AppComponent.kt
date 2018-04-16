package com.onion.base.di.component

import com.onion.base.AppCenter
import com.onion.base.di.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by OnionMac on 2018/4/13.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent{

    fun getAppCenter(): AppCenter

}