import javax.swing.*;
import java.sql.*;
import java.sql.DriverManager;

public class ConexionSQL {

	Connection conectar = null;

	public Connection conexion() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginTicket", "root", "123");
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null,"ERROR de Conexión con la Base de Datos" + e.getMessage());
		}
		return conectar;
	}
}
