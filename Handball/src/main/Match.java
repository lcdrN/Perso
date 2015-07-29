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
	
	public String toString(){
		return this.equipe1.toString();
	}
	
	
	
}
