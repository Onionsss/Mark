package com.onion.usercenter.repository

import com.onion.base.data.bean.BaseReq
import com.onion.base.data.net.RetrofitFactory
import com.onion.usercenter.data.UserApi
import com.onion.usercenter.data.bean.RegisterReq
import io.reactivex.Flowable
import javax.inject.Inject

/**
 * Created by OnionMac on 2018/4/13.
 */
class UserRepository @Inject constructor(){

    fun register( phone: String, pwd: String, verifyCode: String): Flowable<BaseReq<String>> {
        return RetrofitFactory.instance.create(UserApi::class.java).register(RegisterReq(phone,pwd,verifyCode))
    }
}