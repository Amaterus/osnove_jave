package p19_09_2023.discipline;

public class Skakac extends Atleticar {

	public Skakac() {
	}
	
	public Skakac(String punoIme, double rezultat) {
		super(punoIme, rezultat);
	}
//	s1.daliJeBolji(s2)
	@Override
	public boolean daLiJeBolji(Atleticar a) {
		if (this.rezultat > a.rezultat) {
			return true;
		} else {
			return false;
		}
	}

}
