package IHM;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

import main.Equipe;
import main.Match;
import Controleur.ControleurNouveauMatch;

public class MainWindows extends JFrame {
	
	private Match match;
	
	private JButton nouveaumatch, addjoueur;
	private Dimension dimButTool;
	
	//Panel score
	private JLabel equipe1, equipe2, score1, score2;
	//
	
	public MainWindows(){
		super("Handball Gestion");
		
		match = new Match(new Equipe("Visiteur"), new Equipe("Local") , 0);
		
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
		
		
		//Panel Central
		JPanel central = new JPanel();
		central.setLayout(new BorderLayout());
		
		
		
		JPanel score = new JPanel();
		score.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		equipe1 = new JLabel();
		equipe1.setText(this.match.nomEquipe1() + " : ");
		score1 = new JLabel();
		score1.setText(Integer.toString(this.match.score1()) + "  -  ");
		score2 = new JLabel();
		score2.setText(Integer.toString(this.match.score2()));
		equipe2 = new JLabel();
		equipe2.setText(" : " + this.match.nomEquipe2());
		
		score.add(equipe1);
		score.add(score1);
		score.add(score2);
		score.add(equipe2);
		
		central.add(score, BorderLayout.NORTH);
		
		//
		
		
		
		
		
		JPanel principal = new JPanel();
		principal.setLayout(new BorderLayout());
		principal.add(toolbar, BorderLayout.WEST);
		principal.add(central, BorderLayout.CENTER);
		
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

	

	public void setEquipe1(String equipe1) {
		this.equipe1.setText(equipe1 + " : ");
	}

	public void setEquipe2(String equipe2) {
		this.equipe2.setText(" : " + equipe2);
	}


	public void setScore1(int score1) {
		this.score1.setText(Integer.toString(score1) + "  -  ");
	}


	public void setScore2(int score2) {
		this.score2.setText(Integer.toString(score2));
	}
	
	
	

}
