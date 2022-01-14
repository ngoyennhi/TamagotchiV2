package tamagotchiV2;

public class Tamagotchi {
	// champs prives representant les attributes
	private String nom; // le nom de Tamagotchi
	private int energie; // sa energie
	private float poids; // son poids en kg
	private Boolean status; // son status de vie (vie or mort)

	/**
	 * Appel au constructeur par les params de Tamagochi
	 * 
	 */
	public Tamagotchi(String nom, int energie, float poids, Boolean status) {
		this.nom = nom;
		this.energie = energie;
		this.poids = poids;
		this.status = status;

	}

	/**
	 * Appel au constructeur par default de Tamagochi
	 * 
	 */
	public Tamagotchi() {
		this.nom = "toto";
		this.energie = 1;
		this.poids = 1;
		this.status = true;

	}

	// getter et setter
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEnergie() {
		return energie;
	}

	public void setEnergie(int energie) {
		this.energie = energie;
	}

	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * Tamagochi augumente sa poids quand il mange chaque fois
	 * 
	 * @param fois
	 */
	public void manger(int fois) {
		if (status == true) {
			// son poids actuel
			poids = getPoids();
			// son poids après avoir mangé
			poids = poids + fois;

			if (poids > 0 && poids <= 15) {
				if (poids <= 3) {
					System.out.println("Votre tamagotchi a encore faim ");
				} else {
					System.out.println("Yummy! Votre tamagotchi a bien mangé.");
				}
			} else {
				System.out.println("Trop mangé! Votre tamagochi meurt");
				// Tamagochi murt
				setStatus(false);
			}
		} else {
			System.out.println("Quel dommage, votre Tamagotchi est mort! Creer un autre, stp");
		}
	}

	public void manger(String full) {
		if (status == true) {
			if (full.matches("full")) {
				poids = 15;
				System.out.println("Yummy! Votre tamagotchi a bien mangé.");
			} else {
				System.out.println("Vieullez saisir encore le mot clé 'full',svp!");
			}
		} else {
			System.out.println("Quel dommage, votre Tamagotchi est mort! Creer un autre, stp");
		}
	}

	/**
	 * Tamagotchi dort pour recharger sa energie
	 */
	public void dormir() {
		if (status == true) {
			setEnergie(10);
			setPoids(1); // quand Tamagotchi dort, il perd du poids.
			System.out.println("Cool! Votre tamagotchi a bien dormi.( Plein d'énergie )");
			System.out.println("Votre tamagotchi a trop faim ");
			// Tamagochi vie
			setStatus(true);
		} else {
			System.out.println("Quel dommage, votre Tamagotchi est mort! Creer un autre, stp");
		}
	}

	/**
	 * Tamagotchi perd sa energie quand il joue
	 * 
	 * @param fois
	 */
	public void jouer(int fois) {
		if (status == true) {
			energie = getEnergie();
			energie = energie - fois;
			if (energie < 0) {
				System.out.println("Votre tamagotchi n'a plus d'energie. Il meurt ");
				setEnergie(0);
				// Tamagochi murt
				setStatus(false);
			} else if (energie <= 1) {
				System.out.println("Très fatigué. Votre tamagotchi a besoin de dormir");
			} else {
				System.out.println("Bien joué!L'énergie de votre tamagochi reste: " + energie);
				// Tamagochi vie
				setStatus(true);
			}
		} else {
			System.out.println("Quel dommage, votre Tamagotchi est mort! Creer un autre, stp");
		}
	}

	/**
	 * aller aux toilettes
	 */
	public void faireWC() {
		if (status == true) {
			poids = poids / 3;
			System.out.println("C'est très bien! Votre tamagotchi a besoin de doucher :) toute de suite, svp");
		} else {
			System.out.println("Quel dommage, votre Tamagotchi est mort! Creer un autre, stp");
		}
	}

	/**
	 * doucher
	 */
	public void faireDoucher() {
		if (status == true) {
			System.out.println("C'est super! Merci :) ");
		} else {
			System.out.println("Quel dommage, votre Tamagotchi est mort! Creer un autre, stp");
		}
	}

	/**
	 * Affichage les infos actualités
	 */
	public void affiche() {
		System.out.println("Voici les infos actualitées de votre Tamagotchi: ");
		System.out.println("Son nom: " + getNom());
		System.out.println("Sa energie: " + getEnergie());
		System.out.println("Son poids: " + getPoids());
		if (getStatus() == true) {
			System.out.println("Votre Tamagotchi vie");
		} else {
			System.out.println("Votre Tamagotchi est mort");
		}
	}
}
