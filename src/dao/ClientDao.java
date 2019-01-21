package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import model.Client;
import model.Personne;

public class ClientDao extends AbstractDaoJdbc implements UserDao {

	@Override
	public void create(Personne p) {
		System.out.println("test dans DAO : " + p);

		try {
			Connection cn = AbstractDaoJdbc.getConnetion();

			String req = "INSERT INTO client (nom,prenom,phone,adresse,ville,"
					+ " code_postal,CompteCourant,CompteEpargne,typeCarteBancaire) "
					+ " VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement st = AbstractDaoJdbc.getConnetion().prepareStatement(req);
			st.setString(1, null);
			st.setString(2, null);
			/*
			 * st.setString(3, p.getPhone()); st.setString(4, p.getAdresse());
			 * st.setString(5, p.getVille()); st.setInt(6, p.getCodePostal());
			 */
			st.setString(3, null);
			st.setString(4, null);
			st.setString(5, null);
			st.setInt(6, 0);
			st.setString(7, null);
			st.setString(8, null);
			st.setString(9, null);


			st.execute();

			AbstractDaoJdbc.close(cn, st, null);
			System.out.println("une ligne inserée avec succès !");
			;
		} catch (Exception e) {
			System.err.println("Erreur : Pas d'insertion !");

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
		// TODO Auto-generated method stub
		return null;
	}

}
