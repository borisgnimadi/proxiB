package service;

import dao.UserDaoLogin;
import model.Utilisateur;

/**
 * Elle g�re le login du user 
 * @author user
 *
 */
public class Login {
	
	/**
	 * methode appel�e pour le login
	 * @param email
	 * @param password
	 * @return
	 */
	public static Utilisateur login(String email, String password) {

		return UserDaoLogin.findByEmailPSW(email,password);
		
	}

}
