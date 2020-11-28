package com.dourl.kotlin_test.education.ui.fragment.course


import com.dourl.kotlin_test.R
import com.dourl.kotlin_test.education.base.BaseFragment
import com.dourl.kotlin_test.education.ui.adapter.course.CourseAdapter
import kotlinx.android.synthetic.main.fragment_course.*

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/9
 * desc: 我的课程
 *
 */
class CourseFragment : BaseFragment() {

    override fun getLayoutId(): Int = R.layout.fragment_course

    companion object {
        fun newInstance(): CourseFragment {
            return CourseFragment()
        }
    }

    override fun initWidget() {
        val adapter = CourseAdapter(childFragmentManager)
        view_pager.offscreenPageLimit = 3
        view_pager.adapter = adapter
        course_tabs.setViewPager(view_pager)
        view_pager.currentItem = 0
    }
}