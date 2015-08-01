package IHM;

import java.awt.GridLayout;

import javax.swing.*;

import Controleur.ControleurAddJoueur;

public class addJoueur extends JFrame {
	
	private JLabel numero, nom;
	private JTextField numero2, nom2;
	private JButton confirmer;
	
	private MainWindows frame;
	
	public addJoueur(MainWindows frame){
		super();
		
		this.frame = frame;
		
		this.numero = new JLabel("Numéro : ");
		this.nom = new JLabel("Nom : ");
		this.numero2 = new JTextField();
		this.nom2 = new JTextField();
		
		this.confirmer = new JButton("Confirmer");
		this.confirmer.addActionListener(new ControleurAddJoueur(this.frame, this));
		
		
		JPanel principal = new JPanel();
		principal.setLayout(new GridLayout(3, 2));
		
		principal.add(numero);
		principal.add(numero2);
		principal.add(nom);
		principal.add(nom2);
		principal.add(confirmer);
		
		this.setContentPane(principal);
		this.setVisible(true);
		this.pack();
		
	}

	public int getNumero2() {
		return Integer.parseInt(numero2.getText());
	}

	public String getNom2() {
		return nom2.getText();
	}

}
