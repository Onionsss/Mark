package com.onion.base.di.component

import android.app.Activity
import com.onion.base.AppCenter
import com.onion.base.di.module.ActivityModule
import com.onion.base.di.module.LifecycleProviderModule
import com.onion.base.di.scope.ActivityScope
import com.trello.rxlifecycle2.LifecycleProvider
import dagger.Component

/**
 * Created by OnionMac on 2018/4/13.
 */
@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class) ,modules = arrayOf(ActivityModule::class,LifecycleProviderModule::class))
interface ActivityComponent {

    fun getAppCenter(): AppCenter

    fun getActivity(): Activity

    fun getLifecycleProvider(): LifecycleProvider<*>

}