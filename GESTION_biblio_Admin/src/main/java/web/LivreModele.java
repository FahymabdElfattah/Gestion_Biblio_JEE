package web;

import java.util.ArrayList;
import java.util.List;

import metier.entities.Livre;

public class LivreModele {
	private String motCle;
	List<Livre> livres = new ArrayList<>();
	
	
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public List<Livre> getLivres() {
		return livres;
	}
	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}
	
	

}
