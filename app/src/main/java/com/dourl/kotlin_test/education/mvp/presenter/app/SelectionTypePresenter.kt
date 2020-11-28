package com.dourl.kotlin_test.education.mvp.presenter.app

import com.dourl.kotlin_test.education.base.BaseSubscriber
import com.dourl.kotlin_test.education.base.RxPresenter
import com.dourl.kotlin_test.education.mvp.contract.app.SelectionTypeContract
import com.dourl.kotlin_test.education.mvp.contract.app.SelectionTypeContract.*
import com.dourl.kotlin_test.education.mvp.model.app.VerticalBean
import com.dourl.kotlin_test.education.network.helper.RetrofitHelper
import com.dourl.kotlin_text.education.utils.rxSchedulerHelper
import javax.inject.Inject

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/29
 * desc: 标签界面
 *
 */
class SelectionTypePresenter @Inject constructor(private val mRetrofitHelper: RetrofitHelper) :
        RxPresenter<View>(), Presenter<View> {

    override fun getVertical(tag: Int) {
        val subscriber = mRetrofitHelper.getVertical(tag)
                .compose(rxSchedulerHelper())
                .subscribeWith(object : BaseSubscriber<VerticalBean>(mView) {
                    override fun onSuccess(mData: VerticalBean) {
                        mView?.showVertical(mData)
                    }
                })
        addSubscribe(subscriber)
    }
}