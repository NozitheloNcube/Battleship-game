package batailleNavale;

import javax.swing.*;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;

public class FenetreJoueur extends JFrame {
//	private JPanel contentPane;
	private GrilleGraphique grilleTirs;
	private GrilleNavaleGraphique grilleDefense;

	public FenetreJoueur() {
	
		this("Nom du joueur", 10);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_1 = grilleDefense.getGrilleGraphique();////new JPanel();
		TitledBorder panel = null;
		panel.setBorder(new TitledBorder(null, "Grille de Défense", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panel_1);
		
		
		JPanel panel1 = grilleTirs;//new JPanel();
		panel1.setBorder(new TitledBorder(null, "Grille de Tir", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panel1);
	
		grilleTirs = new GrilleGraphique(10);
		
		//
	}

	public FenetreJoueur(String nom, int taille) {

		int[] tab = { 3, 2, 1, 2, 4, 5 };
		grilleDefense = new GrilleNavaleGraphique(taille);
		grilleDefense.placementAuto(tab);
		setTitle(nom);
	}

	public GrilleGraphique getGrilleTirs() {
             return this.grilleTirs;
	}
	
	public GrilleNavaleGraphique getGrilleDefense() {
		return this.grilleDefense;
	}
	
	public static void main(String [] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	JFrame fenetre = new FenetreJoueur();
            	fenetre.pack();
        		fenetre.setVisible(true);
            }
            });
	}
	

	

}