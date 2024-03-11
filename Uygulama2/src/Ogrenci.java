public class Ogrenci {
    private String ad;
    private String bolum;
    private String girisYili;
    private String ogrNo;
    private double gano;
    private String bolumKodu;
    public Ogrenci(String ad,String bolum,String girisYili,String ogrNo){
        this.ad=ad;
        this.bolum=bolum;
        this.girisYili=girisYili;
    }

    public Ogrenci(String ad,String bolum,String girisYili,double gano,String bolumKodu) {
        this.ad=ad;
        this.bolum=bolum;
        this.girisYili=girisYili;
        this.ogrNo=generateOgrNo(girisYili,bolumKodu);
        this.gano=gano;
        this.bolumKodu=bolumKodu;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setGirisYili(String girisYili) {
        this.girisYili = girisYili;
    }

    public void setOgrNo(String ogrNo) {
        this.ogrNo = ogrNo;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    public void setBolumKodu(String bolumKodu) {
        this.bolumKodu = bolumKodu;
    }

    public String getAd() {
        return ad;
    }

    public String getBolum() {
        return bolum;
    }

    public String getGirisYili() {
        return girisYili;
    }

    public String getOgrNo() {
        return ogrNo;
    }

    public double getGano() {
        if(gano<0 || gano>4){
            throw new IllegalArgumentException("Gano 0 ve 4 arasında olmalıdır.");
        }
        return gano;
    }

    public String getBolumKodu() {
        return bolumKodu;
    }
    public String generateOgrNo(String girisYili,String bolumKodu){
        String girisSirasi="001";
        String ogrNo1=girisYili+bolumKodu+girisSirasi;
        return ogrNo1;
    }
     public double harcHesapla(int dersSayisi){

        return dersSayisi*100;
     }
     public double harcHesapla(int dersSayisi, int uzatmaYili){

        return harcHesapla(dersSayisi) + (uzatmaYili * 50);
     }
}
