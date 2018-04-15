package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import mastermind.Utils;
import model.Couleur;
import model.Resultat;

public class UtilsTest {
	@Test
	public void getNbPionJusteTest() {
		List<Couleur> combinaison1 = new ArrayList<Couleur>
		(Arrays.asList(Couleur.ROUGE, Couleur.BLEU, Couleur.NOIR, Couleur.VERT));
		List<Couleur> combinaison2 = new ArrayList<Couleur>
		(Arrays.asList(Couleur.ROUGE, Couleur.ORANGE, Couleur.ORANGE, Couleur.JAUNE));
		assertEquals(Utils.getNbPionJuste(combinaison1), 1);
		assertEquals(Utils.getNbPionJuste(combinaison2), 4);
	}
	
	@Test
	public void getNbPionMalPlaceTest() {
		List<Couleur> combinaison1 = new ArrayList<Couleur>
		(Arrays.asList(Couleur.ORANGE, Couleur.ROUGE, Couleur.ROUGE, Couleur.VERT));
		List<Couleur> combinaison2 = new ArrayList<Couleur>
		(Arrays.asList(Couleur.JAUNE, Couleur.ORANGE, Couleur.ORANGE, Couleur.ROUGE));
		assertEquals(Utils.getNbPionMalPlace(combinaison1), 2);
		assertEquals(Utils.getNbPionMalPlace(combinaison2), 2);
	}
	
	@Test 
	public void getSaisieTest() {
		List<Couleur> combinaison = new ArrayList<Couleur>
		(Arrays.asList(Couleur.ORANGE, Couleur.ROUGE, Couleur.ROUGE, Couleur.VERT));
		Resultat r = Utils.saisie(combinaison, 1);
		assertEquals(r.getNbPionJuste(), 0);
		assertEquals(r.getNbPionMalPlace(), 2);
	}
	
	@Test
	public void getCouleurTest() {
		assertEquals(Utils.getCouleur('B'), Couleur.BLEU);
		assertEquals(Utils.getCouleur('J'), Couleur.JAUNE);
		assertEquals(Utils.getCouleur('R'), Couleur.ROUGE);
		assertEquals(Utils.getCouleur('N'), Couleur.NOIR);
		assertEquals(Utils.getCouleur('O'), Couleur.ORANGE);
		assertEquals(Utils.getCouleur('V'), Couleur.VERT);
		assertEquals(Utils.getCouleur('X'), null);
	}
	
	@Test public void getCombinaisonTest() {
		List<Couleur> combinaison = new ArrayList<Couleur>
		(Arrays.asList(Couleur.ROUGE, Couleur.BLEU, Couleur.NOIR, Couleur.VERT));
		assertEquals(Utils.getCombinaison("RBNV"), combinaison);
		assertEquals(Utils.getCombinaison("RACX"), null);
	}
}
