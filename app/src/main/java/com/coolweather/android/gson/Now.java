package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Shmily_Z on 2017/4/6.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("text")
        public String info;
    }
}
