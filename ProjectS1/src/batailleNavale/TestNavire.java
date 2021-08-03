package tests;

import tests.Navire;

public abstract class TestNavire {
	public static void testConstructeurNavire() {
		System.out.println("Test du Constructeur Navire(Coordonnee debut, int longueur,boolean estVertical) ");

		Navire n = new Navire(new Coordonnee("A3"), 4, true);
		System.out.println(n);
		
		if (n.getDebut() > n.getFin() ) {
			System.out.println("Le debut doit etre inferieur a la fin");
		}
		if (n.getFin() - n.getDebut() == 0) { // longueur
			System.out.println("la longueur doit etre superieur a 0");
		}

		if ((n.getDebut().getLigne() != n.getFin().getLigne()) && (n.getDebut().getColonne() != n.getFin().getColonne())) {// est vertical is neither true nor false
			System.out.println("Votre navire est diagonal.");
		}
		try {
			n.toString("");  // string method
			System.out.println("Exception non levée pour le string representant this ");
		} catch (IllegalArgumentException e) {

		}
		if ((c > n.getFin()) && (n.contient(c) == true) {//contient
			System.out.println("n ne contient pas c");
		}
		if((c <= n.getFin()) && (c >= n.getDebut())
				if(n.contien(c) == true){
			System.out.println("Pass");
		}else {
			System.out.println("n contient c");
		}
		if((c < n.getDebut()) && (n.contint(c) == true) ) {
			System.out.println("n ne contient pas c");
		}
		 Navire m = new Navire(new Coordonnee("A4"), 4, true);// touch
		if ((n.getDebut().getColonne() == m.getDebut().getColonne()) && (n.getFin().getColonne() == m.getFin().getColonne())) {
			if(m.touche(n) == false)
				System.out.println("m et n sont adjacent");
		}
			

	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
