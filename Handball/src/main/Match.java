package main;

public class Match {

	private Equipe equipe1;
	private Equipe equipe2;
	private int temps;
	
	public Match(Equipe equipe1, Equipe equipe2, int temps){
		this.equipe1 = equipe1;
		this.equipe2 = equipe2;
		this.temps = temps;
	}
	
	public String nomEquipe1(){
		return this.equipe1.toString();
	}
	
	public String nomEquipe2(){
		return this.equipe2.toString();
	}
	
	public int score1(){
		return this.equipe1.getNbPoint();
	}
	
	public int score2(){
		return this.equipe2.getNbPoint();
	}
	
	
	
}
