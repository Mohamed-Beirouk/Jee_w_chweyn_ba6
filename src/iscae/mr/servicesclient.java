package iscae.mr;

import java.util.ArrayList;
import java.util.Map;

public class servicesclient {
	
	public static Map<String, client> clients = memoire.getClients();
	
	public String verser(String id, double montant){
		client c = clients.get(id);
		c.setSolde(c.getSolde()+montant);
		return c.getIdentifiant() + " a debuter son compte avec un montant de " + montant;
		
	}
	
	public String retrait(String id, double montant){
		client c = clients.get(id);
		if(c.getSolde()<montant){
			return "le montant que vous voulez retirer est superieur au solde";
		}
		c.setSolde(c.getSolde()-montant);
		return c.getIdentifiant() + " le retrait est fait avec succes " + montant;
		
	}
	
	
	public String transfert(String id_debiteur, String id_crediteur, double montant){
		client debit = clients.get(id_debiteur);
		client credit = clients.get(id_crediteur);
		if(credit.getSolde()< montant){
			return "le montant que vous voulez transferer est superieur au solde";
		}
		
		debit.setSolde(montant+debit.getSolde());
		credit.setSolde(credit.getSolde()-montant);
		return montant+ "a ete bien transferer";
	}



}



