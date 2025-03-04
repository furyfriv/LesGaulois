package personnages;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private int NB_VILLAGEOIS_MAX;
	private Gaulois[] villageois;
	private Gaulois chef;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbVillageois() {
		return nbVillageois;
	}

	public void setNbVillageois(int nbVillageois) {
		this.nbVillageois = nbVillageois;
	}

	public Village(String nom, int nbVillageois, int nB_VILLAGEOIS_MAX, Gaulois chef) {
		this.nom = nom;
		this.nbVillageois = nbVillageois;
		NB_VILLAGEOIS_MAX = nB_VILLAGEOIS_MAX;
		villageois = new Gaulois[NB_VILLAGEOIS_MAX];
	}

	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;

	}

	public Gaulois trouverVillageois(int indice_villageois) {
		if (indice_villageois > nbVillageois) {
			System.out.println("Il n'ya pas autant d'habitant dans notre village !");
			return null;
		} else {
			return (villageois[indice_villageois]);
		}

	}

	public void afficherVillageois(Village village, Gaulois chef) {
		System.out.println(
				"Dans le village " + village.nom + " du chef " + village.chef + " vivent les légendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i]);

		}

	}

	public static void main(String[] args) {
		Gaulois abraracourixGaulois = new Gaulois("Abraracourix", 6);
		Village village1 = new Village("Village des irréductible", 0, 30, abraracourixGaulois);
		Gaulois gaulois = village1.trouverVillageois(30);
		Gaulois asterixGaulois = new Gaulois("Astèrix", 8);
		village1.ajouterVillageois(asterixGaulois);

		Gaulois gaulois1 = village1.trouverVillageois(0);
		System.out.println(gaulois1);
		gaulois1 = village1.trouverVillageois(1);
		System.out.println(gaulois1);

		village1.afficherVillageois(village1, gaulois1);

	}

}
