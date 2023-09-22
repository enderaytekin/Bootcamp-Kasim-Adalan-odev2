package com.example.odev2.bolum1;

public class MainSoru1 {
    public static void main(String[] args) {

        //Parametre olarak girilen kilometreyi mile dönüştürdükten sonra geri
        //döndüren bir metod yazınız. Mile = Km x 0.621

        Soru1 cevirme1 = new Soru1();

        double gelenSonuc = cevirme1.kmDonusum(10);
        System.out.println("Gelen Sonuç: " + gelenSonuc + " inç");

    }
}
