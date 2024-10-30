package quizzzMyPackage;

public class Ogretmen {
 public String Ad;
 public String Soyad;
 public int Yas;
 public String Brans;
 private static int ogretmenSayisi = 0;

 public Ogretmen(String ad, String soyad, int yas) {
     this.Ad = ad;
     this.Soyad = soyad;
     this.Yas = yas;
     ogretmenSayisi++;
 }

 public void BilgileriYazdir() {
     System.out.println("Ad: " + Ad + ", Soyad: " + Soyad + ", Yas: " + Yas + ", Brans: " + Brans);
 }

 public static final void OgretmenSayisiVer() { // alt sınıflar tarafında overrideedilemeyecek şekilde -->final
     System.out.println("Toplam Ogretmen Sayisi: " + ogretmenSayisi);
 }
}
