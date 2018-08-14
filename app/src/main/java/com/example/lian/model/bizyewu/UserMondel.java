package com.example.lian.model.bizyewu;

import android.net.ConnectivityManager;

import com.example.lian.config.Urls;
import com.example.lian.model.callback.NetworkCallback;
import com.example.lian.model.entity.TouBeen;
import com.example.lian.model.http.HttpFactory;

/**
 * never gonna give you up, never gonna let you down,
 * never gonna run around and desert you. Never gonna make you cry,
 * never gonna say goodbye. Never gonna tell a lie and hurt you.
 * 永远不要放弃，永远不要对自己失望，永远不要逃走，辜负了自己，
 * 永远不要哭啼，永远不要说再见，永远不要说谎来伤害自己。
 */
public class UserMondel implements IUserMondel {
    @Override
    public void newsList(NetworkCallback<TouBeen>callback) {
          HttpFactory.create().doGet(Urls.NEWSLIST,callback);
    }
    @Override
    public void login(String phone, String psw) {

    }
}
