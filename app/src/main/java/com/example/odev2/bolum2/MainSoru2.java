package com.example.odev2.bolum2;

public class MainSoru2 {

    //Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod
    //yazınız.
    //• 1 günde 8 saat çalışılabilir.
    //• Çalışma saat ücreti : 40 ₺
    //• Mesai saat ücreti : 80 ₺
    //• 150 saat üzeri mesai sayılır.

    public static void main(String[] args) {

        Soru2 maasNesnesi = new Soru2();

        int gelenMaas = maasNesnesi.maasHesapla(18);
        System.out.println("Maaş Ödemesi: " + gelenMaas);

    }
}
