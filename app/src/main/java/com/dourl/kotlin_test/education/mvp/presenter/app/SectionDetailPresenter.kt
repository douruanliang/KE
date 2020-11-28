package com.dourl.kotlin_test.education.mvp.presenter.app

import com.dourl.kotlin_test.education.base.RxPresenter
import com.dourl.kotlin_test.education.mvp.contract.app.SectionDetailContract
import com.dourl.kotlin_test.education.network.helper.RetrofitHelper
import javax.inject.Inject

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2019/1/5
 * desc:
 *
 */
class SectionDetailPresenter @Inject constructor(private val mRetrofitHelper: RetrofitHelper) :
        RxPresenter<SectionDetailContract.View>(), SectionDetailContract.Presenter<SectionDetailContract.View>