
public class Main {
    public static void main(String[] args) {
        Ogrenci[] myOgrenci = {new Ogrenci("Ahmet","Bilgisayar Müh.","2023",3.5,"104"),
                               new Ogrenci("Selin","Makine Müh.","2018",2.8,"104"),
                               new Ogrenci("Eda","Elektrik Elektronik Müh.","2015",3,"104")};
        System.out.println("OGR1:"+" "+myOgrenci[0].getAd()+" "+myOgrenci[0].getBolum()+" "+myOgrenci[0].getOgrNo()+" "+myOgrenci[0].getGano());
        System.out.println("OGR2:"+" "+myOgrenci[1].getAd()+" "+myOgrenci[1].getBolum()+" "+myOgrenci[1].getOgrNo()+" "+myOgrenci[1].getGano());
        System.out.println("OGR3:"+" "+myOgrenci[2].getAd()+" "+myOgrenci[2].getBolum()+" "+myOgrenci[2].getOgrNo()+" "+myOgrenci[2].getGano());



        System.out.println("1. Öğrencinin Ödeyeceği Toplam Harç:"+myOgrenci[0].harcHesapla(2,3));
        System.out.println("2. Öğrencinin Ödeyeceği Toplam Harç:"+myOgrenci[1].harcHesapla(5,4));
    }
}