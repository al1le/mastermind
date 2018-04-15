package mastermind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import model.Couleur;
import model.Historique;
import model.Resultat;

public class Main {
	

	public static void main(String[] args) {
		boolean finPartie = false;
		boolean partieGagne = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("----MASTERMIND----");
		int nbTentative = 1;
		Historique historique = new Historique();
		do {
			String str = sc.nextLine();
			List<Couleur> combinaisonSaisie = Utils.getCombinaison(str);
			if (combinaisonSaisie == null) {
				System.out.println("----ERREUR DE SAISIE----");
			} else {
				Resultat r = Utils.saisie(combinaisonSaisie, nbTentative);	
				historique.ajouterResultat(r);
				historique.afficheHistorique();
				partieGagne =  Utils.getNbPionJuste(combinaisonSaisie) == Utils.NB_PION;
				finPartie = partieGagne || nbTentative == Utils.TENTATIVE_MAX;
				nbTentative++;
			}
		} while (!finPartie);
		if (partieGagne) {
			System.out.println("----PARTIE GAGNE----");
		} else {
			System.out.println("----PARTIE PERDU----");
		}
		
	}

}
