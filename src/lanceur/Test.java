package lanceur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import dao.AbstractDaoJdbc;
import dao.ClientDao;
import dao.ConseillerDao;
import model.Client;
import model.Conseiller;
import model.Personne;
import service.ClientServiceCRUD;
import service.ConseillerServiceCRUD;

public class Test {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
//		ClientDao daocl = new ClientDao();
		ConseillerDao daoCon = new ConseillerDao();
//		Client client = daocl.findByUsername("i");
//		System.out.println("client trouvé : "+client);
//		Personne cl = new Client("gnimadi", "Aubin Boris", "test1",  "test2", 0,  "test3");
		//Personne con = new Conseiller("testMain", "Aubin Boris", "test1");
		
		
//		daocl.create(cl);
//try {
//	daoCon.create(con);
//	
//} catch (Exception e) {
//	System.out.println("Erreur insetion !");
//}
//		ConseillerServiceCRUD condao = new ConseillerServiceCRUD();
//
//condao.findAll(); 


		ClientServiceCRUD daoClient = new ClientServiceCRUD();

			Client c2 = new Client("toto", "boris", 
					"test", 
					"test", 
					0, 
					"test", 
					true
					);
			daoClient.create(c2);		
		System.out.println();
		
	}

}
