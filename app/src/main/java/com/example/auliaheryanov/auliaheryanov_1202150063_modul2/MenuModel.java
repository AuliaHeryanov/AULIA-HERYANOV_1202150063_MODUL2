package com.example.auliaheryanov.auliaheryanov_1202150063_modul2;

/**
 * Created by Aulia Heryanov on 18/02/2018.
 */

public class MenuModel {
    private String nama;
    private int harga;
    private int gambar;
    private String deskripsi;

    public MenuModel(String nama, int harga, int gambar, String deskripsi) {
        this.nama = nama;
        this.harga = harga;
        this.gambar = gambar;
        this.deskripsi = deskripsi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {this.harga = harga;}

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}

