package quizzzMyPackage;
//Alt sınıf: ResimOgretmeni
public class ResimOgretmeni extends Ogretmen {
	private static int idCounter = 1;
	private int Id;
	public int gs;
	public double tp;

public ResimOgretmeni(String ad, String soyad, int yas, int gs) {
   super(ad, soyad, yas);
   this.Id = idCounter++;
   this.gs = gs;
   this.tp = gs * 0.3;
   this.Brans = "Resim";
}

	@Override
	public void BilgileriYazdir() {
	   System.out.println("ID: " + Id + ", Ad: " + Ad + ", Soyad: " + Soyad + ", Yas: " + Yas + ", Brans: " + Brans + ", TP: " + tp + " (Resim Ogretmeni)");
	}
}
