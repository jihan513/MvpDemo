package com.example.admin.mvpdemo.net;

import com.example.admin.mvpdemo.base.HttpConfig;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @Description Retrofit工厂
 */

public class RetrofitFactory {


    private static RetrofitFactory mRetrofitFactory;
    private static APIFunction mAPIFunction;

    private RetrofitFactory() {
        initAPI();
    }

    public static RetrofitFactory getInstence() {
        if (mRetrofitFactory == null) {
            synchronized (RetrofitFactory.class) {
                if (mRetrofitFactory == null)
                    mRetrofitFactory = new RetrofitFactory();
            }

        }
        return mRetrofitFactory;
    }

    private void initAPI(){
        OkHttpClient mOkHttpClient = new OkHttpClient.Builder()
                .connectTimeout(HttpConfig.HTTP_CONN_TIME, TimeUnit.SECONDS)//设置连接超时时间
                .readTimeout(HttpConfig.HTTP_READ_TIME, TimeUnit.SECONDS)//设置读取超时时间
                .writeTimeout(HttpConfig.HTTP_WRITE_TIME, TimeUnit.SECONDS)//设置写入超时时间
                .addInterceptor(new HttpLoggingInterceptor())//添加日志拦截器
                .build();
        Retrofit mRetrofit = new Retrofit.Builder()
                .baseUrl(HttpConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())//添加gson转换器
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//添加rxjava转换器
                .client(mOkHttpClient)
                .build();
        mAPIFunction = mRetrofit.create(APIFunction.class);
    }

    public APIFunction API() {
        return mAPIFunction;
    }

}
