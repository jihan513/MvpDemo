package com.example.admin.mvpdemo.net;

import com.example.admin.mvpdemo.bean.BaseEntity;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/**
 * @Description 接口 自定义的处理方法
 * @param <T>
 */

public abstract class BaseSubscriber<T> implements Subscriber<BaseEntity<T>> {

    public BaseSubscriber() {
    }

    @Override
    public void onSubscribe(Subscription s) {
        onRequestStart();
        //Flowable支持背压，记得设置背压数
        s.request(Long.MAX_VALUE);
    }

    @Override
    public void onNext(BaseEntity<T> tBaseEntity) {
        try {
            onSuccees(tBaseEntity);
        } catch (Exception e) {

        }
    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onComplete() {
    }

    /**
     * 返回成功
     *
     * @param t
     * @throws Exception
     */
    protected abstract void onSuccees(BaseEntity<T> t) throws Exception;

    /**
     * 返回成功了,但是code错误
     *
     * @param t
     * @throws Exception
     */
    protected abstract void onCodeError(BaseEntity<T> t) throws Exception;

    /**
     * 返回成功了,而且有提示语
     *
     * @param t
     * @throws Exception
     */
    protected abstract void onTips(BaseEntity<T> t) throws Exception;

    /**
     * 返回成功，但是功能未启用
     */
    protected void onNoEnable() {
    }

    /**
     * 返回失败
     *
     * @param e
     * @param isNetWorkError 是否是网络错误
     * @throws Exception
     */
    protected void onFailure(Throwable e, boolean isNetWorkError) throws Exception {

    }

    protected void onRequestStart() {
    }

    //翻译错误状态
    private String getError(String str) {
        String r = "请求失败";
        if (str.contains("java.net.ConnectException")) {
            r += ":连接不到网络";
        } else if (str.contains("java.net.SocketTimeoutException")) {
            r += ":连接服务器超时,请重新刷新";
        } else {
            r += ":" + str;
        }
        return r;
    }
}
