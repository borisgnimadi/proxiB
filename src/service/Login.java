package service;

import dao.UserDaoLogin;

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
	public static boolean login(String email, String password) {
		boolean reponseLogin = false;
		if(UserDaoLogin.findByEmailPSW(email,password)!=null) {
			reponseLogin=true;

		}
//		if(email.equals("test@proxi.bk")&&password.equals("test")) {
//			reponseLogin=true;
//		}
		return reponseLogin;
		
	}

}
