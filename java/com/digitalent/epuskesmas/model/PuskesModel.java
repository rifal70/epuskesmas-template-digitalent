package com.digitalent.epuskesmas.model;

public class PuskesModel {

    private int  iv_Puskes;
    private String tv_Puskes;
    private String tv_alamatPuskes;


    public PuskesModel(int iv_Puskes, String tv_Puskes, String tv_alamatPuskes ){
        this.iv_Puskes = iv_Puskes;
        this.tv_Puskes = tv_Puskes;
        this.tv_alamatPuskes = tv_alamatPuskes;

    }
    public int getIv_Puskes() {
        return iv_Puskes;
    }

    public void setIv_Puskes(int iv_Puskes) {
        this.iv_Puskes = iv_Puskes;
    }

    public String getTv_Puskes() {
        return tv_Puskes;
    }

    public void setTv_Puskes(String tv_Puskes) {
        this.tv_Puskes = tv_Puskes;
    }

    public String getTv_alamatPuskes() {
        return tv_alamatPuskes;
    }

    public void setTv_alamatPuskes(String tv_alamatPuskes) {
        this.tv_alamatPuskes = tv_alamatPuskes;
    }

}