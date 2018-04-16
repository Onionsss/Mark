package com.onion.base

import android.app.Application
import com.onion.base.di.component.AppComponent
import com.onion.base.di.component.DaggerAppComponent
import com.onion.base.di.module.AppModule
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger



/**
 * Created by OnionMac on 2018/4/13.
 */
class AppCenter : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
        Logger.addLogAdapter(AndroidLogAdapter())
    }

    companion object {
        private lateinit var instance: AppCenter
        val appComponent: AppComponent
        get() = DaggerAppComponent.builder()
                .appModule(AppModule(instance))
                .build()

    }

}