package tamagotchiV2;

import java.util.ArrayList;

public class MainTestTamagotchiV2 {

	public static void main(String[] args) {
		// le nombre de fois repeter un activité
		int fois;

		System.out.println("Pour commencer le jeu,...");
		System.out.println("Tapez 1 si vous voulez avoir une famille de 3 tamagotchis");
		System.out.println("Tapez 2 si vous voulez avoir un seul tamagotchi");
		int mode = Clavier.lireInt();
		switch (mode) {
		/**
		 * Partie 1: jouer avec les list de 3 Tamagotchis en même temps
		 */
		case 1:
			ArrayList<Tamagotchi> listeTamas = new ArrayList<Tamagotchi>();
			FamileTamagotchi.saisirTamas(listeTamas);
			Tamagotchi.afficheList(listeTamas);
			System.out.println();
			//numbre de Tamagotchis dans la famille
			int nTamas = listeTamas.size();
			//GAME OVER s'il n'a plus de Tamagotchi dans la famille
			while(nTamas > 0) {
				System.out.println("Choisissez un tamagotchi dans la famille, svp");
			System.out.println("il y a " + nTamas + " dans la famille. ( tapez un chiffre entre 0 et " + (nTamas-1)+ " ), svp");
			int indexTama = Clavier.lireInt();
			String nomTamaIndex = listeTamas.get(indexTama).getNom();
			// status de vie de votre Tamagotchi
			Boolean statusVie = listeTamas.get(indexTama).getStatus();
			while (statusVie) {
				System.out.println("! *¨¨_¨¨* !");
				System.out.println(nomTamaIndex + " est prêt!");
				System.out.println("! *¨¨_¨¨* !");
				System.out.println();
				System.out.println("Choisissez un activité que vous voulez, svp");
			System.out.println("0-jouer   1-dormir   2-manger   3-aller aux toilettes  4-se doucher");
			int activeTama = Clavier.lireInt();
			switch (activeTama) {
			// jouer
			case 0:
				System.out.println("Combien fois voulez-vous jouer avec " + nomTamaIndex + " ?");
				System.out.println("saissisez un chiffre entier entre 1 et 10, svp ");
				fois = Clavier.lireInt();
				listeTamas.get(indexTama).jouer(fois);
				break;
			// dormir
			case 1:
				listeTamas.get(indexTama).dormir();
				break;
			// manger
			case 2:
				System.out.println(nomTamaIndex + " mangera full ou combien fois?");
				System.out.println("0-full      1-Nourri par plusieurs fois");
				fois = Clavier.lireInt();
				if (fois == 1) {
					System.out.println("Combien fois voulez-vous nourrir " + nomTamaIndex + " ?");
					System.out.println("saissisez un chiffre entier entre 1 et 15, svp ");
					fois = Clavier.lireInt();
					listeTamas.get(indexTama).manger(fois);
				} else {
					listeTamas.get(indexTama).manger("full");
				}
				break;
			// aller aux toilettes
			case 3:
				listeTamas.get(indexTama).faireWC();
				break;
			// se doucher
			case 4:
				listeTamas.get(indexTama).faireDoucher();
				break;
			default:
				System.out.println("Veuillez selectionner un chiffre parmi les chiffres proposés, svp");
				break;
			}
			listeTamas.get(indexTama).affiche();
			// mettre à jours status de vie de votre Tamagotchi
			statusVie = listeTamas.get(indexTama).getStatus();

			if (statusVie == false) {
				System.out.println(nomTamaIndex + " est mort." + nomTamaIndex + " n'est plus dans la famille.");
				listeTamas.remove(indexTama);
				System.out.println("Veuillez choisir un autre tamagotchi, merci.");
				nTamas = nTamas - 1;
			}
			}
			}	
			break;
			/**
			 * Partie 2: jouer avec un seul Tamagotchis 
			 */
		case 2:
			Tamagotchi heoTamagotchi = new Tamagotchi();

			Boolean vie = heoTamagotchi.getStatus();

			String nomTama = heoTamagotchi.getNom();

			while (vie) {
				heoTamagotchi.affiche();
				System.out.println();
				System.out.println("Choisissez un activité pour " + nomTama);
				System.out.println("0-jouer   1-dormir   2-manger   3-aller aux toilettes  4-se doucher");
				int activite = Clavier.lireInt();
				switch (activite) {
				// jouer
				case 0:
					System.out.println("Combien fois voulez-vous jouer avec " + nomTama + " ?");
					System.out.println("saissisez un chiffre entier entre 1 et 10, svp ");
					fois = Clavier.lireInt();
					heoTamagotchi.jouer(fois);
					break;
				// dormir
				case 1:
					heoTamagotchi.dormir();
					break;
				// manger
				case 2:
					System.out.println(nomTama + "mangera full ou combien fois?");
					System.out.println("0-full      1-Nourri par plusieurs fois");
					fois = Clavier.lireInt();
					if (fois == 1) {
						System.out.println("Combien fois voulez-vous nourrir " + nomTama + " ?");
						System.out.println("saissisez un chiffre entier entre 1 et 15, svp ");
						fois = Clavier.lireInt();
						heoTamagotchi.manger(fois);
					} else {
						heoTamagotchi.manger("full");
					}
					break;
				// aller aux toilettes
				case 3:
					heoTamagotchi.faireWC();
					break;
				// se doucher
				case 4:
					heoTamagotchi.faireDoucher();
					break;
				default:
					System.out.println("Veuillez selectionner un chiffre parmi les chiffres proposés, svp");
					break;
				}
				// mettre à jours status de vie de votre Tamagotchi
				vie = heoTamagotchi.getStatus();
			}
			break;
		default:
			System.out.println("Veuillez sélectionner un option, svp");
			break;
		}
		
//		/*
//		 * Demande de rechercher un tamagotchi par son nom, et afficher ses caractéristiques
//		 */
//		System.out.println("----------test10:Chercher un Tamagotchi par son nom d'une liste ---------");
//		FamileTamagotchi.rechercherTamaParNom(listeTamas, "(?i)Toto.*");
//		System.out.println();
//		
//		/*
//		 * Demande d'afficher le tamagotchi plus GRAND et plus PETIT
//		 */	
//		//indiquer le tamagotchi le plus petit
//		System.out.println("----------test11:Chercher un Tamagotchi qui est plus petit ( tri par poids) ---------");
//		Tamagotchi.citerTamaPlusPetit(listeTamas);
//		System.out.println();
//		//indiquer le tamagotchi le plus grand
//		System.out.println("----------test12:Chercher un Tamagotchi qui est plus grand ( tri par poids) ---------");
//		Tamagotchi.citerTamaPlusGrand(listeTamas);
//		System.out.println();
//		

	}

}
