package com.example.admin.mvpdemo.activity;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.admin.mvpdemo.R;
import com.example.admin.mvpdemo.base.BaseActivity;
import com.example.admin.mvpdemo.bean.HotMovie;
import com.example.admin.mvpdemo.presenters.MainPresenter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<MainPresenter> implements MainPresenter.View {

    private ListView listView;
    private List<String> mDatas;
    private ArrayAdapter<String> adapter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        listView = findViewById(R.id.listView);
    }

    @Override
    protected void initData() {
        mPresenter = new MainPresenter(this);
        mPresenter.getHotMovies();
        mDatas = new ArrayList<>();
    }

    @Override
    protected void initListener() {

    }

    @Override
    public void onGetHotMoviesSuccess(List<HotMovie> list) {
        Toast.makeText(this, "获取成功", Toast.LENGTH_SHORT).show();
        for (int i=0;i<list.size();i++) {
            mDatas.add(list.get(i).getTitle());
        }
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mDatas);
        listView.setAdapter(adapter);
    }

    @Override
    public void ongetHotMovieError() {
        Toast.makeText(this, "获取失败", Toast.LENGTH_SHORT).show();
    }
}
