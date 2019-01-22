package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Client;
import model.Utilisateur;

public class ClientDao extends AbstractDaoJdbc implements UserDao<Client> {

	@Override
	public void create(Client p) {

		try {
			Connection cn = AbstractDaoJdbc.getConnetion();

			String req = "INSERT INTO client (nom,prenom,telephone,adresse,ville, code_postal,id_users,isEntreprise) "
					+ " VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement st = AbstractDaoJdbc.getConnetion().prepareStatement(req);
			st.setString(1, p.getNom());
			st.setString(2, p.getPrenom());
			st.setString(3, p.getTelephone());
			st.setString(4, p.getAdresse());
			st.setString(5, p.getVille());
			st.setInt(6, p.getCode_postal());
			st.setInt(7, p.getRefConseiller());
			st.setBoolean(8, p.getIsEntreprise());

			st.execute();

			System.out.println("un client inseré avec succès !");
			AbstractDaoJdbc.close(cn, st, null);

		} catch (Exception e) {
			System.err.println("Erreur : Pas d'insertion de client !");
			e.printStackTrace();

		}

	}

	@Override
	public Integer findIdByUsername(String nom, String prenom) {

		Integer id = null;
		try {
			Connection cn = AbstractDaoJdbc.getConnetion();

			String req = "SELECT * FROM client WHERE nom LIKE '%" + nom + "%' AND  prenom LIKE '%" + prenom + "%' ";
			PreparedStatement st = AbstractDaoJdbc.getConnetion().prepareStatement(req);
			ResultSet rs = st.executeQuery(req);
			while (rs.next()) {
				id = rs.getInt("id");
			}

			System.out.println("une ligne trouvée avec succès !");
			AbstractDaoJdbc.close(cn, st, null);
		} catch (Exception e) {
			System.err.println("Erreur : pas de réponse");

		}

		return id;
	}

	/*
	 * Actualise le client
	 * 
	 * @see dao.UserDao#update(java.lang.Object)
	 */
	@Override
	public void update(Client c) {
		try {
			Connection cn = AbstractDaoJdbc.getConnetion();

			String req = "UPDATE client "
					+ "SET nom = ?, prenom = ?, telephone = ?, adresse = ?, ville = ?, code_postal = ?, isEntreprise=? WHERE id=?";

			PreparedStatement st = AbstractDaoJdbc.getConnetion().prepareStatement(req);
			st.setString(1, c.getNom());
			st.setString(2, c.getPrenom());
			st.setString(3, c.getTelephone());
			st.setString(4, c.getAdresse());
			st.setString(5, c.getVille());
			st.setInt(6, c.getCode_postal());
			st.setBoolean(7, c.getIsEntreprise());
			st.setInt(8, c.getId());

			st.execute();

			System.out.println("un client a été actualisé avec succès !");
			AbstractDaoJdbc.close(cn, st, null);

		} catch (Exception e) {
			System.err.println("Erreur : Pas de maj de client !");
			e.printStackTrace();

		}
	}

	@Override
	public Client findById(int id) {
		Client person = null;
		try {
			Connection cn = AbstractDaoJdbc.getConnetion();
			String req = "SELECT * FROM client WHERE id = '" + id + "'";
			PreparedStatement st = AbstractDaoJdbc.getConnetion().prepareStatement(req);
			ResultSet rs = st.executeQuery(req);

			while (rs.next()) {
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String adresse = rs.getString("adresse");
				String ville = rs.getString("ville");
				int code_postal = rs.getInt("code_postal");
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
				int id = rs.getInt("id");
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String adresse = rs.getString("adresse");
				String ville = rs.getString("ville");
				int code_postal = rs.getInt("code_postal");
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

	public void depotFondSurCompte(int numCompte, Double montant, String nom, String prenom) {
		System.out.println("test"+findIdByUsername(nom, prenom));
		try {
			Connection cn = AbstractDaoJdbc.getConnetion();
			String req = "INSERT INTO compte (numero,solde,id_client) " + " VALUES ( ?, ?, ?)";
			PreparedStatement st = AbstractDaoJdbc.getConnetion().prepareStatement(req);
			st.setInt(1, numCompte);
			st.setDouble(2, montant);
			st.setInt(3, findIdByUsername(nom, prenom));

			st.execute();

			System.out.println("un compte inseré avec succès !");
			AbstractDaoJdbc.close(cn, st, null);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erreur création de compte");
		}

	}
}
