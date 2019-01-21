package model;

import java.lang.ref.WeakReference;
import java.util.Date;

public abstract class Compte {
	private int numero;
	private float solde;
	private Date ouverture;
	public WeakReference<Client> clientRef;

	public Compte(int numero) {
		this(numero, 0.0f, new Date());
	}
	public Compte(int numero, float solde, Date ouverture) {
		super();
		this.numero = numero;
		this.solde = solde;
		this.ouverture = ouverture;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public Date getOuverture() {
		return ouverture;
	}

	public void setOuverture(Date ouverture) {
		this.ouverture = ouverture;
	}

	public Client getClient() {
		return clientRef.get();
	}

	public void setClient(Client client) {
		this.clientRef = new WeakReference<Client>(client);
	}
}
