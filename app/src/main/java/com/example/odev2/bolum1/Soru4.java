package com.example.odev2.bolum1;

public class Soru4 {

    public void harfBul(String kelime) {
        int sonuc = 0;

        for (int i = 0; i < kelime.length(); i++) {
            char e = kelime.charAt(i);
            if (e == 'e' || e == 'E') {
                sonuc++;
            }
        }

        System.out.println("e adet sayısı: " + sonuc);

    }
}
