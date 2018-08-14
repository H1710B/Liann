package com.example.lian.model.http;

import android.widget.ImageView;

import com.example.lian.model.callback.NetworkCallback;

import java.io.File;
import java.util.Map;

/**
 * never gonna give you up, never gonna let you down,
 * never gonna run around and desert you. Never gonna make you cry,
 * never gonna say goodbye. Never gonna tell a lie and hurt you.
 * 永远不要放弃，永远不要对自己失望，永远不要逃走，辜负了自己，
 * 永远不要哭啼，永远不要说再见，永远不要说谎来伤害自己。
 */
//网络接口，做了一些约束
public interface IHttp {

    /**
     * 无参的get请求
     * @param url 接口地址
     */
   /* <T> void doGet(String url, NetworkCallback<T> callback);
    //有参的get请求
    <T> void doGet(String url, Map<String,String> params, NetworkCallback<T> callback);
    //有参的post请求
    <T> void doPost(String url, Map<String,String> params, NetworkCallback<T> callback);

    void upload(String url, Map<String,File> files, Map<String,String> params, NetworkCallback<String> callback);

    void download();

    void loadImage(String url, ImageView view);*/

  // <T>void  dopost(String url,Map<String,String> params,NetworkCallback<T>callback);
    <T> void doGet(String url, NetworkCallback<T> callback);
    void upload(String url,Map<String,File>files,Map<String,String>params,NetworkCallback<String>callback);
void download();
}
