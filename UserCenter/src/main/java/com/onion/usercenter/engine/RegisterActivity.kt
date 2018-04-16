package com.onion.usercenter.engine

import android.os.Bundle
import com.onion.base.ui.BaseMvpActivity
import com.onion.usercenter.R
import com.onion.usercenter.di.component.DaggerUserComponent
import com.onion.usercenter.di.module.UserModule
import com.onion.usercenter.presenter.RegisterPresenter
import com.onion.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.u_activity_register.*
import org.jetbrains.anko.toast

/**
 * Created by OnionMac on 2018/4/13.
 */
class RegisterActivity: BaseMvpActivity<RegisterPresenter>(),RegisterView{

    override fun onRegisterResult(result: Boolean) {
        toast("boolean$result")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.u_activity_register)

        kd.setOnClickListener {
            mPresenter.register(phone.text.toString(),code.text.toString(),pwd.text.toString())
        }
    }

    override fun inintComponent() {
        DaggerUserComponent.builder().activityComponent(mActivityComponent).userModule(UserModule())
                .build().inject(this)
        mPresenter.mView = this
    }

}

