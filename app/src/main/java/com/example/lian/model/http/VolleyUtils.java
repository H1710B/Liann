package com.example.lian.model.http;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.example.lian.model.callback.NetworkCallback;
import com.example.lian.utils.SUtils;

import java.io.File;
import java.util.Map;

public class VolleyUtils implements IHttp {

    private static VolleyUtils volleyUtils;
    private RequestQueue queue;

    private VolleyUtils() {
        queue = Volley.newRequestQueue(SUtils.getApp());
    }

    public static VolleyUtils getInstance() {
        if (volleyUtils == null) {
            synchronized (OkHttpUtils.class) {
                if (volleyUtils == null) {
                    volleyUtils = new VolleyUtils();
                }
            }
        }
        return volleyUtils;
    }


    @Override
    public <T> void doGet(String url, NetworkCallback<T> callback) {

    }

    @Override
    public void upload(String url, Map<String, File> files, Map<String, String> params, NetworkCallback<String> callback) {

    }

    @Override
    public void download() {

    }


}
