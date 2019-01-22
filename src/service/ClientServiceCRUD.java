package service;

import java.util.List;

import dao.ClientDao;
import dao.ConseillerDao;
import model.Client;
import model.Personne;

public class ClientServiceCRUD implements UserServiceCRUD <Client>{
	
	ClientDao dao = new ClientDao();

	@Override
	public void create(Client p) {
		if(p!=null) {
		dao.create(p);
	}		
	}

	@Override
	public Client findByUsername(String name) {
		return dao.findByUsername(name);	}

	@Override
	public void update(Client user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public void delete(int id) {
		dao.delete(id);		
	}

	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	


}
