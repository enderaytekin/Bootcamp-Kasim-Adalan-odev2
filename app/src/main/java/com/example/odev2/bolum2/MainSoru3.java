package com.example.odev2.bolum2;

public class MainSoru3 {

    //Parametre olarak girilen otopark süresine göre otopark ücreti hesaplayarak geri döndüren metodu
    //yazınız.
    //• 1 saat = 50 ₺
    //• 1 saat aşımından sonra her 1 saat , 10 ₺’dir.

    public static void main(String[] args) {

        Soru3 otoparkNesnesi = new Soru3();

        int gelenOtoparkUcreti = otoparkNesnesi.otoparkUcretHesapla(3);
        System.out.println("Gelen Otopark Ücreti: " + gelenOtoparkUcreti);
    }
}
