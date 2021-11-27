package iscae.mr;

public class admin {
	
	private String identifiant;
	private String motdepasse;
	
	public admin(){
		
	}
	
	
	public admin(String id, String password){
		this.identifiant=id;
		this.motdepasse=password;
	}
	
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public String getMotDePasse() {
		return motdepasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motdepasse = motDePasse;
	}
	
	
	

}
