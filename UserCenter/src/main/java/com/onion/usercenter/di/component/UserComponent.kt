package com.onion.usercenter.di.component

import com.onion.base.di.component.ActivityComponent
import com.onion.usercenter.di.module.UserModule
import com.onion.usercenter.di.scope.UserScope
import com.onion.usercenter.engine.RegisterActivity
import dagger.Component

/**
 * Created by OnionMac on 2018/4/13.
 */
@UserScope
@Component(dependencies = arrayOf(ActivityComponent::class),modules = [(UserModule::class)])
interface UserComponent{

    fun inject(register: RegisterActivity)

}