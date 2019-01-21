package model;


public class Conseiller extends Personne {
	private String email;

	public Conseiller() {
		super("nom","prenom");
	}

	  //Constructeur d'initialisation de capitale
	  public Conseiller(String nom, String prenom, String email){
	    super(nom, prenom);
	    this.email = email;
	  }    

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Conseiller [nom=" + nom + ",prenom=" + prenom + ", email=" + email + "]";
	}
	

	
}
