package com.onion.usercenter.service

import io.reactivex.Flowable

/**
 * Created by OnionMac on 2018/4/13.
 */
interface UserService {

    fun register(phone: String,vertifyCode: String,pwd: String): Flowable<Boolean>

}