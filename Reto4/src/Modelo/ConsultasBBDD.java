package Modelo;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConsultasBBDD {
	static Connection cn;
	/*LibreryamySQL*/
	public String driver="com.mysql.jdbc.Driver";
	//Nombre de la bbdd
	public static String database="triva-go";
	//Host
	public static String hostname="localhost";
	//Puerto
	public static String port="3306";
	//Rueta de nuestra bbdd
	public static String url="jdbc:mysql://"+hostname+":"+port+"/"+database+"?useSSL=false";
	//nombre de usuario y contraseña
	public static String username="root";
	public static  String password="";
	
	//metodo de conexion
	public Connection conectarmySQL() {
		Connection conn=null;
		try {
			Class.forName(driver);
			conn= (Connection) DriverManager.getConnection(url, username, password);
		System.out.println("Conectado");
			} catch (ClassNotFoundException|SQLException e) {
				e.printStackTrace();

			}
		return conn;
		
	}
	
	
	

}