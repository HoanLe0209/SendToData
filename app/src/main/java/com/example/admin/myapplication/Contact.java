package com.example.admin.myapplication;

public class Contact {
    private String hoten;
    private String sodt;

    public Contact(String hoten, String sodt) {
        this.hoten = hoten;
        this.sodt = sodt;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }
}
