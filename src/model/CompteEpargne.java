package model;

import java.util.Date;

public class CompteEpargne {

	Double soldeCompteEpargne;
	Integer numCompteCourant ;;
	
	
	public Double getSoldeCompteCourant() {
		return soldeCompteEpargne;
	}
	public void setSoldeCompteCourant(Double soldeCompteCourant) {
		this.soldeCompteEpargne = soldeCompteCourant;
	}
	
	public Integer getNumCompteCourant() {
		return numCompteCourant;
	}
	public void setNumCompteCourant(Integer numCompteCourant) {
		this.numCompteCourant = numCompteCourant;
	}
	
	

	
	public CompteEpargne(Integer numCompteCourant, Double soldeCompteEpargne) {
		super();
		this.soldeCompteEpargne = soldeCompteEpargne;
		this.numCompteCourant = numCompteCourant;
	}
	public static int CreateCompteEpargne() {
		return (int)Math.random() * 1000000000;
	}



}


