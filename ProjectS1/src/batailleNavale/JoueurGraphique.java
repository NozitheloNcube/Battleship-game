package batailleNavale;

import java.awt.Color;

import javax.swing.JOptionPane;

public class JoueurGraphique extends JoueurAvecGrille {
	private GrilleGraphique grilleTirs;

//	GrilleNavaleGraphique grilleDefense extends GrilleNavale;
//	GrilleGraphique grilleTirs extends JButton
//	JoueurGraphique extends JoueurAvecGrille
	public JoueurGraphique(GrilleNavaleGraphique grilleDefense, GrilleGraphique grilleTirs, String nom) {
		super(grilleDefense,nom);
		grilleDefense.getGrilleGraphique().setClicActive(false);
		this.grilleTirs = grilleTirs;

	}

	public JoueurGraphique(GrilleNavaleGraphique grilleDefense, GrilleGraphique grilleTirs) {
		super(grilleDefense);
		grilleDefense.getGrilleGraphique().setClicActive(false);
		this.grilleTirs = grilleTirs;
	}

	public Coordonnee choisirAttaque() {
		Coordonnee c = this.choisirAttaque();
		return c;
	}

	public void retourDefense(Coordonnee c, int etat) {
		Color couleur = etat == A_L_EAU ? Color.BLUE : Color.RED;
		grilleTirs.colorie(c, couleur);
		switch (etat) {
		case TOUCHE:
			JOptionPane.showMessageDialog(grilleTirs, "un de vos navire a été touché en " + c);
			break;
		case COULE:
			JOptionPane.showMessageDialog(grilleTirs, "un de vos navire a été coulé  " + c);
			break;
		case GAMEOVER:
			JOptionPane.showMessageDialog(grilleTirs, "Votre ennemie a gagné !!!1 ");
			break;
		}
	}

	public void retourAttaque(Coordonnee c, int etat) {
		Color couleur = etat == A_L_EAU ? Color.BLUE : Color.RED;
		grilleTirs.colorie(c, couleur);
		switch (etat) {
		case TOUCHE:
			JOptionPane.showMessageDialog(grilleTirs, "Vous avez touché un navire en " + c);
			break;
		case COULE:
			JOptionPane.showMessageDialog(grilleTirs, "Vous avez coule un navire en " + c);
			break;
		case GAMEOVER:
			JOptionPane.showMessageDialog(grilleTirs, "Vous avez gagne !!!1 ");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Coordonnee choixAttaque() {
		// TODO Auto-generated method stub
		return null;
	}

}
