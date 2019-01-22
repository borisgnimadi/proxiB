package model;

import java.lang.ref.WeakReference;

public class Utilisateur extends Personne {
	private int id;
	private String email;
	private String motdepasse;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMotdepasse() {
		return motdepasse;
	}
	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}
	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", email=" + email + ", motdepasse=" + motdepasse + "]";
	}
	public Utilisateur(String nom, String prenom, int id, String email, String motdepasse) {
		super(nom, prenom);
		this.id = id;
		this.email = email;
		this.motdepasse = motdepasse;
	}

	public Utilisateur(int id, String nom, String prenom, String email) {
		super(nom, prenom);
		this.id = id;
		this.email = email;
	}

	
}
