package batailleNavale;

public abstract class Joueur {
	
	public final static int TOUCHE = 1;
	public final static int COULE = 2;
	public final static int A_L_EAU = 3;
	public final static int GAMEOVER = 4;
	
	private Joueur adversaire;
	private int tailleGrille;
	private String nom;
	
	public Joueur(int tailleGrille, String nom) {
		this.tailleGrille = tailleGrille;
		this.nom = nom;
		if (this.nom == null)
			throw new IllegalArgumentException("");//Null pointer exception.
	}
	
	public Joueur(int tailleGrille) {
		this.tailleGrille = tailleGrille;
	}
	
	public int getTailleGrille() {
		return this.tailleGrille;
	}

    public String getNom() {
    return this.nom;

    }
    
    public void jouerAvec(Joueur j) {
    	j.adversaire = this;
    	adversaire = j;
    	deroulementJeu(this, j); //methode suivante définie par hypothèse
    }
    
    private static void deroulementJeu(Joueur attaquant, Joueur defenseur) {
    	int res = 0;
    	while (res != GAMEOVER) {
    	   Coordonnee c = attaquant.choixAttaque();
    	   res = defenseur.defendre(c);
    	   attaquant.retourAttaque(c, res);
    	   defenseur.retourDefense(c, res);
    	   Joueur x = attaquant;
    	   attaquant = defenseur; 
    	   defenseur = x;
    	}
    	
   }

    protected abstract void retourAttaque(Coordonnee c, int etat);
	protected abstract void retourDefense(Coordonnee c, int etat);
	public abstract Coordonnee choixAttaque();
	public abstract int defendre(Coordonnee c);
    
	
	public static void main(String[] args) {

	}

}
