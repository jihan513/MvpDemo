package com.example.admin.mvpdemo.base;

/**
 * @Description MVP的P层
 * @param <T>
 */

public interface IPresenter<T extends IView> {

    void detachView();
}
