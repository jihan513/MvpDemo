package com.example.admin.mvpdemo.presenters;

import android.util.Log;

import com.example.admin.mvpdemo.activity.MainActivity;
import com.example.admin.mvpdemo.base.BasePresenter;
import com.example.admin.mvpdemo.base.IView;
import com.example.admin.mvpdemo.bean.BaseEntity;
import com.example.admin.mvpdemo.bean.HotMovie;
import com.example.admin.mvpdemo.net.BaseSubscriber;
import com.example.admin.mvpdemo.net.RetrofitFactory;
import com.example.admin.mvpdemo.utils.TextUtil;
import com.example.admin.mvpdemo.utils.TransformerUtil;
import com.trello.rxlifecycle2.android.ActivityEvent;

import java.util.ArrayList;
import java.util.List;

public class MainPresenter extends BasePresenter<MainActivity> {

    public MainPresenter(MainActivity view) {
        super(view);
    }

    public void getHotMovies() {
        RetrofitFactory.getInstence().API().getHotMovies()
                .compose(mView.<BaseEntity<List<HotMovie>>>bindUntilEvent(ActivityEvent.DESTROY))
                .compose(TransformerUtil.<BaseEntity<List<HotMovie>>>setFlowableThread())
                .subscribe(new BaseSubscriber<List<HotMovie>>() {
                    @Override
                    protected void onSuccees(BaseEntity<List<HotMovie>> t) throws Exception {
                        List<HotMovie> list;
                        if(!TextUtil.isValidate(t.getSubjects())) {
                            list = new ArrayList<>();
                        } else {
                            list = t.getSubjects();
                        }
                        mView.onGetHotMoviesSuccess(list);
                    }

                    @Override
                    protected void onCodeError(BaseEntity<List<HotMovie>> t) throws Exception {
                        mView.ongetHotMovieError();
                    }

                    @Override
                    protected void onTips(BaseEntity<List<HotMovie>> t) throws Exception {

                    }
                });
    }

    public interface View extends IView {
        void onGetHotMoviesSuccess(List<HotMovie> list);
        void ongetHotMovieError();
    }
}
