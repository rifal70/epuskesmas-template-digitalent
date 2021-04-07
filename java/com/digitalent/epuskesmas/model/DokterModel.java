package com.digitalent.epuskesmas.model;

public class DokterModel {
    private int dokterFoto;
    private String dokterNama;

    public DokterModel(int dokterFoto, String dokterNama) {
        this.dokterFoto = dokterFoto;
        this.dokterNama = dokterNama;
    }

    public int getDokterFoto() {
        return dokterFoto;
    }

    public void setDokterFoto(int dokterFoto) {
        this.dokterFoto = dokterFoto;
    }

    public String getDokterNama() {
        return dokterNama;
    }

    public void setDokterNama(String dokterNama) {
        this.dokterNama = dokterNama;
    }
}
