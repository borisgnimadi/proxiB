package service;

import dao.UserDaoLogin;
import model.Utilisateur;

/**
 * Elle gère le login du user 
 * @author user
 *
 */
public class Login {
	
	/**
	 * methode appelée pour le login
	 * @param email
	 * @param password
	 * @return
	 */
	public static Utilisateur login(String email, String password) {

		return UserDaoLogin.findByEmailPSW(email,password);
		
	}

}
