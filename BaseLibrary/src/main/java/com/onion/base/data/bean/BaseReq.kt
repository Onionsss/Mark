package com.onion.base.data.bean

/**
 * Created by OnionMac on 2018/4/13.
 */
data class BaseReq<out T>(val status: Int, val message: String, val data: T) {
}