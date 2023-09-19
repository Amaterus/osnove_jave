package p19_09_2023.discipline;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private String naziv;
	private String tip;
	private List<Atleticar> atlete;
	
	public Disciplina() {
		atlete = new ArrayList<Atleticar>();
	}
	
	public Disciplina(String naziv, String tip) {
		this.naziv = naziv;
		this.tip = tip;
		atlete = new ArrayList<Atleticar>();
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	
	public void dodajAtleticara(Atleticar a) {
		this.atlete.add(a);
	}
	
	public void diskvalifikuj(String punoIme) {
		for (int i = 0; i < this.atlete.size(); i++) {
			if(this.atlete.get(i).getPunoIme().equals(punoIme)) {
				this.atlete.remove(i);
			}
			
		}
	}
	
	public Atleticar nadjiNajboljeg() {

		if (this.atlete.isEmpty()) {
			return null;
		}

		Atleticar najbolji = this.atlete.get(0);
        for (Atleticar atleticar : this.atlete) {
            if (atleticar.daLiJeBolji(najbolji)) {
                najbolji = atleticar;
            }
        }
		return najbolji;




//		this.atlete.size() // 0
//		Atleticar najbolji = this.atlete.get(0);
//		for (int i = 1; i < this.atlete.size(); i++) {
//			if (this.atlete.get(i).daLiJeBolji(najbolji)) {
//				najbolji = this.atlete.get(i);
//			}
//		}
//
//		return najbolji;
	}

	
	
	
	
	
	
	
	
	private Atleticar vratiNajboljeg() {
		Atleticar a = this.atlete.get(0);
		for (int i = 1; i < this.atlete.size(); i++) {
			if(this.atlete.get(i).daLiJeBolji(a)) {
				a = this.atlete.get(i);
			}
		}
		
		return a;
	}
	
	public void stampajPobednika() {
		this.vratiNajboljeg().stampaj();
	}
	
}
