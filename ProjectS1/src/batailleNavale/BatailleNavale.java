package batailleNavale;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class BatailleNavale {
	private Joueur joueur1, joueur2;
	private int tailleGrille;

	private JFrame frmBatailleNavale;
	private JTextField textField;
	private JTextField txtJoueur_1;
	private JTextField txtJoueur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BatailleNavale window = new BatailleNavale();
					window.frmBatailleNavale.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BatailleNavale() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBatailleNavale = new JFrame();
		frmBatailleNavale.setTitle("Bataille Navale");
		frmBatailleNavale.setBounds(100, 100, 450, 357);
		frmBatailleNavale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frmBatailleNavale.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Taille de grille");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		frmBatailleNavale.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		textField.setText("10");
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		frmBatailleNavale.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Joueur 1");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		frmBatailleNavale.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nom :");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		frmBatailleNavale.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtJoueur_1 = new JTextField();
		txtJoueur_1.setText("Joueur 1");
		GridBagConstraints gbc_txtJoueur_1 = new GridBagConstraints();
		gbc_txtJoueur_1.insets = new Insets(0, 0, 5, 0);
		gbc_txtJoueur_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtJoueur_1.gridx = 1;
		gbc_txtJoueur_1.gridy = 2;
		frmBatailleNavale.getContentPane().add(txtJoueur_1, gbc_txtJoueur_1);
		txtJoueur_1.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Joueur graphique");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.gridwidth = 2;
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNewRadioButton.gridx = 0;
		gbc_rdbtnNewRadioButton.gridy = 3;
		frmBatailleNavale.getContentPane().add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Joueur Texte");
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.gridwidth = 2;
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNewRadioButton_1.gridx = 0;
		gbc_rdbtnNewRadioButton_1.gridy = 4;
		frmBatailleNavale.getContentPane().add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Joueur Auto");
		GridBagConstraints gbc_rdbtnNewRadioButton_2 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_2.gridwidth = 2;
		gbc_rdbtnNewRadioButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNewRadioButton_2.gridx = 0;
		gbc_rdbtnNewRadioButton_2.gridy = 5;
		frmBatailleNavale.getContentPane().add(rdbtnNewRadioButton_2, gbc_rdbtnNewRadioButton_2);
		
		JLabel lblJoueur = new JLabel("Joueur 2");
		GridBagConstraints gbc_lblJoueur = new GridBagConstraints();
		gbc_lblJoueur.insets = new Insets(0, 0, 5, 5);
		gbc_lblJoueur.gridx = 0;
		gbc_lblJoueur.gridy = 6;
		frmBatailleNavale.getContentPane().add(lblJoueur, gbc_lblJoueur);
		
		JLabel lblNewLabel_3 = new JLabel("Nom :");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 7;
		frmBatailleNavale.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		txtJoueur = new JTextField();
		txtJoueur.setText("Joueur 2");
		GridBagConstraints gbc_txtJoueur = new GridBagConstraints();
		gbc_txtJoueur.insets = new Insets(0, 0, 5, 0);
		gbc_txtJoueur.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtJoueur.gridx = 1;
		gbc_txtJoueur.gridy = 7;
		frmBatailleNavale.getContentPane().add(txtJoueur, gbc_txtJoueur);
		txtJoueur.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Joueur graphique");
		GridBagConstraints gbc_rdbtnNewRadioButton_3 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_3.gridwidth = 2;
		gbc_rdbtnNewRadioButton_3.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNewRadioButton_3.gridx = 0;
		gbc_rdbtnNewRadioButton_3.gridy = 8;
		frmBatailleNavale.getContentPane().add(rdbtnNewRadioButton_3, gbc_rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Joueur Texte");
		GridBagConstraints gbc_rdbtnNewRadioButton_4 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_4.gridwidth = 2;
		gbc_rdbtnNewRadioButton_4.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNewRadioButton_4.gridx = 0;
		gbc_rdbtnNewRadioButton_4.gridy = 9;
		frmBatailleNavale.getContentPane().add(rdbtnNewRadioButton_4, gbc_rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Joueur Auto");
		rdbtnNewRadioButton_5.setSelected(true);
		GridBagConstraints gbc_rdbtnNewRadioButton_5 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_5.gridwidth = 2;
		gbc_rdbtnNewRadioButton_5.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNewRadioButton_5.gridx = 0;
		gbc_rdbtnNewRadioButton_5.gridy = 10;
		frmBatailleNavale.getContentPane().add(rdbtnNewRadioButton_5, gbc_rdbtnNewRadioButton_5);
		
		JButton btnNewButton = new JButton("Lancer la partie");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 11;
		frmBatailleNavale.getContentPane().add(btnNewButton, gbc_btnNewButton);
	}
			
	private void demarrerPartie() {
		new Thread() {
			public void run() {
				joueur1.jouerAvec(joueur2);
			}
		}.start();
	}
}
