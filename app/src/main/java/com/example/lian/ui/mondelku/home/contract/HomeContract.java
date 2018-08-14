package com.example.lian.ui.mondelku.home.contract;


import com.example.lian.base.BasePresenter;
import com.example.lian.base.BaseView;
import com.example.lian.model.entity.TouBeen;

/**
 * never gonna give you up, never gonna let you down,
 * never gonna run around and desert you. Never gonna make you cry,
 * never gonna say goodbye. Never gonna tell a lie and hurt you.
 * 永远不要放弃，永远不要对自己失望，永远不要逃走，辜负了自己，
 * 永远不要哭啼，永远不要说再见，永远不要说谎来伤害自己。
 */
public interface HomeContract {

interface  View extends BaseView{
    void  showNewsList(TouBeen tbeen);
    void showMsg(String msg);
    void toDetailView();

}
interface  Presenter extends BasePresenter<View>{
    void getNewsList();
    void login(String phone,String psw);
}

}