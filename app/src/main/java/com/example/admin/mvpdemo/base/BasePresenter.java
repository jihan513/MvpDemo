package com.example.admin.mvpdemo.base;

/**
 * @Description Presenter的基类
 * @param <T>
 */

public abstract class BasePresenter<T extends IView> implements IPresenter<T> {

    protected T mView;

    public T getmView() {
        return mView;
    }

    public BasePresenter(T view) {
        this.mView = view;
    }

    @Override
    public void detachView() {

    }
}
