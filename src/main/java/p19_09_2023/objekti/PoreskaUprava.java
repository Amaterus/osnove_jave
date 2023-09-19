package p19_09_2023.objekti;


import java.util.ArrayList;

public class PoreskaUprava {
	
	private String grad;
	private ArrayList<Objekat> objekti;

	public PoreskaUprava() {
		objekti = new ArrayList<>();
	}
	
	public PoreskaUprava(String grad) {
		this.grad = grad;
		objekti = new ArrayList<>();
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}
	
	public void dodajObjekat(Objekat o) {
		this.objekti.add(o);
	}

	
	public double ukupanPorez() {
		double suma = 0;
		for (int i = 0; i < this.objekti.size(); i++) {
			suma += this.objekti.get(i).racunajPorez();
		}
		return suma;
	}
	
	public void stampajSve() {
		for (int i = 0; i < this.objekti.size(); i++) {
			this.objekti.get(i).stampaj();
		}
		System.out.println("Ukupan porez" + this.ukupanPorez());
	}

	public Objekat najveciPorez() {
//		double maxPorez = this.objekti.get(0).racunajPorez();
//		int pozicija = 0;
//		for (int i = 0; i < this.objekti.size(); i++) {
//			if (this.objekti.get(i).racunajPorez() > maxPorez) {
//				maxPorez = this.objekti.get(i).racunajPorez();
//				pozicija = i;
//			}
//		}
//
//		return objekti.get(pozicija);

		Objekat najveci = this.objekti.get(0);
		for (int i = 0; i < this.objekti.size(); i++) {
			Objekat objekat = this.objekti.get(i);
			if (objekat.racunajPorez() > najveci.racunajPorez()) {
				najveci = this.objekti.get(i);
			}
		}

//        for (Objekat objekat : this.objekti) {
//            if (objekat.racunajPorez() > najveci.racunajPorez()) {
//                najveci = objekat;
//            }
//        }
		return najveci;




	}

	public Objekat najmanjiPorez() {
		Objekat najmanji = this.objekti.get(0);
		for (int i = 0; i < this.objekti.size(); i++) {
			Objekat objekat = this.objekti.get(i);
			if (objekat.racunajPorez() < najmanji.racunajPorez()) {
				najmanji = this.objekti.get(i);
			}
		}
		return najmanji;
	}



	
	
}
