package dao;

import java.util.ArrayList;
import java.util.List;

import model.Client;

public class ClientRepository {
	// simulacre de table SQL (contient en mémoire la liste de tous les clients)
	private static ArrayList<Client> clients;
	
	public static List<Client> getClientsByName(String name) {
		List<Client> namedClients = new ArrayList<Client>();
		for(Client client : clients) {
			if(client.getNom().equals(name)) {
				namedClients.add(client);
			}
		}
		return namedClients;
	}
	
	public static Client getClientById(int id) {
		if(id > 0 || id <= clients.size()) {
			return clients.get(id-1);
		}
		return null;
	}
}
