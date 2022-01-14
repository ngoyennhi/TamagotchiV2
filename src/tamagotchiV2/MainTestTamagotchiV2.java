package tamagotchiV2;

public class MainTestTamagotchiV2 {

	public static void main(String[] args) {

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
		System.out.println("----------test5:faireWC()---------");
		heoTamagotchi.faireWC();
		heoTamagotchi.affiche();
		System.out.println();
		
		//test7: Tamagochi faire la douche après etre allé aux toilettes 
		System.out.println("----------test6:faireDoucher()---------");
		heoTamagotchi.faireDoucher();
		heoTamagotchi.affiche();
		System.out.println();
		
		
	}

}
