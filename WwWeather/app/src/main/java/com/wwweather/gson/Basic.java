package com.wwweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Ww
 * @date 2018/4/14
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
