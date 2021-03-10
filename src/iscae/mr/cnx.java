package iscae.mr;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/con")
@Produces("application/json")
public class cnx {

	@GET 
	@Produces(MediaType.TEXT_HTML)
	public String connexionAdmin(@QueryParam("identifiant") String identifiant,
			@QueryParam("motdepasse") String motdepasse) {
		
		
		//si l'utilisateur n'existe pas.
		if(!memoire.getMyMap().containsKey(identifiant))
			return "("+identifiant+"): Cet identifiant n'existe pas.";
		
		
		if (motdepasse.equals(memoire.getMyMap().get(identifiant))) {
			memoire.connecter(identifiant);
			
			return "Bienvenue "+identifiant+", connexion avec succes";
		} else {
			return "Erreur de connexion. Mot de passe incorect";
		}
		
	}

}