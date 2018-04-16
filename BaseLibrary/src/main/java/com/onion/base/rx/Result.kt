package com.onion.base.rx

import com.onion.base.presenter.view.BaseView
import com.orhanobut.logger.Logger
import io.reactivex.subscribers.ResourceSubscriber

/**
 * Created by OnionMac on 2018/4/13.
 */
open class Result<T>(val view: BaseView) : ResourceSubscriber<T>() {
    override fun onComplete() {
    }

    override fun onNext(t: T) {
    }

    override fun onError(t: Throwable?) {
        Logger.i(t.toString())
        if(t is BaseException){
            view.error(t.msg)
        }

    }

}