package com.example.odev2.bolum2;

public class Soru2 {

    public int maasHesapla(int calisilanGunSayisi) {
        int maas;
        int calisilanSaat = calisilanGunSayisi * 8;

        if (calisilanSaat > 150) {
            maas = ((calisilanSaat - 150) * 80) + (150 * 40);
        } else {
            maas = calisilanSaat * 40;
        }
        return maas;
    }
}
