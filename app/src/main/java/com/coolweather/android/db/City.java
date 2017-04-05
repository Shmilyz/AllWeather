package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Shmily_Z on 2017/4/5.
 */

public class City extends DataSupport{
    private int id;
    private String citeName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCiteName() {
        return citeName;
    }

    public void setCiteName(String citeName) {
        this.citeName = citeName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
/*
* 关于城市的数据库，继承了DataSupport
* */