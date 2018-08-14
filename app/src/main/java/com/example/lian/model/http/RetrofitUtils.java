package com.example.lian.model.http;

import com.example.lian.model.bizyewu.MineService;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public class RetrofitUtils {

    private final Retrofit retrofit;

    //danli
    private RetrofitUtils(){




        retrofit = new Retrofit.Builder()
                .baseUrl()
                .addCallAdapterFactory(RxJava2c)
                .client(OkHttpClient)
                .build();
    }
}
