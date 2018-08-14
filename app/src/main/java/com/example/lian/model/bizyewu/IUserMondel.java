package com.example.lian.model.bizyewu;

import android.net.ConnectivityManager;

import com.example.lian.model.callback.NetworkCallback;
import com.example.lian.model.entity.TouBeen;

/**
 * never gonna give you up, never gonna let you down,
 * never gonna run around and desert you. Never gonna make you cry,
 * never gonna say goodbye. Never gonna tell a lie and hurt you.
 * 永远不要放弃，永远不要对自己失望，永远不要逃走，辜负了自己，
 * 永远不要哭啼，永远不要说再见，永远不要说谎来伤害自己。
 */
public interface IUserMondel {


void newsList(NetworkCallback<TouBeen>callback);
void login(String phone,String psw);
}
