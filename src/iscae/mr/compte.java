package iscae.mr;

public class compte  {
	public int NCompte;
	public double montant;
	public client proprietaire;
	
	public int getNCompte() {
		return NCompte;
	}
	public void setNCompte(int nCompte) {
		NCompte = nCompte;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public client getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(client proprietaire) {
		this.proprietaire = proprietaire;
	}
	
	
	

}
