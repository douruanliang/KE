package com.dourl.kotlin_test.education.ui.activity.mine

import android.annotation.SuppressLint
import com.dourl.kotlin_test.R
import com.dourl.kotlin_test.education.StatusBarUtil
import com.dourl.kotlin_test.education.base.BaseActivity
import com.dourl.kotlin_test.education.utils.AppUtils
import com.dourl.kotlin_test.education.utils.SdCardUtils
import kotlinx.android.synthetic.main.activity_cache_record.*

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2019/1/8
 * desc: 缓存记录
 */
class CacheRecordActivity : BaseActivity() {

    override fun getLayoutId(): Int = R.layout.activity_cache_record

    @SuppressLint("SetTextI18n")
    override fun initWidget() {
        StatusBarUtil.setColorNoTranslucent(this, AppUtils.getColor(R.color.white))
        initToolbar()
        mToolbar?.title = "离线缓存"

        val allSpace = SdCardUtils.getAllSpace()
        val freeSpace = SdCardUtils.getFreeSpace()
        val progress = countProgress(allSpace.replace("GB".toRegex(), "")
                .replace("MB".toRegex(), "")
                .replace("KB".toRegex(), "")
                .toFloat(),
                freeSpace.replace("GB".toRegex(), "")
                        .replace("MB".toRegex(), "")
                        .replace("KB".toRegex(), "")
                        .toFloat())
        progress_bar.progress = progress
        tv_cache_size.text = "主存储:$allSpace/可用:$freeSpace"
    }

    private fun countProgress(allSpace: Float, freeSpace: Float): Int {
        // 取整相减
        val size = (Math.floor(allSpace.toDouble()) - Math.floor(freeSpace.toDouble())).toInt()
        val v = size / Math.floor(allSpace.toDouble()) * 100
        return Math.floor(v).toInt()
    }
}
