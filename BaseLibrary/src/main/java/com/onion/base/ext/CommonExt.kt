package com.onion.base.ext

import com.onion.base.data.bean.BaseReq
import com.onion.base.rx.BaseFun
import com.onion.base.rx.BaseFunBoolean
import com.trello.rxlifecycle2.LifecycleProvider
import com.trello.rxlifecycle2.kotlin.bindToLifecycle
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import io.reactivex.subscribers.ResourceSubscriber

/**
 * Created by OnionMac on 2018/4/13.
 */
fun <T> Flowable<T>.excute(sub: ResourceSubscriber<T>,lifecycleProvider: LifecycleProvider<*>): Disposable{
    return this.subscribeOn(Schedulers.io())
            .bindToLifecycle(lifecycleProvider)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(sub)
}

//扩展boolean类型
fun <T> Flowable<BaseReq<T>>.toBoolean(): Flowable<Boolean> {
    return this.flatMap(BaseFunBoolean())
}

//扩展任意类型
fun <T> Flowable<BaseReq<T>>.toAll(): Flowable<T> {
    return this.flatMap(BaseFun())
}