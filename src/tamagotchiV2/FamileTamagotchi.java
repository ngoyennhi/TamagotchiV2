package tamagotchiV2;

import java.util.ArrayList;
/**
 * Classe : La liste de Tamagotchis
 * @author YenNhi NGO
 *
 */
public class FamileTamagotchi {

	// saisir les tamagotchis dans le tableau dynamique
	public static void saisirTamas(ArrayList<Tamagotchi> liste) {
			Tamagotchi Tama1 = new Tamagotchi("Toto", 1, 1, true);
			Tamagotchi Tama2 = new Tamagotchi("Tata", 2, 2, true);
			Tamagotchi Tama3 = new Tamagotchi("Tonton", 3, 3, true);
			liste.add(Tama1);
			liste.add(Tama2);
			liste.add(Tama3);
		}

	/**
	 * rechercher un Tamagotchi par son nom, et afficher ses caractéristiques
	 * @param liste
	 * @param regex
	 */
	public static void rechercherTamaParNom(ArrayList<Tamagotchi> liste,String regex) {
		ArrayList<Tamagotchi> listeTemp = new ArrayList<Tamagotchi>();
		for (Tamagotchi i : liste) {
			// Str.matches("(.*)Tutorials(.*)")
			// EX: rechercher par nom Toto
			if (i.getNom().matches(regex)) {
				listeTemp.add(i);
			}
		}
		Tamagotchi.afficheList(listeTemp);
	}
	}
