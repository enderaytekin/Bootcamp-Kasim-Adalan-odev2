package com.example.odev2.bolum1;

public class Soru3 {

    public int faktoriyelAl(int sayi) {
        int sonuc = 1;

        for (int i = 1; i <= sayi; i++) {
            sonuc = sonuc * i;
        }
        return sonuc;

    }
}
