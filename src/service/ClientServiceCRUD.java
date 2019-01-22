package service;

import java.util.List;

import dao.ClientDao;
import model.Client;

public class ClientServiceCRUD implements UserServiceCRUD <Client>{
	
	ClientDao dao = new ClientDao();

	@Override
	public void create(Client p) {
		if(p!=null) {
		dao.create(p);
	}		
	}

	@Override
	public Integer findIdByUsername(String nom, String prenom) {
		return dao.findIdByUsername(nom, prenom);	}

	@Override
	public void update(Client cl) {
		dao.update(cl);	
		
	}

	@Override
	public Client findById(int id) {
		return dao.findById(id);
	}

	@Override
	public void delete(int id) {
		dao.delete(id);		
	}

	@Override
	public List<Client> findAll() {
		return dao.findAll();
	}

	
	public void depotFondSurCompte(int numCompte, Double montant, String nom, String prenom) {
		dao.depotFondSurCompte(numCompte, montant, nom, prenom);		
	}


}
