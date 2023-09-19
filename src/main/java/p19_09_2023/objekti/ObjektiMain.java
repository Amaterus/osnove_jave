package p19_09_2023.objekti;

public class ObjektiMain {
	public static void main(String[] args) {
		
		PoreskaUprava p = new PoreskaUprava("Nis");
		
		p.dodajObjekat(new Kuca("Kralja Vukasina", 45, 2, 2));
		p.dodajObjekat(new Zgrada("Gavrila Principa 11", 100, 3, 10));
		p.dodajObjekat(new Lokal("Dusan Veliki", 30, 1));
		p.dodajObjekat(new Zgrada("Gavrila Principa", 200, 1, 20));

		
//		System.out.println("Ukupan porez za ceo grad je " + p.ukupanPorez());

		p.stampajSve();
		System.out.println("Objekat sa najvecim porezom: ");
		Objekat najveciPorez = p.najveciPorez();
		najveciPorez.stampaj();







		
		
		
	}
}
