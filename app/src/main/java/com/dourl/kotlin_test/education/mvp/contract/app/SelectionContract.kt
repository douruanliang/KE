package com.dourl.kotlin_test.education.mvp.contract.app

import com.dourl.kotlin_test.education.base.BaseContract
import com.dourl.kotlin_test.education.mvp.model.app.SelectionBean


/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/19
 * desc: 精选界面-SelectionContract
 *
 */
interface SelectionContract {

    interface View : BaseContract.BaseView {
        fun showSelection(selectionBean: SelectionBean)
    }

    interface Presenter<in T> : BaseContract.BasePresenter<T> {
        fun getSelection()
    }
}