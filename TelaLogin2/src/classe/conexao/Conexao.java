package classe.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static Connection faz_conexao() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/db_senhas","root","");
		} catch (ClassNotFoundException e) {
			 throw new SQLException(e.getMessage());
			
			// TODO: handle exception
		}
		
	}
}




