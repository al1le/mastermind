package model;

public enum Couleur {
	ROUGE("R"),
	JAUNE("J"),
	BLEU("B"),
	ORANGE("O"),
	VERT("V"),
	NOIR("N");
	
	private String name = "";
	   
	//Constructeur
	Couleur(String name){
	   this.name = name;
	}
	   
	public String toString(){
	  return name;
	}
}
