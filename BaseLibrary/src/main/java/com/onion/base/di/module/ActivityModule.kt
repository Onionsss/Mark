package com.onion.base.di.module

import android.app.Activity
import dagger.Module
import dagger.Provides

/**
 * Created by OnionMac on 2018/4/13.
 */
@Module
class ActivityModule(val activity:Activity) {

    @Provides
    fun provideActivity(): Activity{
        return activity
    }

}