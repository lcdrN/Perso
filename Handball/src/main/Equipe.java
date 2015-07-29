package main;

import java.util.ArrayList;

public class Equipe {
	
	private String nom;
	private ArrayList<Joueur> Joueur;
	private int nbpoint;
	
	
	public Equipe(String nom){
		this.nom = nom;
		this.Joueur = new ArrayList();
	}
	
	//Ajouter un joueur a l'équipe
	public void addJoueur(Joueur j){
		this.Joueur.add(j);
	}
	
	public int getNbPoint(){
		int i = 0;
		for(int y = 0; y < this.Joueur.size(); y++){
			i = i + this.Joueur.get(y).nbButTotal();
		}
	  return i;
	}
	
	
	
	public ArrayList getJoueur() {
		return Joueur;
	}
	
	public String toString(){
		return this.nom;
	}




	

}
