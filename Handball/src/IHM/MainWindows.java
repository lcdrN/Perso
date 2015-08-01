package IHM;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.*;

import main.Equipe;
import main.Match;
import Controleur.ControleurOuvrir;

public class MainWindows extends JFrame {
	
	private Match match;
	
	private JButton nouveaumatch, addjoueur;
	private Dimension dimButTool;
	private ModelTable modele1, modele2;
	
	private Object donnees[][] = {{null, null, null, null, null}};
	private final String[] titres = {"Numéro", "Nom", "Nombre Buts", "Nombres 2mins", "Nombre Jaune"};
	
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
		nouveaumatch.addActionListener(new ControleurOuvrir(this, 0));
		addjoueur.addActionListener(new ControleurOuvrir(this, 1));
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
		
		
		
		equipe1 = new JLabel("Visiteurs : ");
		score1 = new JLabel("0 - ");
		score2 = new JLabel("0");
		equipe2 = new JLabel(": Locaux");
		
		score.add(equipe1);
		score.add(score1);
		score.add(score2);
		score.add(equipe2);
		
		// JTable + Panel
		JPanel equipe1liste = new JPanel();
		equipe1liste.setLayout(new BorderLayout());
		JTable listeequipe1 = new JTable(this.modele1 = new ModelTable());
		equipe1liste.add(listeequipe1.getTableHeader(), BorderLayout.NORTH);
		equipe1liste.add(listeequipe1, BorderLayout.CENTER);
		//
		
		
		
		
		central.add(equipe1liste, BorderLayout.CENTER);
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

	public ModelTable getModele1() {
		return modele1;
	}

	public ModelTable setModele(ModelTable modele) {
		this.modele1 = modele;
		return modele;
	}
	
	
	

}
