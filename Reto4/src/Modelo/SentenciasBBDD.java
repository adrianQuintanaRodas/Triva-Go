package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Modelo.ConsultasBBDD;
import Modelo.Hotel;

public class SentenciasBBDD {
	static java.sql.Statement stmt = null;
	static java.sql.Connection cn;
	static ArrayList<Hotel> lista;

	public static ArrayList visualizarCiudad(String ubicacion) {

		ConsultasBBDD mysql = new ConsultasBBDD();
		cn = mysql.conectarmySQL();
		ResultSet rs;
		lista = new ArrayList<Hotel>();

		String query;
		query = "Select nombre,precio from hotel where ubicacion='" + ubicacion + "'";
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return lista;

	}

	public static String SacarNombre(String ubicacion) {

		ConsultasBBDD mysql = new ConsultasBBDD();
		cn = mysql.conectarmySQL();
		ResultSet rs;
		String nombre = null;

		String query;
		query = "Select nombre from hotel where ubicacion='" + ubicacion + "'";
		try {
			stmt = cn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				nombre = rs.getString("nombre");
			}

			stmt.close();
		} catch (Exception e) {
			e.getMessage();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return nombre;

	}

	public static String SacarEstrellas(String ubicacion) {

		ConsultasBBDD mysql = new ConsultasBBDD();
		cn = mysql.conectarmySQL();
		ResultSet rs;
		String estrellas = null;

		String query;
		query = "Select estrellas from hotel where ubicacion='" + ubicacion + "'";
		try {
			stmt = cn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				estrellas = rs.getString("estrellas");
			}

			stmt.close();
		} catch (Exception e) {
			e.getMessage();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return estrellas;

	}

	public static Double SacarPrecio(String ubicacion) {

		ConsultasBBDD mysql = new ConsultasBBDD();
		cn = mysql.conectarmySQL();
		ResultSet rs;
		Double precio = null;

		String query;
		query = "Select precio from hotel where ubicacion='" + ubicacion + "'";
		try {
			stmt = cn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				precio = rs.getDouble("precio");
			}

			stmt.close();
		} catch (Exception e) {
			e.getMessage();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return precio;

	}

	public static Double CalcularPrecio(Double precio, String huespedes, String Nnoches) {

		Double preciofinal = null;
		preciofinal = precio * Integer.parseInt(huespedes) * Integer.parseInt(Nnoches);
		return preciofinal;

	}

}