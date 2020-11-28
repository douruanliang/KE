package com.dourl.kotlin_test.education.di.component

import android.app.Activity

import com.dourl.kotlin_test.education.di.module.FragmentModule
import com.dourl.kotlin_test.education.di.scope.FragmentScope
import com.dourl.kotlin_test.education.ui.fragment.app.DiscoveryFragment
import com.dourl.kotlin_test.education.ui.fragment.app.SectionFragment
import com.dourl.kotlin_test.education.ui.fragment.app.SectionTypeFragment
import com.dourl.kotlin_test.education.ui.fragment.course.CourseCategoryFragment
import com.dourl.kotlin_test.education.ui.fragment.mine.MineFragment


import dagger.Component

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/12
 * desc: FragmentComponent
 */
@FragmentScope
@Component(dependencies = [ApiComponent::class], modules = [FragmentModule::class])
interface FragmentComponent {
    val activity: Activity

    fun inject(discoveryFragment: DiscoveryFragment)

    fun inject(selectionFragment: SectionFragment)

    fun inject(selectionTypeFragment: SectionTypeFragment)

    fun inject(mineFragment: MineFragment)

    fun inject(courseCategoryFragment: CourseCategoryFragment)
}
