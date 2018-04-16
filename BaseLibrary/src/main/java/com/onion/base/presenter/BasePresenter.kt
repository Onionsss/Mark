package com.onion.base.presenter

import com.onion.base.presenter.view.BaseView
import com.trello.rxlifecycle2.LifecycleProvider
import javax.inject.Inject

/**
 * Created by OnionMac on 2018/4/13.
 */
open class BasePresenter<V:BaseView> {

    lateinit var mView: V

    @Inject
    lateinit var mLifecycleProvider: LifecycleProvider<*>

}