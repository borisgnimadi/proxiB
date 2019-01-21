/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;

import model.Personne;

/**
 *
 * @author Adminl
 */

public interface UserDao {
	
	public void create(Personne p);
	public Personne findByUsername(String name);	
	public void update(Personne user);
	public Personne findById(int id);
	public void delete(int id);
	public List<Personne> findAll();

}