package batailleNavale;

public class JoueurAuto extends JoueurAvecGrille {
	private static int taille;
//	private int nbCoordJouees;
//	private Coordonnee[] CoordJouees;
	// private static final int Min = 0;

	// les Constructeurs
	public JoueurAuto(GrilleNavale g, String nom) {
		super(g, nom);
		taille = g.getTaille();
//		nbCoordJouees = 0;
//		CoordJouees = new Coordonnee[Max * Max]; // divisé par 2 ???
	}

	public JoueurAuto(GrilleNavale g) {
		super(g);
	}

	// les Methodes
	protected void retourAttaque(Coordonnee c, int etat) {
		if(etat == 1) 
			System.out.println("Vous avez touché un navire en "+ c +'\n');
		 if(etat == 2) 
			System.out.println("Vous avez coulé le navire en " + c +'\n');
		 if(etat == 3) 
			System.out.println("Vous avez tirez dans l'eau en " + c +'\n');
		 if(etat == 4) 
			System.out.println("WINNER : " + this.getNom());
	}
	
	protected void retourDefense(Coordonnee c, int etat) {
		if(etat == 1) 
			System.out.println("Vous avez été touché en "+ c +'\n');
		 if(etat == 2) 
			System.out.println("Votre navire a coulé en " + c +'\n');
		 if(etat == 3) 
			System.out.println("Le tir précédent est allé à l'eau en " + c +'\n');
		 if(etat == 4) 
			System.out.println("GAMEOVER : " + this.getNom());
	}

	// methodes supplémentaires

//	private boolean estDejaJoue(Coordonnee c) {
//		for (int i = 0; i == nbCoordJouees; i++) {
//			if (CoordJouees[i].equals(c)) {
//				return true;
//			}
//		}
//		return false;
//	}
//
//	private void ajouteDansEstDejaJoue(Coordonnee c) {
//		CoordJouees[nbCoordJouees] = c;
//		nbCoordJouees += 1;
//
//	}

	public Coordonnee choixAttaque() {
		int col = (int) (Math.random() * taille);
		int lig = (int) (Math.random() * taille);
		Coordonnee c = new Coordonnee(lig, col);
		
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrilleNavale g = new GrilleNavale(5,2);
		GrilleNavale g1 = new GrilleNavale(5,2);
//		JoueurTexte jt = new JoueurTexte(g, "Jean-Paul");
		JoueurAuto jt1 = new JoueurAuto(g, "Jean-Bernard");
		JoueurAuto jt2 = new JoueurAuto(g1, "Pierre");
		int []tab = {3, 2};
		g.placementAuto(tab);
		g1.placementAuto(tab);
		jt1.jouerAvec(jt2);
	}

}

