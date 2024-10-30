package quizzzMyPackage;
import java.util.Scanner;

public class Anasayfa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan öğretmen sayıları alınıyor
        System.out.print("Matematik Öğretmenlerinin Sayısını Giriniz: ");
        int matematikOgretmenSayisi = scanner.nextInt();
        System.out.print("Resim Öğretmenlerinin Sayısını Giriniz: ");
        int resimOgretmenSayisi = scanner.nextInt();

        MatematikOgretmeni[] matematikOgretmenleri = new MatematikOgretmeni[matematikOgretmenSayisi];
        ResimOgretmeni[] resimOgretmenleri = new ResimOgretmeni[resimOgretmenSayisi];

        // Matematik öğretmenlerinin bilgileri alınıyor
        for (int i = 0; i < matematikOgretmenSayisi; i++) {
            System.out.println((i + 1) + ". Matematik Öğretmeni Bilgileri:");
            System.out.print("Ad: ");
            String ad = scanner.next();
            System.out.print("Soyad: ");
            String soyad = scanner.next();
            System.out.print("Yas: ");
            int yas = scanner.nextInt();
            System.out.print("Görev Süresi (Yıl): ");
            int gs = scanner.nextInt();

            matematikOgretmenleri[i] = new MatematikOgretmeni(ad, soyad, yas, gs);
        }

        // Resim öğretmenlerinin bilgileri alınıyor
        for (int i = 0; i < resimOgretmenSayisi; i++) {
            System.out.println((i + 1) + ". Resim Öğretmeni Bilgileri:");
            System.out.print("Ad: ");
            String ad = scanner.next();
            System.out.print("Soyad: ");
            String soyad = scanner.next();
            System.out.print("Yas: ");
            int yas = scanner.nextInt();
            System.out.print("Görev Süresi (Yıl): ");
            int gs = scanner.nextInt();

            resimOgretmenleri[i] = new ResimOgretmeni(ad, soyad, yas, gs);
        }

        // Toplam öğretmen sayısını ekrana yazdırma
        Ogretmen.OgretmenSayisiVer();

        // Matematik öğretmenlerinin bilgilerini listeleme
        System.out.println("Matematik Öğretmenleri:");
        for (MatematikOgretmeni ogretmen : matematikOgretmenleri) {
            ogretmen.BilgileriYazdir();
        }

        // Resim öğretmenlerinin bilgilerini listeleme
        System.out.println("Resim Öğretmenleri:");
        for (ResimOgretmeni ogretmen : resimOgretmenleri) {
            ogretmen.BilgileriYazdir();
        }

        // Matematik öğretmenlerini TP'ye göre sıralama ve yazdırma
        OgretmenSirala(matematikOgretmenleri);

        // Resim öğretmenlerini TP'ye göre sıralama ve yazdırma
        OgretmenSirala(resimOgretmenleri);
    }

    // Matematik öğretmenlerini TP'ye göre sıralama
    public static void OgretmenSirala(MatematikOgretmeni[] ogretmenler) {
        bubbleSortByTP(ogretmenler);
        System.out.println("\nTecrübe Puanına Göre Sıralanmış Matematik Öğretmenleri:");
        for (MatematikOgretmeni ogretmen : ogretmenler) {
            ogretmen.BilgileriYazdir();
        }
    }

    // Resim öğretmenlerini TP'ye göre sıralama
    public static void OgretmenSirala(ResimOgretmeni[] ogretmenler) {
        bubbleSortByTP(ogretmenler);
        System.out.println("\nTecrübe Puanına Göre Sıralanmış Resim Öğretmenleri:");
        for (ResimOgretmeni ogretmen : ogretmenler) {
            ogretmen.BilgileriYazdir();
        }
    }

    // Matematik öğretmenlerini TP değerine göre sıralama
    public static void bubbleSortByTP(MatematikOgretmeni[] ogretmenler) {
        for (int i = 0; i < ogretmenler.length - 1; i++) {
            for (int j = 0; j < ogretmenler.length - i - 1; j++) {
                if (ogretmenler[j].tp < ogretmenler[j + 1].tp) {
                    MatematikOgretmeni temp = ogretmenler[j];
                    ogretmenler[j] = ogretmenler[j + 1];
                    ogretmenler[j + 1] = temp;
                }
            }
        }
    }

    // Resim öğretmenlerini TP değerine göre sıralama
    public static void bubbleSortByTP(ResimOgretmeni[] ogretmenler) {
        for (int i = 0; i < ogretmenler.length - 1; i++) {
            for (int j = 0; j < ogretmenler.length - i - 1; j++) {
                if (ogretmenler[j].tp < ogretmenler[j + 1].tp) {
                    ResimOgretmeni temp = ogretmenler[j];
                    ogretmenler[j] = ogretmenler[j + 1];
                    ogretmenler[j + 1] = temp;
                }
            }
        }
    }
}

