package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import model.*;

public class ConseillerDao extends AbstractDaoJdbc implements UserDao {

	@Override
	public void create(Personne p) {
System.out.println("creation de conseiller"+p);

		try {
			Connection cn = AbstractDaoJdbc.getConnetion();

			String req = "INSERT INTO users (nom,prenom,email)  VALUES ( ?, ?, ?)";
			PreparedStatement st = AbstractDaoJdbc.getConnetion().prepareStatement(req);
			st.setString(1, p.getNom());
			st.setString(2, p.getPrenom());
			st.setString(3, p.getPrenom());

			st.execute();

			System.out.println("une ligne inserée avec succès !");
		AbstractDaoJdbc.close(cn, st, null);
			;
			
			

			
		} catch (Exception e) {
			System.err.println("Erreur : Pas d'insertion !");
			e.printStackTrace();


		}

	}

	@Override
	public Personne findByUsername(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Personne user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Personne findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Personne> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
