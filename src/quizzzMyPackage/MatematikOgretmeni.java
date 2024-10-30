package quizzzMyPackage;
//Alt sınıf: MatematikOgretmeni
public class MatematikOgretmeni extends Ogretmen {
	private static int idCounter = 1;
	private int Id;
	public int gs;
	public double tp;

public MatematikOgretmeni(String ad, String soyad, int yas, int gs) {
   super(ad, soyad, yas);
   this.Id = idCounter++;
   this.gs = gs;
   this.tp = gs * 0.4;
   this.Brans = "Matematik";
}

	@Override
	public void BilgileriYazdir() {
	   System.out.println("ID: " + Id + ", Ad: " + Ad + ", Soyad: " + Soyad + ", Yas: " + Yas + ", Brans: " + Brans + ", TP: " + tp + " (Matematik Ogretmeni)");
	}
}
