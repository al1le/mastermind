package model;

import java.util.ArrayList;
import java.util.List;

public class Historique {
	List<Resultat> listeResultat;
	
	public Historique() {
		listeResultat = new ArrayList<Resultat>();
	}
	
	public void afficheHistorique() {
		for (Resultat r: listeResultat) {
			System.out.println(r.toString());		
		}
	}
	
	public void ajouterResultat(Resultat r) {
		listeResultat.add(r);
	}
	
	public List<Resultat> getListeResultat() {
		return listeResultat;
	}
}
