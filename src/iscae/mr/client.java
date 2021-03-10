package iscae.mr;

public class client {
	
	private String nom;
	private String prenom;
	private String identifiant;
	private String motDePasse;
	private int NCompte;
	private double solde;
	
	public client(){
		
	}
	
	
	public client(String nom, String prenom, String identifiant, String motDePasse, int nCompte, double solde) {
		this.nom = nom;
		this.prenom = prenom;
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
		this.NCompte = nCompte;
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
	public int getNCompte() {
		return NCompte;
	}
	public void setNCompte(int nCompte) {
		NCompte = nCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	

	
	
	

}
