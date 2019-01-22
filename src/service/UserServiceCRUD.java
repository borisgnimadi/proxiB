package service;

import java.util.List;

import model.Personne;

public interface UserServiceCRUD <T>{
	
	public void create(T p);
	public Integer findIdByUsername(String nom, String prenom);	
	public void update(T user);
	public T findById(int id);
	public void delete(int id);
	public List<T> findAll();


}
