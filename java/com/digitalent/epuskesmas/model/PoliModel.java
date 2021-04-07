package com.digitalent.epuskesmas.model;

public class PoliModel{
    private int poliImage;
    private String poliNama;

    public int getPoliImage() {
        return poliImage;
    }

    public void setPoliImage(int poliImage) {
        this.poliImage = poliImage;
    }

    public String getPoliNama() {
        return poliNama;
    }

    public void setPoliNama(String poliNama) {
        this.poliNama = poliNama;
    }

    public PoliModel(int poliImage, String poliNama) {
        this.poliImage = poliImage;
        this.poliNama = poliNama;
    }
}
