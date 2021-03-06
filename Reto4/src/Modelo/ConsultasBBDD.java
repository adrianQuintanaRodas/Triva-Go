package Modelo;

import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;

public class ConsultasBBDD {
	static Connection cn;
	/* LibreryamySQL */
	public String driver = "com.mysql.jdbc.Driver";
	// Nombre de la bbdd
	public static String database = "triva-go";
	// Host
	public static String hostname = "localhost";
	// Puerto
	public static String port = "3306";
	// Rueta de nuestra bbdd
	public static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";
	// nombre de usuario y contraseņa
	public static String username = "root";
	public static String password = "";

	// metodo de conexion
	public Connection conectarmySQL() {
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url, username, password);
			JOptionPane.showMessageDialog(null, "Conectado con exito");
		} catch (ClassNotFoundException | SQLException e) {
			JOptionPane.showMessageDialog(null, "Error de accesso a BBDD\n se procere a cerrar");
			System.exit(0);

		}
		return conn;

	}

}