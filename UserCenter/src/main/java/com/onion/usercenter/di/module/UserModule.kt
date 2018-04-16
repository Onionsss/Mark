package com.onion.usercenter.di.module

import com.onion.usercenter.service.UserService
import com.onion.usercenter.service.impl.UserServiceImpl
import dagger.Module
import dagger.Provides

/**
 * Created by OnionMac on 2018/4/13.
 */
@Module
class UserModule{

    @Provides
    fun provideUserService(userService: UserServiceImpl): UserService {
        return userService
    }

}