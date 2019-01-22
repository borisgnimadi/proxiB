package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.*;

/**
 * Ajout de connseiller 
 * @author Adminl
 *
 */
public class ConseillerDao extends AbstractDaoJdbc implements UserDao <Conseiller>{

	@Override
	public void create(Conseiller cons) {

System.out.println(cons);
		try {
			Connection cn = AbstractDaoJdbc.getConnetion();

			String req = "INSERT INTO users (nom,prenom,email,password)  VALUES (?, ?, ?, ?)";
			PreparedStatement st = AbstractDaoJdbc.getConnetion().prepareStatement(req);
			st.setString(1, cons.getNom());
			st.setString(2, cons.getPrenom());
			st.setString(3, cons.getEmail());
			st.setString(4, cons.getMotdepasse());

			st.execute();

			System.out.println("un conseiller ajouté avec succès !");
			AbstractDaoJdbc.close(cn, st, null);

		} catch (Exception e) {
			System.err.println("Erreur : Pas d'insertion de conseiller !");
			e.printStackTrace();

		}
		
	}

	@Override
	public Conseiller findByUsername(String name) {
		// TODO Auto-generated method stub
		return null;
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
		try {
		Connection cn = AbstractDaoJdbc.getConnetion();

		String req = "DELETE FROM users WHERE id = ?";
		PreparedStatement st = AbstractDaoJdbc.getConnetion().prepareStatement(req);
		st.setInt(1, id);

		st.execute();

		System.out.println("une ligne a été supprimé !");
		AbstractDaoJdbc.close(cn, st, null);

	} catch (Exception e) {
		System.err.println("Erreur : Pas de suppression !");
		e.printStackTrace();

	}		
	}

	@Override
	public List<Conseiller> findAll() {
		List<Conseiller> allPerson = new ArrayList<>();
		try {
			Connection cn = AbstractDaoJdbc.getConnetion();
			String req = "SELECT * FROM users ";
			PreparedStatement st = AbstractDaoJdbc.getConnetion().prepareStatement(req);
			ResultSet rs = st.executeQuery(req);
				
			while (rs.next()) {
				Integer id = rs.getInt("id");
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String email = rs.getString("email");
				Conseiller conseiller = new Conseiller(id, prenom, nom, email);
				allPerson.add(conseiller);
			}
			AbstractDaoJdbc.close(cn, st, rs);
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println("Problème de connexion !");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allPerson;
	}



}
