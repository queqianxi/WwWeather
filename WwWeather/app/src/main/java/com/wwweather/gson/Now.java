package com.wwweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Ww
 * @date 2018/4/14
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
