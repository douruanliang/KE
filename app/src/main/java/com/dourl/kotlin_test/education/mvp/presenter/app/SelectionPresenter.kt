package com.dourl.kotlin_test.education.mvp.presenter.app


import com.dourl.kotlin_test.education.base.BaseSubscriber
import com.dourl.kotlin_test.education.base.RxPresenter
import com.dourl.kotlin_test.education.mvp.contract.app.SelectionContract
import com.dourl.kotlin_test.education.mvp.model.app.SelectionBean
import com.dourl.kotlin_test.education.network.helper.RetrofitHelper
import com.dourl.kotlin_text.education.utils.rxSchedulerHelper
import javax.inject.Inject

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/19
 * desc: 精选界面-SelectionPresenter
 *
 */
class SelectionPresenter @Inject constructor(private val mRetrofitHelper: RetrofitHelper) :
        RxPresenter<SelectionContract.View>(), SelectionContract.Presenter<SelectionContract.View> {

    override fun getSelection() {
        val subscriber = mRetrofitHelper.getSelection()
                .compose(rxSchedulerHelper())
                .subscribeWith(object : BaseSubscriber<SelectionBean>(mView) {
                    override fun onSuccess(mData: SelectionBean) {
                        mView?.showSelection(mData)
                    }
                })
        addSubscribe(subscriber)
    }
}