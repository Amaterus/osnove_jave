package p19_09_2023.discipline;

public class Trkac extends Atleticar {

	public Trkac() {
	}
	
	public Trkac(String punoIme, double rezultat) {
		super(punoIme, rezultat);
	}
	
	@Override
//	a1.daLiJeBolji(a2);
	public boolean daLiJeBolji(Atleticar a) {
//		if (this.rezultat < a.rezultat) {
//			return true;
//		} else {
//			return false;
//		}
		return this.rezultat < a.rezultat;
	}

}
