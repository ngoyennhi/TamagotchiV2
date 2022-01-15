package tamagotchiV2;

import java.util.ArrayList;

public class MainTestTamagotchiV2 {

	public static void main(String[] args) {
		/**
		 * 	La premiere partie: jouer avec un seul Tamagotchi
		 */
		
		Tamagotchi heoTamagotchi = new Tamagotchi();

		// test1: affichage les donnees actualitees de Tamagotchi

		System.out.println("---------test1:affiche()----------");
		heoTamagotchi.affiche();
		System.out.println();

		// test2: apres avoir dormi pour gagner l'energie mais Tamagotchi a faim!

		System.out.println("---------test2:dormir()----------");
		heoTamagotchi.dormir();
		System.out.println();
		heoTamagotchi.affiche();
		System.out.println();

		// test3: Tamagotchi mange un petit peu et Tamagotchi a encore faim

		System.out.println("----------test3:manger() un peu ---------");
		heoTamagotchi.manger(1);
		System.out.println();
		heoTamagotchi.affiche();
		System.out.println();

		// test4: Tamagotchi mange suffisant

		System.out.println("----------test4:manger() suffisamment---------");
		heoTamagotchi.manger("full");
		System.out.println();
		heoTamagotchi.affiche();
		System.out.println();

		// test5: Tamagotchi bien joue et il va etre fatigue. :)

		System.out.println("----------test5:jouer() jusqu'a etre fatigue et envie de dormir---------");
		heoTamagotchi.jouer(9);
		System.out.println();
		heoTamagotchi.affiche();
		System.out.println();
		
		//avant continuer les tests suivants, votre Tamagochi a besoin de dormir et manger,svp
		System.out.println("----------repo entre les tests---------");
		heoTamagotchi.dormir();
		heoTamagotchi.manger("full");
		heoTamagotchi.affiche();
		System.out.println();
		
		//test6: Tamagochi va aux toilettes :)
		System.out.println("----------test6:faireWC()---------");
		heoTamagotchi.faireWC();
		heoTamagotchi.affiche();
		System.out.println();
		
		//test7: Tamagochi faire la douche après etre allé aux toilettes 
		System.out.println("----------test7:faireDoucher()---------");
		heoTamagotchi.faireDoucher();
		heoTamagotchi.affiche();
		System.out.println();
		
		/**
		 * 	commentaire des lignes de 12 à 69 après avoir bien testé La partie 1
		 */
		
		
		
		/**
		 * Partie 2: jouer avec les list de 3 Tamagotchis en même temps
		 */
		
//		// Demande d'saisir 3 Tamagotchis
//		ArrayList<Tamagotchi> listeTamas = new ArrayList<Tamagotchi>();
//		System.out.println("----------test8:Creer une liste qui contient 3 tamagotchis---------");
//		FamileTamagotchi.saisirTamas(listeTamas);
//		System.out.println();
//		
//		/*
//		 * Demande d'afficher la liste des dragons
//		 */
//		System.out.println("----------test9:Afficher tous les tamagotchis d'une liste ---------");
//		Tamagotchi.afficheList(listeTamas);
//		System.out.println();
//		
//		/*
//		 * Demande de rechercher un dragon par son nom, et afficher ses caractéristiques
//		 */
//		System.out.println("----------test10:Chercher un Tamagotchi par son nom d'une liste ---------");
//		FamileTamagotchi.rechercherTamaParNom(listeTamas, "(?i)Toto.*");
//		System.out.println();
//		
//		/*
//		 * Demande d'afficher le dragon plus GRAND et plus PETIT
//		 */	
//		//indiquer le dragon le plus petit
//		System.out.println("----------test11:Chercher un Tamagotchi qui est plus petit ( tri par poids) ---------");
//		Tamagotchi.citerTamaPlusPetit(listeTamas);
//		System.out.println();
//		//indiquer le dragon le plus grand
//		System.out.println("----------test12:Chercher un Tamagotchi qui est plus grand ( tri par poids) ---------");
//		Tamagotchi.citerTamaPlusGrand(listeTamas);
//		System.out.println();
//		
//		/**
//		 * Partie 3: jouer avec chaque Tamagochi dans la liste
//		 */
//		//ex: jouer avec le Tamagotchi qui a l'index 0 dans la liste.
//		listeTamas.get(0).dormir();
//		listeTamas.get(0).jouer(2);
		
		
		/**
		 * 	commentaire des lignes 79-116 après avoir bien testé La partie 2-3
		 */
		
		
	}

}
