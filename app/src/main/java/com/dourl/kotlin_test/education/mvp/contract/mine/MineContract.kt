package com.dourl.kotlin_test.education.mvp.contract.mine

import com.dourl.kotlin_test.education.base.BaseContract
import com.dourl.kotlin_test.education.mvp.model.mine.MineBean


/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/12
 * desc: 我的-MineConTract
 *
 */
interface MineContract {
    interface View : BaseContract.BaseView {
        fun showMine(mineBean: MineBean)
    }

    interface Presenter<in T> : BaseContract.BasePresenter<T> {
        fun getMine()
    }
}