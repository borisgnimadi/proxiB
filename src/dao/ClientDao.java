package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Client;
import model.Conseiller;
import model.Personne;

public class ClientDao extends AbstractDaoJdbc implements UserDao {

	@Override
	public void create(Personne p) {
		Client cl = (Client) p;

		try {
			Connection cn = AbstractDaoJdbc.getConnetion();

			String req = "INSERT INTO client (nom,prenom,telephone,adresse,ville," + " code_postal) "
					+ " VALUES ( ?, ?, ?, ?, ?, ?)";
			PreparedStatement st = AbstractDaoJdbc.getConnetion().prepareStatement(req);
			st.setString(1, cl.getNom());
			st.setString(2, cl.getPrenom());
			/*
			 * st.setString(3, p.getPhone()); st.setString(4, p.getAdresse());
			 * st.setString(5, p.getVille()); st.setInt(6, p.getCodePostal());
			 */
			st.setString(3, cl.getTelephone());
			st.setString(4, cl.getAdresse());
			st.setString(5, cl.getVille());
			st.setInt(6, cl.getCode_postal());

			st.execute();

			System.out.println("une ligne inserée avec succès !");
			AbstractDaoJdbc.close(cn, st, null);

		} catch (Exception e) {
			System.err.println("Erreur : Pas d'insertion de conseiller !");
			e.printStackTrace();

		}

	}

	@Override
	public Client findByUsername(String name) {
		try {
			Connection cn = AbstractDaoJdbc.getConnetion();

			String req = "SELECT * FROM client WHERE firstname LIKE '%" + name + "%' ";
			PreparedStatement st = AbstractDaoJdbc.getConnetion().prepareStatement(req);
			ResultSet rs = st.executeQuery(req);
			while (rs.next()) {
				Client client = new Client(rs.getString("nom"), rs.getString("prenom"), rs.getString("adresse"),
						rs.getString("ville"), rs.getInt("	code_postal"), rs.getString("phone"),
						rs.getBoolean("isEntreprise"));
				return client;
			}

			System.out.println("une ligne trouvée avec succès !");
			AbstractDaoJdbc.close(cn, st, null);
		} catch (Exception e) {
			System.err.println("Erreur : pas de réponse");

		}

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
		List<Personne> allPerson = new ArrayList<>();
		try {
			Connection cn = AbstractDaoJdbc.getConnetion();
			String req = "SELECT * FROM client ";
			PreparedStatement st = AbstractDaoJdbc.getConnetion().prepareStatement(req);
			ResultSet rs = st.executeQuery(req);

			while (rs.next()) {
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String phone = rs.getString("telephone");
				Client client = new Client(prenom, nom, phone, phone, 0, phone);
				allPerson.add(client);
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
