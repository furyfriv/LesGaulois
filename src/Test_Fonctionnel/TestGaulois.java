package Test_Fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterixGaulois = new Gaulois("Ast�rix", 8);
		Gaulois obelixGaulois = new Gaulois("Obelix", 16);
		asterixGaulois.parler("Je ne bosse pas assez");
		obelixGaulois.parler("Bonjour Ast�rix. Ca te dirais d'aller chasser des sangliers ?");
		asterixGaulois.parler("Oui tr�s bonne id�e.");

		Romain minusRomain = new Romain("Minus", 6);
		System.out.println("Dans la foret " + asterixGaulois + " et " + obelixGaulois + "tombe nez � nez sur le romain "
				+ minusRomain);

		for (int i = 0; i < 3; i++) {
			asterixGaulois.frapper(minusRomain);
		}

	}

}
