package com.example.odev2.bolum2;

public class MainSoru1 {

    //Parametre olarak girilen kenar sayısına göre her bir iç açıyı hesaplayıp sonucu geri gönderen metod
    //yazınız.
    //• İç açılar toplamı = ( (Kenar sayısı - 2) x 180 ) / Kenar sayısı
    public static void main(String[] args) {

        Soru1 icAciNesnesi = new Soru1();
        int gelenIcAci = icAciNesnesi.icAciHesapla(5);
        System.out.println("İç Açı: " + gelenIcAci);

    }
}
