package com.example.odev2.bolum2;

public class Soru3 {

    public int otoparkUcretHesapla(int parkSuresi) {
        int ucret;
        if (parkSuresi > 1) {
            ucret = 50 + ((parkSuresi - 1) * 10);
        } else {
            ucret = 50;
        }

        return ucret;
    }
}
