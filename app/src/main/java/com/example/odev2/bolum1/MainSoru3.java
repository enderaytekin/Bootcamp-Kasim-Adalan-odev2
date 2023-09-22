package com.example.odev2.bolum1;

public class MainSoru3 {

    //Parametre olarak girilen sayının faktoriyel değerini hesaplayıp geri
    //döndüren metodu yazınız.

    public static void main(String[] args) {

        Soru3 faktoriyelHesapla = new Soru3();

        int gelenFaktoriyel = faktoriyelHesapla.faktoriyelAl(5);
        System.out.println("Faktoriyel Sonucu: " + gelenFaktoriyel);
    }
}
