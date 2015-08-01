package main;

import java.util.ArrayList;

public class Joueur {
	
	private int numero;
	private String nom;
	private ArrayList faute; //Minute de la faute
	private ArrayList tirs; // 0 = Tir sans but; 1 = Tir avec but; 2=penalty sans but; 3 = pennalty avec but;
	private ArrayList cartons; //Carton jaune ; 
	private Boolean cartonrouge;
	
	public Joueur(int numero){
		this.setNumero(numero);
		this.tirs = new ArrayList();
		this.faute = new ArrayList();
		this.cartons= new ArrayList();
	}
	
	public Joueur(int numero, String nom){
		this(numero);
		this.nom = nom;
	}
	

	//Ajoute tir + Résultat du tir
	public void tir(int chiffre){
		this.tirs.add(chiffre);	
	}
	
	//Retourne le nombre de tirs total
	public int nbTirTotal(){
		return this.tirs.size();
	}
	
	//Retourne le nombre de but total
	public int nbButTotal(){
		int y = 0;
		for(int i = 0; i < this.tirs.size(); i++){
			if(this.tirs.get(i).equals(1) || this.tirs.get(i).equals(3)){
				y++;
			}
		}
		return y;
	}
	
	
	//Ajoute un carton
	public void carton(){
		this.cartons.add(1);
	}
	
	//Ajoute faute
	public void ajouterfaute(){
		if(this.faute.size() >= 2){
			this.cartonrouge = true;
			this.faute.add(1);
		}
		else {
			this.faute.add(1);
		}
	}
	

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getFautes(){
		return this.faute.size();
	}
	
	public int nbJaunes(){
		return this.cartons.size();
	}
	
	
	
	
	

}
