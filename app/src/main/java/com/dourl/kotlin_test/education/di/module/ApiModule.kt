package com.dourl.kotlin_test.education.di.module

import com.dourl.kotlin_test.education.di.qualifier.AppUrl
import com.dourl.kotlin_test.education.network.api.ApiService
import com.dourl.kotlin_test.education.network.helper.OkHttpHelper
import com.dourl.kotlin_test.education.network.helper.RetrofitHelper
import com.dourl.kotlin_test.education.network.support.ApiConstants
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/12
 * desc:Api网络模型
 */
@Module
class ApiModule {
    fun createRetrofit(builder: Retrofit.Builder, client: OkHttpClient, baseUrl: String): Retrofit {
        return builder
                .baseUrl(baseUrl)
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient = OkHttpHelper.getOkHttpClient()

    @Provides
    @Singleton
    fun provideRetrofitBuilder(): Retrofit.Builder {
        return Retrofit.Builder()
    }

    @Provides
    @Singleton
    fun provideRetrofitHelper(apiService: ApiService): RetrofitHelper {
        return RetrofitHelper(apiService)
    }

    @Singleton
    @Provides
    @AppUrl
    fun provideAppRetrofit(builder: Retrofit.Builder, client: OkHttpClient): Retrofit {
        return createRetrofit(builder, client, ApiConstants.APP_BASE_URL)
    }

    @Singleton
    @Provides
    fun provideApiService(@AppUrl retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }
}
