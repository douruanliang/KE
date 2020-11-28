package com.dourl.kotlin_test.education.di.component

import com.dourl.kotlin_test.education.di.module.ApiModule
import com.dourl.kotlin_test.education.network.helper.RetrofitHelper
import dagger.Component
import javax.inject.Singleton

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/12
 * desc: ApiComponent
 */
@Singleton
@Component(modules = [ApiModule::class])
interface ApiComponent {
    val retrofitHelper: RetrofitHelper
}
