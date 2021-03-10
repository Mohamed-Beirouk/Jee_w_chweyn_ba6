package iscae.mr;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Services {
	
	public static Map<String, client> clients = memoire.getClients();
	
	public String addClient(client c){
		clients.put(c.getIdentifiant(), c);
		return c.getNom()+" is added with success";
	}
	
	public List<client> allClients() {
		return new ArrayList<client>(clients.values());
	}
	
	public client getClient(String id){
		client c = clients.get(id);
		return c; 
	}
	
	public String versement(String id, double montant){
		client c = clients.get(id);
		c.setSolde(c.getSolde()+montant);
		return c.getIdentifiant() + " a ete debite d'un montant de " + montant;
		
	}
	
	public String retrait(String id, double montant){
		client c = clients.get(id);
		if(c.getSolde()<montant){
			return "solde inssufisant";
		}
		c.setSolde(c.getSolde()-montant);
		return c.getIdentifiant() + " a ete credite d'un montant de " + montant;
		
	}
	
	public String deleteClient(String id){
		client c = clients.remove(id);
		return c.getIdentifiant()+" a ete supprimer";
	}
	
	public String transfertArgent(String id_debiteur, String id_crediteur, double montant){
		client debit = clients.get(id_debiteur);
		client credit = clients.get(id_crediteur);
		if(credit.getSolde()< montant){
			return "solde inssufisant";
		}
		
		debit.setSolde(montant+debit.getSolde());
		credit.setSolde(credit.getSolde()-montant);
		return montant+ "a ete transferer avec success";
	}

}
