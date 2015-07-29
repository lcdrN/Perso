package Controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.Equipe;
import main.Match;
import IHM.CreerMatch;
import IHM.MainWindows;

public class CreerNouveauMatch2 implements ActionListener {
	
	private CreerMatch frame;
	private MainWindows frame2;

	public CreerNouveauMatch2(CreerMatch frame, MainWindows frame2){
		this.frame = frame;
		this.frame2 = frame2;
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		Equipe e1 = new Equipe(this.frame.getEquipe1().getText());
		Equipe e2 = new Equipe(this.frame.getEquipe2().getText());
		Match m = new Match(e1, e2, Integer.parseInt(this.frame.getTemps().getText()));
		this.frame2.setMatch(m);
		this.frame2.setEquipe1(m.nomEquipe1());
		this.frame2.setEquipe2(m.nomEquipe2());
		this.frame2.pack();
	}

}
