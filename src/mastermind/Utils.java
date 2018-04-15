package mastermind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Couleur;
import model.Resultat;

public class Utils {
	
	public static final int TENTATIVE_MAX = 10;
	public static final List<Couleur>COMBINAISON = new ArrayList<Couleur>
	(Arrays.asList(Couleur.ROUGE, Couleur.ORANGE, Couleur.ORANGE, Couleur.JAUNE));
	public static final int NB_PION = 4;
	
	/**
	 * Retourne le resultat de la saisie
	 * @param combinaisonSaisi
	 * @param nbTentative
	 * @return resultat
	 */
	public static Resultat saisie(List<Couleur> combinaisonSaisie, int nbTentative) {
		int nbPionJuste = Utils.getNbPionJuste(combinaisonSaisie);
		int nbPionMalPlace = Utils.getNbPionMalPlace(combinaisonSaisie);
		Resultat resultat = new Resultat(combinaisonSaisie,
										nbTentative,
										nbPionJuste,
										nbPionMalPlace);
		return resultat;
	}
	
	/**
	 * Retourne le nombre de pions justes
	 * @param combinaisonSaisi
	 * @return nombre de pions justes
	 */
	public static int getNbPionJuste(List<Couleur> combinaisonSaisie) {
		int nbPionJuste = 0;
		for(int i=0; i<Utils.NB_PION; i++) {
			if (combinaisonSaisie.get(i).equals(Utils.COMBINAISON.get(i))) {
				nbPionJuste++;
			}
		}
		return nbPionJuste;
	}
	
	/**
	 * Retourne le nombre de pions mals placés
	 * @param combinaisonSaisi
	 * @return nombre de pions mals placés
	 */
	public static int getNbPionMalPlace(List<Couleur> combinaisonSaisi) {
		int nbPionMalPlace = 0;
		List<Integer> indexVerifie = new ArrayList<Integer>();
		for(int i=0; i<Utils.NB_PION; i++) {
			if (!combinaisonSaisi.get(i).equals(Utils.COMBINAISON.get(i))) {
				boolean pionMalPlace = false;
				int j = 0;
				while(j<Utils.NB_PION && !pionMalPlace) {
					pionMalPlace = combinaisonSaisi.get(i).equals(Utils.COMBINAISON.get(j))
							&& !indexVerifie.contains(new Integer(j));
					j++;
				}
				if (pionMalPlace) {
					nbPionMalPlace++;
					indexVerifie.add(j-1);
				}
			}
		}
		return nbPionMalPlace;
	}
	
	/**
	 * Convertit la chaine de caractère en liste de couleur
	 * @param str
	 * @return liste de couleur
	 */
	public static List<Couleur> getCombinaison(String str) {
		List<Couleur> combinaison = new ArrayList<Couleur>();
		for(int i=0;i<Utils.NB_PION; i++) {
			Couleur c = Utils.getCouleur(str.charAt(i));
			if (c == null) {
				return null;
			}
			combinaison.add(c);
		}
		return combinaison;
	}
	
	/**
	 * Convertit le caractère en Couleur
	 * @param str
	 * @return Couleur
	 */
	public static Couleur getCouleur(char str) {
		switch(str) {
			case 'R' : return Couleur.ROUGE;
			case 'O' : return Couleur.ORANGE;
			case 'V' : return Couleur.VERT;
			case 'N' : return Couleur.NOIR;
			case 'B' : return Couleur.BLEU;
			case 'J' : return Couleur.JAUNE;
			default : return null;
		}
	}
}
