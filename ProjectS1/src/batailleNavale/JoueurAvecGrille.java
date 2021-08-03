package batailleNavale;

public abstract class JoueurAvecGrille extends Joueur {
	private GrilleNavale grille;//attribut
	
	//Constructeur1 JouerAvecGrille
	public JoueurAvecGrille(GrilleNavale g, String nom) {
		super(g.getTaille(),nom);
		this.grille=g;
	}
	//Constructeur2 JouerAvecGrille
	public JoueurAvecGrille (GrilleNavale g) {
		super(g.getTaille());
		this.grille=g;
	}
	
	public GrilleNavale getGrille() {
		return grille;
	}
	
	//Methode defendre(Coordonnee c)
	public int defendre(Coordonnee c) {
		grille.recoitTir(c);
		if(grille.estCoule(c)) {
			if (grille.perdu())
				return GAMEOVER;
			return COULE;
		}
		if(grille.estALEau(c))
			return A_L_EAU;
		if (grille.estTouche(c))
			return TOUCHE;
		throw new RuntimeException ("La grille ne reçoit pas la coordonnée du tir");
	}

	public static void main(String[] args) {
		

	}

}
