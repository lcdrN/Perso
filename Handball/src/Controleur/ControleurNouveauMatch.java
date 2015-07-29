package Controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import IHM.CreerMatch;
import IHM.MainWindows;

public class ControleurNouveauMatch implements ActionListener {
	
	private MainWindows frame;
	
	public ControleurNouveauMatch(MainWindows frame){
		this.frame = frame;
	}
	

	public void actionPerformed(ActionEvent e) {
		new CreerMatch(this.frame);		
	}

}
