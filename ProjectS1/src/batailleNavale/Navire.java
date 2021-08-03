package batailleNavale;

public class Navire {
	private Coordonnee debut;
	private Coordonnee fin;
	private Coordonnee[] partiesTouchees;
	private int nbTouchees;

	public Navire(Coordonnee debut, int longueur, boolean estVertical) {
		this.debut = debut;
		int ligne = 0;
		int colonne = 0;
		
		if (estVertical) {
			ligne = this.debut.getLigne() + longueur - 1;
			this.fin = new Coordonnee(ligne, this.debut.getColonne());
		} else {
			colonne = this.debut.getColonne() + longueur - 1;
			this.fin = new Coordonnee(this.debut.getLigne(), colonne);
		}
		partiesTouchees = new Coordonnee[longueur];
		nbTouchees = 0 ;
	}

	public String toString() {
		int dgl = this.debut.getLigne();
		int fgl = this.fin.getLigne();
		int dgc = this.debut.getColonne();
		int fgc = this.fin.getColonne();
		String ch = "";
		if (dgl == fgl) {
			ch = "Navire" + "(" + this.debut + ", " + (1 + fgc - dgc) + "," + " horizontal" + ")";
			return ch;
		}
		ch = "Navire" + "(" + this.debut + ", " + (1 + fgl - dgl) + "," + " horizontal" + ")";
		return ch;
	}

	public Coordonnee getDebut() {
		return this.debut;
	}

	public Coordonnee getFin() {
		return this.fin;
	}

	public boolean contient(Coordonnee c) {
		int dl = this.debut.getLigne();
		int fl = this.fin.getLigne();
		int dc = this.debut.getColonne();
		int fc = this.fin.getColonne();
		int cl = c.getLigne();
		int cc = c.getColonne();
		
		if ((dc <= cc && cc <= fc) && (dl <= cl && cl <= fl )){
			return true;
		}
		return false;
	}

	// [5 ; 10] [11 ; 15]
	// Ils chevauchent sur une des deux dimensions etqu'ils se touchent sur l'autre
	public boolean touche(Navire n) {
		int cd = this.debut.getColonne();
		int ld = this.debut.getLigne();
		int cf = this.fin.getColonne();
		int lf = this.fin.getLigne();
		int cdn = n.debut.getColonne();
		int ldn = n.debut.getLigne();
		int cfn = n.fin.getColonne();
		int lfn = n.fin.getLigne();
		
		if (!this.chevauche(n)) {
			if (((!(cf < cdn || cfn < cd)) && (lf + 1 == ldn || lfn + 1 == ld)) || (!(lf < ldn || lfn < ld) && (cf + 1 == cdn || cfn + 1 == cd))) {
				return true;
			}
			return false;
		}
		return this.chevauche(n);
	}

	// [d1 ; f1] [d2 ; f2] -> condition
	// [5 ; 10] [7 ; 15]
	// [(5,1) ; (10,1)] [(7,1) ; (15,1)]
	// [5 ; 10] [7 ; 15] et aussi comparer [1 ;1] [1; 1]
	public boolean chevauche(Navire n) {
		int cd = this.debut.getColonne();
		int ld = this.debut.getLigne();
		int cf = this.fin.getColonne();
		int lf = this.fin.getLigne();
		int cdn = n.debut.getColonne();
		int ldn = n.debut.getLigne();
		int cfn = n.fin.getColonne();
		int lfn = n.fin.getLigne();

		if (!((cf < cdn || cfn < cd) || (lf < ldn || lfn < ld))) {
			return true;
		}

		return false;
	}
	
	public boolean recoitTir(Coordonnee c) {
		if (this.contient(c) && !this.estTouche(c)) {
			this.partiesTouchees[nbTouchees] = c;
			nbTouchees += 1;
			return true;
		}
		return false;
	}

	public boolean estTouche(Coordonnee c) {
		for (int i = 0 ; i < nbTouchees; i++) {
			if (this.partiesTouchees[i].equals(c))
				return true;
		}
		return false;
	}

	public boolean estTouche() {
		if (nbTouchees > 0)
			return true;
		return false;
	}

	public boolean estCoule() {
		if (nbTouchees == this.partiesTouchees.length)
			return true;
		return false;
	}

	public static void main(String[] args) {
//		Navire n1 = new Navire(new Coordonnee(1, 1), 5, true);
//		System.out.println("" + n1.debut + " " + n1.fin);
//		Navire n2 = new Navire(new Coordonnee(2, 1), 6, true);
//		System.out.println("" + n2.debut + " " + n2.fin);
//		System.out.println(n2.chevauche(n1));
//		Navire n3 = new Navire(new Coordonnee(1, 0), 5, false);
//		System.out.println("" + n3.debut + " " + n3.fin);
//		Navire n4 = new Navire(new Coordonnee(1, 1), 5, false);
//		System.out.println("" + n4.debut + " " + n4.fin);
//		System.out.println(n4.chevauche(n3));
//		Navire n5 = new Navire(new Coordonnee(1, 1), 4, false);
//		System.out.println("" + n5.debut + " " + n5.fin);
//		Navire n6 = new Navire(new Coordonnee(0, 2), 3, true);
//		System.out.println("" + n6.debut + " " + n6.fin);
//		System.out.println(n6.touche(n5));
//		Navire n7 = new Navire(new Coordonnee(1, 1), 5, true);
//		System.out.println("" + n7.debut + " " + n7.fin);
//		Navire n8 = new Navire(new Coordonnee(2, 0), 3, true);
//		System.out.println("" + n8.debut + " " + n8.fin);
//		System.out.println(n7.touche(n8));
//		Navire n9 = new Navire(new Coordonnee(1, 0), 3, false);
//		System.out.println("" + n9.debut + " " + n9.fin);
//		Navire n10 = new Navire(new Coordonnee(2, 1), 3, false);
//		System.out.println("" + n10.debut + " " + n10.fin);
//		System.out.println(n9.touche(n10));
//		Navire n11 = new Navire(new Coordonnee(0, 2), 3, false);
//		System.out.println("" + n11.debut + " " + n11.fin);
//		System.out.println(n11.touche(n10));
//		Navire n12 = new Navire(new Coordonnee(1, 2), 3, true);
//		System.out.println("" + n12.debut + " " + n12.fin);
//    	System.out.println(n12.touche(n11));
//		Coordonnee tir = new Coordonnee(1,2);
//		Coordonnee tir1 = new Coordonnee(2,2);
//		Coordonnee tir2 = new Coordonnee(3,2);
//		System.out.println(n12.recoitTir(tir));
//		System.out.println(n12.recoitTir(tir1));
//		System.out.println(n12.recoitTir(tir2));
//		System.out.println(n12.estCoule());
//		System.out.println(n12.nbTouchees);
		Navire n13 = new Navire(new Coordonnee("N15"), 3, false);
		Navire n14 = new Navire(new Coordonnee("P12"), 4, false);
		System.out.println("" + n13.debut + " " + n13.fin);
		System.out.println("" + n14.debut + " " + n14.fin);
//		System.out.println(n13.recoitTir(new Coordonnee("L5")));
		System.out.println(n14.touche(n13));
	}
}
