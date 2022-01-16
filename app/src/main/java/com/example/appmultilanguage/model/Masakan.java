package com.example.appmultilanguage.model;

import java.io.Serializable;

public class Masakan implements Serializable {
    private String masakan;
    private String nama;
    private String bahan;
    private String CaraMebuat;
    private int drawableRes;

    public Masakan(String masakan, String nama, String bahan, String caraMebuat, int drawableRes) {
        this.masakan = masakan;
        this.nama = nama;
        this.bahan = bahan;
        this.CaraMebuat = caraMebuat;
        this.drawableRes = drawableRes;
    }

    public String getMasakan() {
        return masakan;
    }

    public void setMasakan(String masakan) {
        this.masakan = masakan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getCaraMebuat() {
        return CaraMebuat;
    }

    public void setCaraMebuat(String caraMebuat) {
        CaraMebuat = caraMebuat;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}
