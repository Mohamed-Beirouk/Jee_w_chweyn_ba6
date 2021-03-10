	package iscae.mr;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/admin")
public class AdminController {
	
	static Services service = new Services();
	
	@PUT
	@Path("ajouterClient")
	public String addClient(client c){
		return service.ajouterClient(c);
	}
	
	@GET
	@Path("afficherClients")
	public List<client> allClients(){
		return service.afficherClients();
	}
	
	@GET
	@Path("afficherClientUnique/{id}")
	public client afficherClientUnique(@PathParam("id") String id){
		return service.afficherClientUnique(id);
	}
	
	@GET
	@Path("client/transfert/{montant}/from/{id_crediteur}/to/{id_debiteur}")
	public String transfertArgent(@PathParam("id_crediteur") String id_crediteur, @PathParam("id_debiteur") String id_debiteur, @PathParam("montant") double montant){
		return service.transfert(id_debiteur, id_crediteur, montant);
	}
	
	@GET
	@Path("client/{id}/versement/{montant}")
	public String verser(@PathParam("id") String id, @PathParam("montant") double montant){
		return service.verser(id, montant);
	}
	
	@GET
	@Path("client/{id}/retrait/{montant}")
	public String retrait(@PathParam("id") String id, @PathParam("montant") double montant){
		return service.retrait(id, montant);
	}
	
	@DELETE
	@Path("client/delete/{id}")
	public String supprimerClient(@PathParam("id") String id){
		return service.supprimerClient(id);
	}

}
