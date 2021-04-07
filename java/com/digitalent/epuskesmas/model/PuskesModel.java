package com.digitalent.epuskesmas.model;

public class PuskesModel {

    private int puskesImage;
    private String puskesNama;
    private String puskesAlamat;


    public PuskesModel(int puskesImage, String puskesNama, String puskesAlamat) {
        this.puskesImage = puskesImage;
        this.puskesNama = puskesNama;
        this.puskesAlamat = puskesAlamat;
    }


    public int getPuskesImage() {
        return puskesImage;
    }

    public void setPuskesImage(int puskesImage) {
        this.puskesImage = puskesImage;
    }

    public String getPuskesNama() {
        return puskesNama;
    }

    public void setPuskesNama(String puskesNama) {
        this.puskesNama = puskesNama;
    }

    public String getPuskesAlamat() {
        return puskesAlamat;
    }

    public void setPuskesAlamat(String puskesAlamat) {
        this.puskesAlamat = puskesAlamat;
    }
}
