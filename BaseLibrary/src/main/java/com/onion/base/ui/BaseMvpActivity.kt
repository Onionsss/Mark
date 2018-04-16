package com.onion.base.ui

import android.os.Bundle
import com.onion.base.AppCenter
import com.onion.base.di.component.ActivityComponent
import com.onion.base.di.component.DaggerActivityComponent
import com.onion.base.di.module.ActivityModule
import com.onion.base.di.module.LifecycleProviderModule
import com.onion.base.presenter.BasePresenter
import com.onion.base.presenter.view.BaseView
import org.jetbrains.anko.toast
import javax.inject.Inject

/**
 * Created by OnionMac on 2018/4/13.
 */
abstract class BaseMvpActivity<P:BasePresenter<*>> : BaseActivity(),BaseView{

    @Inject
    lateinit var mPresenter: P

    protected lateinit var mActivityComponent: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initInjection()
        inintComponent()
    }

    open abstract fun inintComponent()

    private fun initInjection() {
       mActivityComponent = DaggerActivityComponent
                .builder()
                .appComponent(AppCenter.appComponent)
                .activityModule(ActivityModule(this))
               .lifecycleProviderModule(LifecycleProviderModule(this))
                .build()
    }

    override fun showLoading() {
    }

    override fun hiddenLoading() {
    }

    override fun error(msg: String) {

        toast(msg)
    }



}