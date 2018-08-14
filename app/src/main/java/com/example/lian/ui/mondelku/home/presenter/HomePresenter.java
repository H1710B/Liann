package com.example.lian.ui.mondelku.home.presenter;

import com.example.lian.model.bizyewu.IUserMondel;
import com.example.lian.model.bizyewu.UserMondel;
import com.example.lian.model.callback.NetworkCallback;
import com.example.lian.model.entity.TouBeen;
import com.example.lian.ui.mondelku.home.contract.HomeContract;

public class HomePresenter implements HomeContract.Presenter {
    private HomeContract.View mView;
    private  IUserMondel userMondel;
    public HomePresenter() {
        userMondel = new UserMondel();
    }

    @Override
    public void getNewsList() {
        userMondel.newsList(new NetworkCallback<TouBeen>() {
            @Override
            public void onSuccess(TouBeen touBeen) {
                if (mView != null) {
                    mView.showNewsList(touBeen);
                }
            }

            @Override
            public void onError(String errorMsg) {
            }
        });
    }

    @Override
    public void login(String phone, String psw) {

    }

    @Override
    public void attach(HomeContract.View view) {
        this.mView = view;
    }

    @Override
    public void decath() {
        this.mView = null;
    }
}
