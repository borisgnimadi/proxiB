package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Utilisateur;

public class UserDaoLogin extends AbstractDaoJdbc  {


	public static Utilisateur findByEmailPSW(String email, String password) {
		Utilisateur person = null;
		System.out.println(email);
		System.out.println(password);
		try {
			Connection cn = AbstractDaoJdbc.getConnetion();
			String req = "SELECT * FROM users WHERE email= '"+email+"' AND password = '"+password+"'";
			PreparedStatement st = AbstractDaoJdbc.getConnetion().prepareStatement(req);
			ResultSet rs = st.executeQuery(req);

			while (rs.next()) {
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				int id = rs.getInt("id");
				person = new Utilisateur(id, nom, prenom, email);
				System.out.println(person);
				System.out.println(id);
			}
			AbstractDaoJdbc.close(cn, st, rs);
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println("Probl�me de connexion !");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return person;
	}

}
