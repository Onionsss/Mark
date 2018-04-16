package com.onion.usercenter.presenter

import com.onion.base.ext.excute
import com.onion.base.presenter.BasePresenter
import com.onion.base.rx.Result
import com.onion.usercenter.presenter.view.RegisterView
import com.onion.usercenter.service.UserService
import javax.inject.Inject

/**
 * Created by OnionMac on 2018/4/13.
 */
class RegisterPresenter @Inject constructor(): BasePresenter<RegisterView>() {

    @Inject
    lateinit var u: UserService

    fun register(phone: String,vertifyCode: String,pwd: String){

         u.register(phone,vertifyCode,pwd)
                .excute(object : Result<Boolean>(mView) {
                    override fun onNext(t: Boolean) {
                        mView.onRegisterResult(t)
                    }
                },mLifecycleProvider)

    }
}