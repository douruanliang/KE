package com.dourl.kotlin_test.education.ui.adapter.course

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.dourl.kotlin_test.R
import com.dourl.kotlin_test.education.ui.fragment.course.CourseCategoryFragment
import com.dourl.kotlin_test.education.utils.AppUtils


/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/30
 * desc: 我的课程Tag
 *
 */
class CourseAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private var mTitles = AppUtils.getStringArray(R.array.course_title)
    private val mFragment = arrayOfNulls<Fragment>(mTitles.size)

    override fun getItem(position: Int): Fragment {
        if (mFragment[position] == null) {
            when (position) {
                0, 1, 2, 3 -> mFragment[position] = CourseCategoryFragment.newInstance(position + 1)
            }
        }
        return mFragment[position]!!
    }

    override fun getCount(): Int = mTitles.size

    override fun getPageTitle(position: Int): CharSequence = mTitles[position]
}