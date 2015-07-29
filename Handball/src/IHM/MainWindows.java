package IHM;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

import main.Match;
import Controleur.ControleurNouveauMatch;

public class MainWindows extends JFrame {
	
	private Match match;
	
	private JButton nouveaumatch, addjoueur;
	private Dimension dimButTool;
	
	public MainWindows(){
		super("Handball Gestion");
		
		
		
		nouveaumatch = new JButton("Créer un nouveau Match");
		addjoueur = new JButton("Ajouter un joueur");
		dimButTool = new Dimension(200, 30);
		
		//Controleur
		nouveaumatch.addActionListener(new ControleurNouveauMatch(this));
		//
		
		nouveaumatch.setPreferredSize(dimButTool);
		addjoueur.setPreferredSize(dimButTool);
		
		JPanel panelButTool = new JPanel();
		panelButTool.setLayout(new GridLayout(2, 1));
		panelButTool.add(nouveaumatch);
		panelButTool.add(addjoueur);
		
		JToolBar toolbar = new JToolBar();
		toolbar.setOrientation(1);
		toolbar.add(panelButTool);
		
		
		
		JPanel principal = new JPanel();
		principal.setLayout(new BorderLayout());
		principal.add(toolbar, BorderLayout.WEST);
		
		this.setContentPane(principal);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.pack();
		
				
		}
	
	 public static void main(String[] args){
		 new MainWindows();
	 }

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}
	

}
