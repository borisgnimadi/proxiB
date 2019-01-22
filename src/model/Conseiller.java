package model;


public class Conseiller extends Personne {
	private String email;
	private Integer id;
	private String motdepasse;
	
	public Conseiller() {
		super("nom","prenom");
	}

	  //Constructeur d'initialisation du conseiller
	  public Conseiller(Integer id, String nom, String prenom, String email, String motdepasse){
	    super(nom, prenom);
	    this.email = email;
	    this.id = id;
	    this.motdepasse=motdepasse;
	  }    

	  public Conseiller(Integer id, String nom, String prenom, String email){
		    super(nom, prenom);
		    this.email = email;
		    this.id = id;
		  }    

	  
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Conseiller [id=" + id + ",nom=" + nom + ",prenom=" + prenom + ", email=" + email + "]";
	}

	public String getMotdepasse() {
		return motdepasse;
	}

	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}


	

	
}
