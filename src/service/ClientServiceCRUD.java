package service;

import java.util.List;

import dao.ClientDao;
import dao.ConseillerDao;
import model.Personne;

public class ClientServiceCRUD implements UserServiceCRUD {
	
	ClientDao dao = new ClientDao();

	@Override
	public void create(Personne p) {
		if(p!=null) {
			dao.create(p);
		}		
	}

	@Override
	public Personne findByUsername(String name) {
		// TODO Auto-generated method stub
		return dao.findByUsername(name);
	}

	@Override
	public void update(Personne user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Personne findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public void delete(int id) {
		dao.delete(id);
		
	}

	@Override
	public List<Personne> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
