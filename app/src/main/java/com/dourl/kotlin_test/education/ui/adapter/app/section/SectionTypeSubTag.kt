package com.dourl.kotlin_test.education.ui.adapter.app.section

import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.dourl.kotlin_test.R
import com.dourl.kotlin_test.education.mvp.model.app.VerticalBean
import com.dourl.kotlin_test.education.ui.adapter.app.SectionTypeSubTagAdapter
import com.dourl.kotlin_test.education.widget.section.StatelessSection
import com.dourl.kotlin_test.education.widget.section.ViewHolder


/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/29
 * desc: 标签顶部Tab-section
 *
 */
class SectionTypeSubTag(private val list: List<VerticalBean.Data.SubTag>?) : StatelessSection<Nothing>(
    R.layout.layout_item_section_type_subtag, R.layout.layout_empty) {

    override fun onBindHeaderViewHolder(holder: ViewHolder) {
        holder.let {
            val recyclerView = it.getView<RecyclerView>(R.id.recycler)
            recyclerView.setHasFixedSize(true)
            val mLayoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
            recyclerView.layoutManager = mLayoutManager
            recyclerView.adapter = SectionTypeSubTagAdapter(list)
        }
    }
}