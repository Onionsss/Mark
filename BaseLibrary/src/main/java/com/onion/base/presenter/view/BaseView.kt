package com.onion.base.presenter.view

/**
 * Created by OnionMac on 2018/4/13.
 */
interface BaseView {

    fun showLoading()
    fun hiddenLoading()
    fun error(msg: String)
}