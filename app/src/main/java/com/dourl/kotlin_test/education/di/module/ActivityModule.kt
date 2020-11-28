package com.dourl.kotlin_test.education.di.module

import android.app.Activity

import com.dourl.kotlin_test.education.di.scope.ActivityScope

import dagger.Module
import dagger.Provides

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/12
 * desc: Activity模型Ø
 */
@Module
class ActivityModule(val activity: Activity) {

    @Provides
    @ActivityScope
    fun provideActivity(): Activity {
        return activity
    }
}
