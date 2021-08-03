package batailleNavale;

import batailleNavale.Coordonnee;

public abstract class TestCoordonneeMieux {

	public static void testConstructeur1() {
		System.out.print("Test du constructeur Coordonne(int, int) --> ");
		int lig = (int) (Math.random() * 26);
		int col = (int) (Math.random() * 26);
		Coordonnee c = new Coordonnee(lig, col);
		if (c.getLigne() != lig || c.getColonne() != col)
			System.out.println("Initialisation erronée pour Coordonnee(" + lig + "," + col + ")");
		// Levées d'exception
		try {
			lig = -1;
			c = new Coordonnee(lig, col);
			System.out.println("Exception non levée pour Coordonnee(" + lig + "," + col + ")");
		} catch (IllegalArgumentException e) {
		}
		try {
			lig = 26;
			c = new Coordonnee(lig, col);
			System.out.println("Exception non levée pour Coordonnee(" + lig + "," + col + ")");
		} catch (IllegalArgumentException e) {
		}
		try {
			lig = 0;
			col = -1;
			c = new Coordonnee(lig, col);
			System.out.println("Exception non levée pour Coordonnee(" + lig + "," + col + ")");
		} catch (IllegalArgumentException e) {
		}
		try {
			col = 26;
			c = new Coordonnee(lig, col);
			System.out.println("Exception non levée pour Coordonnee(" + lig + "," + col + ")");
		} catch (IllegalArgumentException e) {
		}
		System.out.println("Fin de test");
	}
	
	public static void testConstructeur2() {
		System.out.print("Test du constructeur Coordonne(String) --> ");
		char col = (char) (Math.random() * 26 + 'A');
		int lig = (int) (Math.random() * 26 + 1);
		String s = "" + col + lig;
		Coordonnee c = new Coordonnee(s);
		if (c.getColonne() != col - 'A' || c.getLigne() != lig - 1)
			System.out.println("Initialisation erronée pour Coordonnee(\"" + s + "\")");
		// Levées d'exception
		try {
			col = (char)('A'- 1);
			s = "" + col + lig;
			c = new Coordonnee(s);
			System.out.println("Exception non levée pour Coordonnee(\"" + s + "\")");
		} catch (IllegalArgumentException e) {
		}
		try {
			col = (char)('Z' + 1);
			s = "" + col + lig;
			c = new Coordonnee(s);
			System.out.println("Exception non levée pour Coordonnee(\"" + s + "\")");
		} catch (IllegalArgumentException e) {
		}
		try {
			col = 'A';
			lig = 0;
			s = "" + col + lig;
			c = new Coordonnee(s);
			System.out.println("Exception non levée pour Coordonnee(\"" + s + "\")");
		} catch (IllegalArgumentException e) {
		}
		try {
			lig = 27;
			s = "" + col + lig;
			c = new Coordonnee(s);
			System.out.println("Exception non levée pour Coordonnee(\"" + s + "\")");
		} catch (IllegalArgumentException e) {
		}
		try {
			s = "n'importe quelle chaîne";
			c = new Coordonnee(s);
			System.out.println("Exception non levée pour Coordonnee(\"" + s + "\")");
		} catch (IllegalArgumentException e) {
		}
		try {
			c = new Coordonnee(null);
			System.out.println("Exception non levée pour Coordonnee(null)");
		} catch (IllegalArgumentException e) {
		}
		System.out.println("Fin de test");
	}

	public static void main(String[] args) {
		testConstructeur1();
		testConstructeur2();
	}

}
