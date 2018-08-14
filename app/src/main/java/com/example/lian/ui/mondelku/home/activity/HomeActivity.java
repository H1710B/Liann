package com.example.lian.ui.mondelku.home.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import com.example.lian.R;
import com.example.lian.model.entity.TouBeen;
import com.example.lian.ui.mondelku.home.adapter.LvAdapter;
import com.example.lian.ui.mondelku.home.contract.HomeContract;
import com.example.lian.ui.mondelku.home.presenter.HomePresenter;

import java.util.List;

public class HomeActivity extends AppCompatActivity implements HomeContract.View {

    private HomePresenter homePresenter;
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();

        homePresenter = new HomePresenter();
        homePresenter.attach(this);
        homePresenter.getNewsList();
    }
    private void initView() {
        lv = (ListView) findViewById(R.id.lv);
    }
    @Override
    public void showNewsList(TouBeen tbeen) {
        List<TouBeen.BodyBean.ResultBean> result = tbeen.getBody().getResult();
        LvAdapter lvAdapter = new LvAdapter(this,result);
        lv.setAdapter(lvAdapter);

        Toast.makeText(this, result.get(0).getTitle(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMsg(String msg) {

    }

    @Override
    public void toDetailView() {

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        homePresenter.decath();
    }


}
