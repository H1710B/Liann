package com.example.lian.model.http;

import android.os.Handler;
import android.os.Looper;

import com.example.lian.model.callback.NetworkCallback;
import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttpUtils implements IHttp {

    private static OkHttpUtils okHttpUtils;
    private OkHttpClient httpClient;

    private OkHttpUtils() {
        httpClient = new OkHttpClient.Builder().build();
    }
    //单利
    public static OkHttpUtils getInstance() {
        if (okHttpUtils == null) {
            synchronized (OkHttpUtils.class) {
                if (okHttpUtils == null)
                    okHttpUtils = new OkHttpUtils();
            }
        }
        return okHttpUtils;
    }

    @Override
    public <T> void doGet(String url, final NetworkCallback<T> callback) {
        Request request = new Request.Builder().url(url).build();
        httpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String result = response.body().string();
                final T t = parseData(result, callback);
               // Looper.prepare();
                 // Looper.loop();

                Handler mainHandler = new Handler(Looper.getMainLooper());
                mainHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        //已在主线程中，可以更新UI
                        callback.onSuccess(t);

                    }
                });
            }
        });
    }


    private <T> T parseData(String jsonData, NetworkCallback<T> callback) {

        Type[] interfacesTypes = callback.getClass().getGenericInterfaces();

        Type[] genericType2 = ((ParameterizedType) interfacesTypes[0]).getActualTypeArguments();
        Class<T> classes = (Class<T>) genericType2[0];
        Gson gson = new Gson();
        T t = gson.fromJson(jsonData, classes);
        return t;

    }


    @Override
    public void upload(String url, Map<String, File> files, Map<String, String> params, NetworkCallback<String> callback) {

    }

    @Override
    public void download() {

    }
}
