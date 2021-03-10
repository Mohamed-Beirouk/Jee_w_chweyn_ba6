package iscae.mr;

public class admin {
	
	private String identifiant;
	private String motDePasse;
	
	public admin(){
		
	}
	
	
	public admin(String id, String password){
		this.identifiant=id;
		this.motDePasse=password;
	}
	
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
	
	

}
