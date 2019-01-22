/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.*;

/**
 *
 * @author Adminl
 */

public interface UserDao <T>{
	
	public void create(T p);
	public Integer findIdByUsername(String nom, String prenom);	
	public void update(T user);
	public T findById(int id);
	public void delete(int id);
	public List<T> findAll();

}