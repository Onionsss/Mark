package com.onion.usercenter.data

import com.onion.base.data.bean.BaseReq
import com.onion.usercenter.data.bean.RegisterReq
import io.reactivex.Flowable
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Created by OnionMac on 2018/4/13.
 */
interface UserApi {

    @POST("userCenter/register")
    fun register(@Body regist: RegisterReq): Flowable<BaseReq<String>>
}