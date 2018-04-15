package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import mastermind.Utils;
import model.Couleur;
import model.Resultat;

public class ResultatTest {
	@Test
	public void toStringTest() {
		List<Couleur> combinaison = new ArrayList<Couleur>
		(Arrays.asList(Couleur.ORANGE, Couleur.ROUGE, Couleur.ROUGE, Couleur.VERT));
		Resultat r = Utils.saisie(combinaison, 1);
		assertEquals(r.toString(), "ORRV | 0 | 2 | 1/10");
	}
}
