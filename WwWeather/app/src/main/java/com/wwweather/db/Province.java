package com.wwweather.db;

import org.litepal.crud.DataSupport;

/**
 *
 * @author Ww
 * @date 2018/4/13
 */

public class Province extends DataSupport {
    private int id;

    private String provinceName;

    private int provinceCode;

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {

        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
