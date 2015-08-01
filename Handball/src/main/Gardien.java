package main;

public class Gardien extends Joueur{


	private int nbarrets;
	
	
	public Gardien(int numero, Equipe equipe) {
		super(numero);
		this.nbarrets = 0;
	}
	
	public void arret(){
		this.nbarrets++;
	}

	public int getNbarrets() {
		return nbarrets;
	}


	
}
