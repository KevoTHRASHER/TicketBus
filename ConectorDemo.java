import java.sql.*;

public class ConectorDemo {
  public static void main(String[] args) throws SQLException, ClassNotFoundException {
    // Load the JDBC driver
    Class.forName("org.mariadb.jdbc.Driver");
    System.out.println("Driver Cargado");

    // Try to connect
    Connection connection = DriverManager.getConnection
      ("jdbc:mysql://localhost:3306/LoginTicket", "root", "123");

    System.out.println("Driver Funciona Correctamente");

    connection.close();
  }
}
