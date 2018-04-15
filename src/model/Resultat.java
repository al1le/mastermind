package model;

import java.util.List;

import mastermind.Utils;

/**
 * Le résultat que l'on va afficher dans la console
 * @author Alain
 *
 */
public class Resultat {
	private List<Couleur> combinaisonSaisi;
	private int nbTentative;
	private int nbPionJuste;
	private int nbPionMalPlace;
	
	public Resultat(List<Couleur> combinaisonSaisi,
			int nbTentative,
			int nbPionJuste,
			int nbPionMalPlace) {
		this.setCombinaisonSaisi(combinaisonSaisi);
		this.setNbTentative(nbTentative);
		this.setNbPionJuste(nbPionJuste);
		this.setNbPionMalPlace(nbPionMalPlace);
	}


	/**
	 * @return the combinaisonSaisi
	 */
	public List<Couleur> getCombinaisonSaisi() {
		return combinaisonSaisi;
	}

	/**
	 * @param combinaisonSaisi the combinaisonSaisi to set
	 */
	public void setCombinaisonSaisi(List<Couleur> combinaisonSaisi) {
		this.combinaisonSaisi = combinaisonSaisi;
	}

	/**
	 * @return the nbTentative
	 */
	public int getNbTentative() {
		return nbTentative;
	}

	/**
	 * @param nbTentative the nbTentative to set
	 */
	public void setNbTentative(int nbTentative) {
		this.nbTentative = nbTentative;
	}

	/**
	 * @return the nbPionJuste
	 */
	public int getNbPionJuste() {
		return nbPionJuste;
	}

	/**
	 * @param nbPionJuste the nbPionJuste to set
	 */
	public void setNbPionJuste(int nbPionJuste) {
		this.nbPionJuste = nbPionJuste;
	}

	/**
	 * @return the nbPionMalPlace
	 */
	public int getNbPionMalPlace() {
		return nbPionMalPlace;
	}

	/**
	 * @param nbPionMalPlace the nbPionMalPlace to set
	 */
	public void setNbPionMalPlace(int nbPionMalPlace) {
		this.nbPionMalPlace = nbPionMalPlace;
	}
	
	/**
	 * Retourne le resultat
	 */
	public String toString() {
		String resultat = "";
		String combinaisonSaisi = this.combinaisonSaisi.toString().replaceAll(",", "");
		combinaisonSaisi = combinaisonSaisi.replaceAll("\\[", "");
		combinaisonSaisi = combinaisonSaisi.replaceAll("\\]", "");
		combinaisonSaisi = combinaisonSaisi.replaceAll(" ", "");
		resultat = combinaisonSaisi + " | " + this.nbPionJuste + " | " + this.nbPionMalPlace +
				" | " + this.nbTentative + "/" + Utils.TENTATIVE_MAX;
		return resultat;
	}
}
