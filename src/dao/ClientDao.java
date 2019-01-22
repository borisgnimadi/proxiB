package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Client;
import model.Utilisateur;


public class ClientDao extends AbstractDaoJdbc implements UserDao <Client> {

	@Override
	public void create(Client p) {

		try {
			Connection cn = AbstractDaoJdbc.getConnetion();

			String req = "INSERT INTO client (nom,prenom,telephone,adresse,ville," + " code_postal,id_users) "
					+ " VALUES ( ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement st = AbstractDaoJdbc.getConnetion().prepareStatement(req);
			st.setString(1, p.getNom());
			st.setString(2, p.getPrenom());
			/*
			 * st.setString(3, p.getPhone()); st.setString(4, p.getAdresse());
			 * st.setString(5, p.getVille()); st.setInt(6, p.getCodePostal());
			 */
			st.setString(3, p.getTelephone());
			st.setString(4, p.getAdresse());
			st.setString(5, p.getVille());
			st.setInt(6, p.getCode_postal());
			st.setInt(7, p.getRefConseiller());

			st.execute();

			System.out.println("un client inseré avec succès !");
			AbstractDaoJdbc.close(cn, st, null);

		} catch (Exception e) {
			System.err.println("Erreur : Pas d'insertion de client !");
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
	public void update(Client user) {
		// TODO Auto-generated method stub

	}

	@Override
	public Client findById(int id) {
		Client person = null;
		try {
			Connection cn = AbstractDaoJdbc.getConnetion();
			String req = "SELECT * FROM client WHERE id = '"+id+"'";
			PreparedStatement st = AbstractDaoJdbc.getConnetion().prepareStatement(req);
			ResultSet rs = st.executeQuery(req);

			while (rs.next()) {
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String adresse = rs.getString("adresse");
				String ville = rs.getString("ville");
				int code_postal= rs.getInt("code_postal");
				String phone = rs.getString("telephone");
				person = new Client(id, nom, prenom, adresse, ville, code_postal, phone, false);
			}
			AbstractDaoJdbc.close(cn, st, rs);
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println("Problème de connexion !");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return person;
	}

	@Override
	public void delete(int id) {
		try {
		Connection cn = AbstractDaoJdbc.getConnetion();

		String req = "DELETE FROM client WHERE id = ?";
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
	public List<Client> findAll() {
		List<Client> allPerson = new ArrayList<>();
		try {
			Connection cn = AbstractDaoJdbc.getConnetion();
			String req = "SELECT * FROM client ";
			PreparedStatement st = AbstractDaoJdbc.getConnetion().prepareStatement(req);
			ResultSet rs = st.executeQuery(req);

			while (rs.next()) {
				int id= rs.getInt("id");
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String adresse = rs.getString("adresse");
				String ville = rs.getString("ville");
				int code_postal= rs.getInt("code_postal");
				String phone = rs.getString("telephone");
				Client client = new Client(id, nom, prenom, adresse, ville, code_postal, phone, false);
				
					
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
