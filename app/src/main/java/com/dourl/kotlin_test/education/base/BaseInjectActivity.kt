package com.dourl.kotlin_test.education.base

import com.dourl.kotlin_test.education.App
import com.dourl.kotlin_test.education.di.component.ActivityComponent
import com.dourl.kotlin_test.education.di.component.DaggerActivityComponent
import com.dourl.kotlin_test.education.di.module.ActivityModule
import javax.inject.Inject

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/8
 * desc: 基础注入Activity
 *
 */
abstract class BaseInjectActivity<T : BaseContract.BasePresenter<*>> : BaseActivity(), BaseContract.BaseView {

    @Inject
    lateinit var mPresenter: T

    protected val activityModule: ActivityModule get() = ActivityModule(this)
    protected val activityComponent: ActivityComponent
        get() = DaggerActivityComponent.builder()
            .apiComponent(App.instance.mApiComponent)
            .activityModule(activityModule)
            .build()


    override fun onDestroy() {
        mPresenter.detachView()
        App.instance.removeActivity(this)
        super.onDestroy()
    }

    override fun showError(msg: String) {
    }

    override fun complete() {
    }
}