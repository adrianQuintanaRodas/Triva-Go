package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SentenciasBBDD {
	static java.sql.Statement stmt = null;
	static java.sql.Connection cn;
	static ArrayList<Hotel> lista;

	public ArrayList <Hotel> visualizarCiudad(String ubicacion) {
		
		ConsultasBBDD mysql = new ConsultasBBDD();
		cn = mysql.conectarmySQL();
		ResultSet rs;
		lista = new ArrayList<Hotel>();

		String query = "Select nombre,precio from hotel where ubicacion='" + ubicacion + "'";
		try {
			stmt = cn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				String nombre = rs.getString("nombre");
				double precio = rs.getDouble("precio");

				Hotel h = new Hotel(nombre, precio);
				lista.add(h);
			}

			stmt.close();
		} catch (Exception e) {
			e.getMessage();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return lista;
	}
}