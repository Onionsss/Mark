package com.onion.base.rx

import com.onion.base.data.bean.BaseReq
import io.reactivex.Flowable
import io.reactivex.functions.Function

/**
 * Created by OnionMac on 2018/4/13.
 */
class BaseFun<T> : Function<BaseReq<T>,Flowable<T>> {

    override fun apply(t: BaseReq<T>): Flowable<T> {
        if(t.status != 0){
            return Flowable.error(BaseException(t.status,t.message))
        }

        return Flowable.just(t.data)
    }
}