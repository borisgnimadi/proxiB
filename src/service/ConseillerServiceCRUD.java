package service;

import java.util.List;

import dao.ConseillerDao;
import model.Conseiller;
import model.Personne;

public class ConseillerServiceCRUD implements UserServiceCRUD<Conseiller> {
	
	ConseillerDao dao = new ConseillerDao();

	@Override
	public void create(Conseiller p) {
		dao.create(p);
		
	}

	@Override
	public Conseiller findByUsername(String name) {
		return dao.findByUsername(name);
	}

	@Override
	public void update(Conseiller user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Conseiller findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		 dao.delete(id);
		
	}

	@Override
	public List<Conseiller> findAll() {
		// TODO Auto-generated method stub
		 return dao.findAll();
	}


}
