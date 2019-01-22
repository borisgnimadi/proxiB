package model;

public class CompteCourant {
	Double soldeCompteCourant;
	Integer numCompteCourant ;;
	
	
	public Double getSoldeCompteCourant() {
		return soldeCompteCourant;
	}
	public void setSoldeCompteCourant(Double soldeCompteCourant) {
		this.soldeCompteCourant = soldeCompteCourant;
	}
	
	public Integer getNumCompteCourant() {
		return numCompteCourant;
	}
	public void setNumCompteCourant(Integer numCompteCourant) {
		this.numCompteCourant = numCompteCourant;
	}
	
	
	public CompteCourant(Integer numCompteCourant, Double soldeCompteCourant) {
		this.soldeCompteCourant = soldeCompteCourant;
		this.numCompteCourant = numCompteCourant;
	}
	
	public static int CreateCompteCourant() {
		return (int)Math.random() * 100000000;
	}




}


