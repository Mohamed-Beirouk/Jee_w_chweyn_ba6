package iscae.mr;

import java.util.HashMap;
import java.util.Map;

public class memoire {
	
	private static Map<String, client> clients = new HashMap<>();
	public static Map<String, client> getClients(){
		clients.put("1",new client("mohamed","beirouk","1","1234",1,125000));
		
		return clients;
	}
	
	private static Map<String, String> users = new HashMap<>();
	
	public static Map<String,String> getMyMap(){
		users.put("user", "1");
		return users;
	}
	
	
	private static Map<String, String> connectionState = new HashMap<>();
	
	public static Map<String,String> getConState(){
		return connectionState;
	}
	
	public static void connecter(String user){
		connectionState.put(user, "1");
	}
	

	public static boolean isConnected( String user ){
		if(connectionState.get(user) == null) return false;
		if(connectionState.get(user).equals("1"))
			return true;
		else
			return false;
	}
	
	
}
