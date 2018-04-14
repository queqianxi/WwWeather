package com.wwweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 *
 * @author Ww
 * @date 2018/4/13
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder().url(address).build();

        client.newCall(request).enqueue(callback);
    }
}
