package com.example.odev2.bolum2;

public class Soru1 {

    public int icAciHesapla(int kenarSayisi) {
        int icAciToplami = (kenarSayisi - 2) * 180;
        int icAci = icAciToplami / kenarSayisi;
        return icAci;
    }
}
