package com.example.admin.mvpdemo.net;

import com.example.admin.mvpdemo.bean.BaseEntity;
import com.example.admin.mvpdemo.bean.HotMovie;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.GET;

/**
 * @Description 网络接口类
 */

public interface APIFunction {

    /**
     * 获取豆瓣热映电影
     * @return
     */
    @GET("/v2/movie/in_theaters")
    Flowable<BaseEntity<List<HotMovie>>> getHotMovies();
}
