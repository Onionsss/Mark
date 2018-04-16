package com.onion.usercenter.service.impl

import com.onion.base.ext.toBoolean
import com.onion.usercenter.repository.UserRepository
import com.onion.usercenter.service.UserService
import io.reactivex.Flowable
import javax.inject.Inject

/**
 * Created by OnionMac on 2018/4/13.
 */
class UserServiceImpl @Inject constructor(): UserService {

    @Inject
    lateinit var userR: UserRepository

    override fun register(phone: String, vertifyCode: String, pwd: String):Flowable<Boolean> {
        return userR.register(phone, pwd, vertifyCode).toBoolean()
    }
}