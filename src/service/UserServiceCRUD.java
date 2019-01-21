package service;

import java.util.List;

import model.Personne;

public interface UserServiceCRUD {
	
	public void create(Personne p);
	public Personne findByUsername(String name);	
	public void update(Personne user);
	public Personne findById(int id);
	public void delete(int id);
	public List<Personne> findAll();


}
