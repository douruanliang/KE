package com.dourl.kotlin_test.education.ui.adapter.app.section

import com.dourl.kotlin_test.R
import com.dourl.kotlin_test.education.mvp.model.app.VerticalBean
import com.dourl.kotlin_test.education.widget.BannerViewHolder
import com.dourl.kotlin_test.education.widget.section.StatelessSection
import com.dourl.kotlin_test.education.widget.section.ViewHolder
import com.zhouwei.mzbanner.MZBannerView

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/29
 * desc: 标签轮播section
 *
 */
class SectionTypeBanner(private val list: List<VerticalBean.Data.Banner>?) : StatelessSection<Nothing>(
    R.layout.layout_banner, R.layout.layout_empty) {
    override fun onBindHeaderViewHolder(holder: ViewHolder) {
        val urls = list?.map { it.img }
        val mMZBanner = holder.itemView.findViewById(R.id.banner) as MZBannerView<String>
        // 设置数据
        mMZBanner.setPages(urls) {
            BannerViewHolder()
        }
        mMZBanner.start()
    }
}