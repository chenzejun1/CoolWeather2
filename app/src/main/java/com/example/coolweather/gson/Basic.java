package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 13760478768 on 2018/1/5.
 */

public class Basic {
    @SerializedName("City")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}

