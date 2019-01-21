package dao;

import java.sql.*;
import java.sql.Connection;

public abstract class AbstractDaoJdbc {

	// @Ressource(name="dataScource"")
	// private DataSource ds;

	protected static void close(Connection cn, java.sql.PreparedStatement st, ResultSet rs) {

		try {
			if (cn != null)
				cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (st != null)
				st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (rs != null)
				rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnetion() throws ClassNotFoundException, SQLException {

		Connection cn;
        String urlDB = "jdbc:mysql://localhost:3306/proxibanque_bolau";
        String userDB = "root";
        String passwordDB = "";
        
        System.out.println();
        cn = DriverManager.getConnection(urlDB, userDB, passwordDB);
//        cn.setAutoCommit(false);
        return cn;

	}
}
