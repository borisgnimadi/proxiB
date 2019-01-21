package model;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class Gerant extends Personne {
	private ArrayList<Conseiller> conseillers = new ArrayList<>();
	private WeakReference<Agence> agenceRef;

	public Gerant() {
		super("Boss", "Big");
	}

	public ArrayList<Conseiller> getConseillers() {
		return conseillers;
	}
	

	public Agence getAgence() {
		return agenceRef.get();
	}

	public void setAgence(Agence agence) {
		this.agenceRef = new WeakReference<Agence>(agence);
	}
}
