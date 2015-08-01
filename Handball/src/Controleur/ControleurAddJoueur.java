package Controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.Joueur;
import IHM.MainWindows;
import IHM.addJoueur;

public class ControleurAddJoueur implements ActionListener {
	
	private MainWindows frame;
	private addJoueur frame2;
	
	public ControleurAddJoueur(MainWindows frame, addJoueur frame2){
		this.frame = frame;
		this.frame2 = frame2;
	}
	

	public void actionPerformed(ActionEvent e) {
		this.frame.getModele1().addJoueur(new Joueur(this.frame2.getNumero2(), this.frame2.getNom2()));
		this.frame.pack();
	}

}
