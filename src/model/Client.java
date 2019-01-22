package model;

public class Client extends Personne {
	private Integer id;
	private String adresse;
	private String ville;
	private int code_postal;
	private String telephone;
	private CompteCourant compteCourant;
	private CompteCourant compteEpargne;
	private boolean isEntreprise;
	private int refConseiller;

	public Client(String nom, String prenom, String adresse, String ville, int code_postal, String telephone) {
		this(nom, prenom, adresse, ville, code_postal, telephone, false);
	}
	
	public Client(Integer id, String nom, String prenom, String adresse, String ville, int code_postal, String telephone, boolean isEntreprise) {
		super(nom, prenom);
		this.adresse = adresse;
		this.ville = ville;
		this.code_postal = code_postal;
		this.telephone = telephone;
		this.isEntreprise = isEntreprise;
		this.id = id;
	}

	public Client(String nom, String prenom, String adresse, String ville, int code_postal, String telephone, boolean isEntreprise) {
		super(nom, prenom);
		this.adresse = adresse;
		this.ville = ville;
		this.code_postal = code_postal;
		this.telephone = telephone;
		this.isEntreprise = isEntreprise;
	}

	public Client(String nom, String prenom, String adresse, String ville, int code_postal, String telephone, boolean isEntreprise, int refConseiller) {
		super(nom, prenom);
		this.adresse = adresse;
		this.ville = ville;
		this.code_postal = code_postal;
		this.telephone = telephone;
		this.isEntreprise = isEntreprise;
		this.refConseiller = refConseiller;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(int code_postal) {
		this.code_postal = code_postal;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

	public CompteCourant getCompteEpargne() {
		return compteEpargne;
	}

	public void setCompteEpargne(CompteCourant compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

	public boolean getIsEntreprise() {
		return isEntreprise;
	}

	public void setIsEntreprise(boolean isEntreprise) {
		this.isEntreprise = isEntreprise;
	}



	public int getRefConseiller() {
		return refConseiller;
	}

	public void setRefConseiller(int refConseiller) {
		this.refConseiller = refConseiller;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ",prénom=" + prenom + ",adresse=" + adresse + ", ville=" + ville + ", code_postal=" + code_postal + ", telephone="
				+ telephone + ", compteCourant=" + compteCourant + ", compteEpargne=" + compteEpargne
				+ ", isEntreprise=" + isEntreprise + ", conseillerRef="
				+ refConseiller + "]";
	}

	
}
