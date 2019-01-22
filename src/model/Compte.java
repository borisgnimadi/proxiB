package model;

public class Compte {

	String nom;
	String prenom;
Integer numero;
Double solde;
public Compte(String nom, String prenom, Integer numero, Double solde) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.numero = numero;
	this.solde = solde;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public Integer getNumero() {
	return numero;
}
public void setNumero(Integer numero) {
	this.numero = numero;
}
public Double getSolde() {
	return solde;
}
public void setSolde(Double solde) {
	this.solde = solde;
}


	
}
