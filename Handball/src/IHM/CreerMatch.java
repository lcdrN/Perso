package IHM;

import java.awt.GridLayout;

import javax.swing.*;

import Controleur.CreerNouveauMatch2;

public class CreerMatch extends JFrame {
	
	private JTextField equipe1, equipe2, temps;
	private JLabel txtEquipe1, txtEquipe2, txtTemps;
	private JButton confirmer;
	
	private MainWindows frame;
	
	public CreerMatch(MainWindows frame){
		super("Créer Match");
		
		this.frame = frame;
		
		JPanel principal = new JPanel();
		principal.setLayout(new GridLayout(4, 2));
		
		equipe1 = new JTextField("Nom Equipe 1");
		equipe2 = new JTextField("Nom Equipe 2");
		temps = new JTextField("Nombre minutes");
		
		txtEquipe1 = new JLabel("Equipe 1 : ");
		txtEquipe2 = new JLabel("Equipe 2 : ");
		txtTemps = new JLabel("Temps Match : ");
		
		confirmer = new JButton("Confirmer");
		
		//Controleur
		confirmer.addActionListener(new CreerNouveauMatch2(this, frame));
		//
		
		principal.add(txtEquipe1);
		principal.add(equipe1);
		principal.add(txtEquipe2);
		principal.add(equipe2);
		principal.add(txtTemps);
		principal.add(temps);
		
		principal.add(confirmer);
		
		
		
		this.setContentPane(principal);
		this.setVisible(true);
		this.pack();
		
		
		
	}


	public JTextField getEquipe1() {
		return equipe1;
	}

	public JTextField getEquipe2() {
		return equipe2;
	}

	public JTextField getTemps() {
		return temps;
	}
	
	
	

}
