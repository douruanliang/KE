package com.dourl.kotlin_test.education.mvp.contract.app

import com.dourl.kotlin_test.education.base.BaseContract


/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2019/1/5
 * desc:
 *
 */
interface SectionDetailContract {

    interface View : BaseContract.BaseView

    interface Presenter<in T> : BaseContract.BasePresenter<T>
}