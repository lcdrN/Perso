package Controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import IHM.CreerMatch;
import IHM.MainWindows;
import IHM.addJoueur;

public class ControleurOuvrir implements ActionListener {

	private MainWindows frame;
	private int fenetre;
		

	public ControleurOuvrir(MainWindows frame, int fenetre){
		this.frame = frame;
		this.fenetre = fenetre;
	}
	

	public void actionPerformed(ActionEvent e) {
		if(this.fenetre == 0)
		{new CreerMatch(this.frame);}
		if(this.fenetre == 1)
		{new addJoueur(this.frame);}
	}


}
