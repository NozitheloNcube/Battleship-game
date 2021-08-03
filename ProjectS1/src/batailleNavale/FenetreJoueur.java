package batailleNavale;

import javax.swing.*;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;

public class FenetreJoueur extends JFrame {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
//	private JPanel contentPane;
	private GrilleGraphique grilleTirs;
	private GrilleNavaleGraphique grilleDefense;

	public FenetreJoueur() {

		this("Nom du joueur", 10);
		
	
	}
		

	public FenetreJoueur(String nom, int taille) {
		int[] tab = { 3, 2, 1, 2, 4, 5 };
		grilleTirs = new GrilleGraphique(taille);
		grilleDefense = new GrilleNavaleGraphique(taille);
		grilleDefense.placementAuto(tab);
		setTitle(nom);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel_1 = grilleTirs;
		panel_1.setBorder(new TitledBorder(null, "Grille de Tir", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panel_1);
		
		
		JPanel panel_2 =grilleDefense.getGrilleGraphique();
		panel_2.setBorder(new TitledBorder(null, "Grille de Defense", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panel_2);

		
	}

	public GrilleGraphique getGrilleTirs() {
		return this.grilleTirs;
	}

	public GrilleNavaleGraphique getGrilleDefense() {
		return this.grilleDefense;
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame fenetre = new FenetreJoueur();
				fenetre.pack();
				fenetre.setVisible(true);
			}
		});
	}

}
