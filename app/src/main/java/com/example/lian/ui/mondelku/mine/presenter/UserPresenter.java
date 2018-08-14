package com.example.lian.ui.mondelku.mine.presenter;

import com.example.lian.model.bizyewu.MineService;
import com.example.lian.model.http.RetrofitUtils;
import com.example.lian.ui.mondelku.mine.UserContract;

/**
 * never gonna give you up, never gonna let you down,
 * never gonna run around and desert you. Never gonna make you cry,
 * never gonna say goodbye. Never gonna tell a lie and hurt you.
 * 永远不要放弃，永远不要对自己失望，永远不要逃走，辜负了自己，
 * 永远不要哭啼，永远不要说再见，永远不要说谎来伤害自己。
 */
public class UserPresenter implements UserContract.Presenter {

    private final MineService mineService;

    public UserPresenter(){
        mineService = RetrofitUtils.getMineService();
    }
    @Override
    public void userInfo() {

    }

    @Override
    public void attach(UserContract.View view) {
      //  this.view = view;
    }

    @Override
    public void decath() {

    }
}
