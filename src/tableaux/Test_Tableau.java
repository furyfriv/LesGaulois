package tableaux;

public class Test_Tableau {
	public static void main(String[] args) {
		int[] tableauEntiers = { 5, 7, 9, 6, 2, 3, 4 };
		String[] tableauChaines = new String[5];
		System.out.println(tableauEntiers);
		for (int entier : tableauEntiers) {
			System.out.print(entier + " ");
		}

		System.out.println();

		for (int i = 0; i < tableauEntiers.length; i++) {
			int entier = tableauEntiers[i];
			System.out.print(entier);
			if (i < tableauEntiers.length - 1) {
				System.out.print(", ");

			}

		}
		System.out.println();
		for (String chaine : tableauChaines) {
			System.out.print(chaine + " ");
		}

		int nbChaines = 0;
		tableauChaines[nbChaines] = "Hello";
		nbChaines++;
		tableauChaines[nbChaines] = "World";
		nbChaines++;
		System.out.println();
		for (int i = 0; i < nbChaines; i++) {
			System.out.print(tableauChaines[i] + " ");

		}
		System.out.println();
		tableauChaines[3] = " !";
		for (String chaine : tableauChaines) {
			if (chaine != null) {
				System.out.print(chaine + " ");

			}

		}

	}

}
